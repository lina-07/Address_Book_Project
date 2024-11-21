package com.bridgelabzAddressBook;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain
{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book ");

        AddressBook addressBook = new AddressBook();
        while (true) {

            System.out.println("\nChoose an option:");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            switch (choice) {

                case 1:

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
                    System.out.println("Contact added successfully!");
                    break;

                case 2:
                    System.out.println("Current Contacts:");
                    for (Details contact : addressBook.contactList) {
                        System.out.println(contact.getFirstName() + " " + contact.getLastName() + " " + contact.getAddress() + " " + contact.getCity() +
                                " " + contact.getState() + " " + contact.getEmail() + " " + contact.getPhoneNumber() + " " + contact.getZip());
                    }
                    break;


                case 3:

                    System.out.println("Enter the first name of the contact to edit:");
                    String editFirstName = sc.next();
                    System.out.println("Enter the last name of the contact to edit:");
                    String editLastName = sc.next();
                    addressBook.editContact(editFirstName, editLastName);
                    break;

                case 4:
                    System.out.println("Enter the first name of the contact to delete:");
                    String deleteFirstName = sc.next();
                    System.out.println("Enter the last name of the contact to delete:");
                    String deleteLastName = sc.next();
                    addressBook.deleteContact(deleteFirstName, deleteLastName);
                    break;

                case 5:
                    System.out.println("Exiting Address Book. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");

            }
        }
    }
}