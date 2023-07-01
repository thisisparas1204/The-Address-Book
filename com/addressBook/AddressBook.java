package com.addressBook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    Scanner input = new Scanner(System.in);
    List<Contacts> list = new ArrayList<>();

    // to add new contact to the address book.
    public void setContacts() {
        Contacts contacts = new Contacts();
        System.out.println("Enter the name.");
        contacts.setFirstName(input.next());
        System.out.println("Enter the last name.");
        contacts.setLastName(input.next());
        System.out.println("Enter the address.");
        contacts.setAddress(input.next());
        System.out.println("Enter the city.");
        contacts.setCity(input.next());
        System.out.println("Enter the state.");
        contacts.setState(input.next());
        System.out.println("Enter the zip.");
        contacts.setZip(input.next());
        System.out.println("Enter the mobile number.");
        contacts.setMobNo(input.next());
        System.out.println("Enter the email.");
        contacts.setEmail(input.next());
        list.add(contacts);
    }

    // to display all the contacts.
    public void getContact() {
        if (list.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }
        for (Contacts contacts : list) {
            System.out.println(contacts);
        }
    }

    // to delete a contact based on first name.
    public void deleteContact() {
        System.out.println("Enter the first name.");
        String name = input.next();
        boolean isFound = false;

        Iterator<Contacts> iterate = list.iterator();

        while (iterate.hasNext()) {
            Contacts contacts = iterate.next();
            if (name.equalsIgnoreCase(contacts.getFirstName())) {
                isFound = true;
                iterate.remove();
            }
        }

        /*
        * this will throw an exception: ConcurrentModificationException as we're using enhanced for loop for removal purpose during iteration.
        for (Contacts contacts : list) {
            if (name.equals(contacts.getFirstName())) {
                isFound = true;
                list.remove(contacts);
            }
        }
        */
        if (isFound) {
            System.out.println("Contact has been successfully deleted.");
        } else {
            System.out.println("Contact is not available.");
        }
    }

    // to modify a contact based on first name.
    public void editContact() {
        System.out.println("Enter the first name.");
        String name = input.next();
        boolean isFound = false;

        for (Contacts contacts : list) {
            if (name.equalsIgnoreCase(contacts.getFirstName())) {
                isFound = true;
                System.out.println("1.Edit first name.\n 2.Edit mobile number.\n 3.Edit Address.");
                int option = input.nextInt();
                switch (option) {
                    case 1 -> {
                        System.out.println("Enter the first name.");
                        contacts.setFirstName(input.next());
                    }
                    case 2 -> {
                        System.out.println("Enter the Mobile number.");
                        contacts.setMobNo(input.next());
                    }
                    case 3 -> {
                        System.out.println("Enter the address.");
                        contacts.setAddress(input.next());
                    }
                    default -> System.out.println("Invalid option.");
                }
            }
        }

        if (isFound) {
            System.out.println("Contact is successfully updated.");
        } else {
            System.out.println("Contact is not found.");
        }

    }
}
