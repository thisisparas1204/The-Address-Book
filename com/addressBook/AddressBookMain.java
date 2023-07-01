package com.addressBook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {

        System.out.println("Welcome to the Address Book.");
        Scanner input = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        int option;

        do {
            System.out.println("Enter the option.");
            System.out.println("1.Add contact. \n2.Get the contacts. \n3.Delete a contact. \n4.Edit a contact. \n5.Exit.");
            option = input.nextInt();
            switch (option) {
                case 1 -> addressBook.setContacts();
                case 2 -> addressBook.getContact();
                case 3 -> addressBook.deleteContact();
                case 4 -> addressBook.editContact();
                case 5 -> System.out.println("Exits.");
                default -> System.out.println("Invalid option.");

            }
        } while (option != 5);

        input.close();
    }
}
