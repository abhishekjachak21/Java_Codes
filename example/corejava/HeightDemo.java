package com.example.corejava;


class Height {
     int feet;
     int inches;

    // Constructor to initialize height
    public Height(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
//        normalize();
    }

//    // Method to normalize the height (e.g., 12 inches = 1 foot)
//    private void normalize() {
//        if (this.inches >= 12) {
//            this.feet += this.inches / 12;
//            this.inches = this.inches % 12;
//        }
//    }

    // Method to display height
    public void displayHeight() {
        System.out.println("Height: " + this.feet + " feet " + this.inches + " inches");
    }

    // Method to add two heights
    public Height addHeights(Height other) {
        int totalFeet = this.feet + other.feet;
        int totalInches = this.inches + other.inches;
        return new Height(totalFeet, totalInches);
        
//        Height sum = new sum()
        
    }

    public int compareHeights(Height other) {
        int thisTotalInches = this.toInches();
        int otherTotalInches = other.toInches();
        return Integer.compare(thisTotalInches, otherTotalInches);
    }

    public int toInches() {
        return (this.feet * 12) + this.inches;
    }
}

public class HeightDemo {
    public static void main(String[] args) {
        
    	Height height1 = new Height(5, 8); // 5 feet 8 inches
        Height height2 = new Height(6, 2); // 6 feet 2 inches

        height1.displayHeight();
        height2.displayHeight();

        Height combinedHeight = height1.addHeights(height2);
        System.out.print("Combined Height: ");   
        combinedHeight.displayHeight();  

        int comparison = height1.compareHeights(height2);
        if (comparison < 0) {
            System.out.println("Height 1 is shorter than Height 2.");
        } else if (comparison > 0) {
            System.out.println("Height 1 is taller than Height 2.");
        } else {
            System.out.println("Both heights are equal.");
        }

        // Convert to inches
        System.out.println("Height 1 in inches: " + height1.toInches());
        System.out.println("Height 2 in inches: " + height2.toInches());
    }
}
