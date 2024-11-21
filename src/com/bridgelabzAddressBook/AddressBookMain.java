package com.bridgelabzAddressBook;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book ");

        AddressBook addressBook = new AddressBook();

        System.out.println("Enter the contact details:");

        System.out.println("Enter the first name:");
        String firstName = sc.next();
        System.out.println("Enter the last name:");
        String lastName = sc.next();
        System.out.println("Enter the address:");
        String address = sc.next();
        System.out.println("Enter the city:");
        String city = sc.next();
        System.out.println("Enter the state:");
        String state = sc.next();
        System.out.println("Enter the zip code:");
        String zip = sc.next();
        System.out.println("Enter the phone no:");
        String phoneNumber = sc.next();
        System.out.println("Enter the email:");
        String email = sc.next();
        Details d = new Details(firstName, lastName, address, city, state, email, phoneNumber, zip);

        ArrayList<Details> contactList = addressBook.contactList(d);
        for (Details contact : contactList) {
            System.out.println(contact.getFirstName() + " " + contact.getLastName() + " " + contact.getAddress() + " " + contact.getCity() +
                    " " + contact.getState() + " " + contact.getEmail() + " " + contact.getPhoneNumber() + " " + contact.getZip());
        }
        System.out.println("\nDo you want to edit a contact? (yes/no)");
        String choice = sc.next();
        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("Enter the first name of the contact to edit:");
            String editFirstName = sc.next();
            System.out.println("Enter the last name of the contact to edit:");
            String editLastName = sc.next();
            addressBook.editContact(editFirstName, editLastName);
        }
        System.out.println("\nDo you want to delete a contact? (yes/no)");
        choice = sc.next();
        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("Enter the first name of the contact to delete:");
            String deleteFirstName = sc.next();
            System.out.println("Enter the last name of the contact to delete:");
            String deleteLastName = sc.next();
            addressBook.deleteContact(deleteFirstName, deleteLastName);
        }
    }
}