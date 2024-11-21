package com.bridgelabzAddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public ArrayList<Details> contactList = new ArrayList<>();

    public ArrayList<Details> contactList(Details d) {
        contactList.add(d);
        return contactList;
    }

    public void editContact(String firstName, String lastName) {
        boolean isContactFound = false;
        for (Details contact : contactList) {
            if (contact.getFirstName().equalsIgnoreCase(firstName) && contact.getLastName().equalsIgnoreCase(lastName)) {
                isContactFound = true;
                System.out.println("Contact found! Enter new details:");
                Scanner sc = AddressBookMain.sc; // Use the existing scanner
                System.out.println("Enter the new address:");
                contact.setAddress(sc.next());
                System.out.println("Enter the new city:");
                contact.setCity(sc.next());
                System.out.println("Enter the new state:");
                contact.setState(sc.next());
                System.out.println("Enter the new zip code:");
                contact.setZip(sc.next());
                System.out.println("Enter the new phone number:");
                contact.setPhoneNumber(sc.next());
                System.out.println("Enter the new email:");
                contact.setEmail(sc.next());
                System.out.println("Contact updated successfully!");
                break;
            }
        }
        if (!isContactFound) {
            System.out.println("No contact found with the given name.");
        }
    }

    public void deleteContact(String firstName, String lastName) {
        boolean isContactDeleted = false;
        for (Details contact : contactList) {
            if (contact.getFirstName().equalsIgnoreCase(firstName) && contact.getLastName().equalsIgnoreCase(lastName)) {
                contactList.remove(contact);
                isContactDeleted = true;
                System.out.println("Contact deleted successfully!");
                break;
            }
        }
        if (!isContactDeleted) {
            System.out.println("No contact found with the given name.");
        }
    }


}

