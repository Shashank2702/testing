//declare and initialize a variable in Java
public class VariableExample {
    public static void main(String[] args) {
        int number = 10;
        String greeting = "Hello, Java!";
        System.out.println("Number: " + number);
        System.out.println("Greeting: " + greeting);
    }
}

// conditional statements in Java
public class ConditionalExample {
    public static void main(String[] args) {
        int number = -5; // Example number
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println\("The number is negative.");
        } else {\
            System.out.println("The number is zero.");
        }
    }
}
// create and use a constructor in Java
public class Book {
    String title;
    String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method
    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        // Create an object of the Book class using the constructor
        Book myBook = new Book("Java Programming", "John Do
        myBook.displayInfo();
    }
}
// create an array and access its elements
public class ArrayExample {
    public static void main(String[] args) {
      
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
// switch statement in Java\
public class SwitchExample {
    public static void main(String[] args) {
        int day = 3; 

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
                break;
        }
    }
}
