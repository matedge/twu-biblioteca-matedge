package com.twu.biblioteca;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Objects;


public class Biblioteca {

    public static void main(String[] args) {

        Biblioteca self = new Biblioteca();
        self.open();
        self.run();
    }

    private Book[] books = new Book[] {
            new Book(
                    "Hitchhiker's Guide to The Galaxy",
                    "Douglas Adams",
                    1978, false),

    };

    private String welcomeMessage = "Welcome to Biblioteca";

    private String menu =
            "L: List books" + "\n" + "C: Checkout book" + "\n" + "R: Return book" + "\n" + "Q: Quit";

    private String[] validInputs = new String[] {"L", "C", "R","Q"};


    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public String getMenu(){
        return menu;
    }

    public Book[] getBooks() {
        return books;
    }

    public String listBooks() {
        return Arrays.toString(books);
    }

    public void open() {
        System.out.println(getWelcomeMessage() + "\n\n" + getMenu());
    }

    public void run() {
        Scanner scan = new Scanner(System.in);
        String command = scan.next().substring(0, 1);
        while (!Objects.equals(command, "Q")) {
            proccessInput(command);
            command = scan.next().substring(0, 1);
        }
    }

    public void proccessInput(String command ) {
        System.out.println(command);
        if (Objects.equals (command, "L")) {
            System.out.println(listBooks());
        } else if (Objects.equals (command, "R")) {
            System.out.println("Return Book");
        } else if (Objects.equals (command, "C")) {
            System.out.println("Checkout Book");
        }
    }


}