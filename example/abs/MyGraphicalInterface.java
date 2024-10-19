package com.example.abs;

interface Button {
    void onClick();
}

interface ComboBox {
    void checkChanged();
}

class Application {
    Button button;
    ComboBox comboBox;

    public Application(Button button, ComboBox comboBox) {
        this.button = button;
        this.comboBox = comboBox;
    }

    void operateOnApp() {
        button.onClick();
        comboBox.checkChanged();
    }
}

public class MyGraphicalInterface {
    public static void main(String[] args) {
        // Creating an instance of Application with anonymous classes
        Application app1 = new Application(new Button() {
            public void onClick() {
                System.out.println("The button has been clicked");
            }
        }, new ComboBox() {
            public void checkChanged() {
                System.out.println("The checkbox has been changed");
            }
        });

        // Operating on the application
        app1.operateOnApp();  // Call the method to see the output
    }
}
