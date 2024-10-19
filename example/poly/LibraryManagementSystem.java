package com.example.poly;

import java.util.ArrayList;
import java.util.Scanner;

abstract class LibraryMaterial {
    String title;
    String author;
    int year;
    boolean isAvailable;

    public LibraryMaterial(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }

    public void checkOut() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been checked out.");
        } else {
            System.out.println(title + " is currently unavailable.");
        }
    }

    public void returnMaterial() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }

    public abstract void displayDetails();
}

class Book extends LibraryMaterial {
    String genre;
    int numberOfPages;

    public Book(String title, String author, int year, String genre, int numberOfPages) {
        super(title, author, year);
        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Pages: " + numberOfPages);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Checked Out"));
    }
}

class Magazine extends LibraryMaterial {
    String issue;
    String frequency;

    public Magazine(String title, String author, int year, String issue, String frequency) {
        super(title, author, year);
        this.issue = issue;
        this.frequency = frequency;
    }

    @Override
    public void displayDetails() {
        System.out.println("Magazine Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Issue: " + issue);
        System.out.println("Frequency: " + frequency);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Checked Out"));
    }
}

class DVD extends LibraryMaterial {
    int duration; // in minutes
    String director;

    public DVD(String title, String author, int year, int duration, String director) {
        super(title, author, year);
        this.duration = duration;
        this.director = director;
    }

    @Override
    public void displayDetails() {
        System.out.println("DVD Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Year: " + year);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Availability: " + (isAvailable ? "Available" : "Checked Out"));
    }
}

class Library {
    private ArrayList<LibraryMaterial> materials;

    public Library() {
        materials = new ArrayList<>();
    }

    public void addMaterial(LibraryMaterial material) {
        materials.add(material);
        System.out.println("Material added: " + material.title);
    }

    public void displayAllMaterials() {
        for (LibraryMaterial material : materials) {
            material.displayDetails();
            System.out.println();
        }
    }

    public LibraryMaterial searchByTitle(String title) {
        for (LibraryMaterial material : materials) {
            if (material.title.equalsIgnoreCase(title)) {
                return material;
            }
        }
        return null; // not found
    }

    public void displayAvailableMaterials() {
        for (LibraryMaterial material : materials) {
            if (material.isAvailable) {
                material.displayDetails();
                System.out.println();
            }
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. Add DVD");
            System.out.println("4. Display All Materials");
            System.out.println("5. Search by Title");
            System.out.println("6. Display Available Materials");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String bookAuthor = scanner.nextLine();
                    System.out.print("Enter Year: ");
                    int bookYear = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Genre: ");
                    String bookGenre = scanner.nextLine();
                    System.out.print("Enter Number of Pages: ");
                    int numberOfPages = scanner.nextInt();
                    library.addMaterial(new Book(bookTitle, bookAuthor, bookYear, bookGenre, numberOfPages));
                    break;
                case 2:
                    System.out.print("Enter Magazine Title: ");
                    String magazineTitle = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String magazineAuthor = scanner.nextLine();
                    System.out.print("Enter Year: ");
                    int magazineYear = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Issue: ");
                    String magazineIssue = scanner.nextLine();
                    System.out.print("Enter Frequency: ");
                    String magazineFrequency = scanner.nextLine();
                    library.addMaterial(new Magazine(magazineTitle, magazineAuthor, magazineYear, magazineIssue, magazineFrequency));
                    break;
                case 3:
                    System.out.print("Enter DVD Title: ");
                    String dvdTitle = scanner.nextLine();
                    System.out.print("Enter Director: ");
                    String dvdDirector = scanner.nextLine();
                    System.out.print("Enter Year: ");
                    int dvdYear = scanner.nextInt();
                    System.out.print("Enter Duration (in minutes): ");
                    int duration = scanner.nextInt();
                    library.addMaterial(new DVD(dvdTitle, dvdDirector, dvdYear, duration, dvdDirector));
                    break;
                case 4:
                    library.displayAllMaterials();
                    break;
                case 5:
                    System.out.print("Enter Title to Search: ");
                    String searchTitle = scanner.nextLine();
                    LibraryMaterial foundMaterial = library.searchByTitle(searchTitle);
                    if (foundMaterial != null) {
                        foundMaterial.displayDetails();
                    } else {
                        System.out.println("Material not found.");
                    }
                    break;
                case 6:
                    library.displayAvailableMaterials();
                    break;
                case 7:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
        System.out.println("Exiting the Library Management System.");
    }
}
