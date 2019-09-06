package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " , was not found.");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }

        }
        return -1;
    }

//    boolean quit = false;
//    int options = 0;
//
//        while(!quit)
//
//    {
//        displayOptions();
//        System.out.println("Enter menu options: ");
//        options = scanner.nextInt();
//        scanner.nextLine();
//
//        switch (options) {
//            case 0:
//                displayOptions();
//                break;
//            case 1:
//                storeContact();
//                break;
////                case 2:
////                    modifyName();
////                    break;
////                case 3:
////                    removeName();
////                    break;
//            case 4:
//                findName();
//                break;
////                case 5:
////                    quit = true;
////                    break;
//        }
//    }
//
//}
//
//    public static void displayOptions() {
//        System.out.println("\n Press 0 - Options:");
//        System.out.println("\t Press 1 - Crete new Contact.");
//        System.out.println("\t Press 2 - Modify Contact name.");
//        System.out.println("\t Press 3 - Remove contact.");
//        System.out.println("\t Press 4 - Find contact.");
//        System.out.println("\t Press 5 - Quit options.");
//    }
//
//    public static void storeContact() {
//        System.out.println("Enter contact name: ");
//        String name = scanner.nextLine();
//        System.out.println("Enter contact phone number: ");
//        int phoneNumber = scanner.nextInt();
//        scanner.nextLine();
//        contact.addContact(name, phoneNumber);
//        System.out.println("You created new contact " + name + " -> " + phoneNumber);
//    }
////
////    public static void modifyName() {
////        System.out.println("Enter position of contact what you want modify: ");
////        String position = (scanner.nextLine());
////        scanner.nextLine();
////        System.out.println("Enter new name for contact: ");
////        String newName = scanner.nextLine();
////        contact.modifyName(position, newName);
////
////    }
//
//    public static void findName() {
//        System.out.println("Enter contact name: ");
//        String name = scanner.nextLine();
//        contact.findName(name);
//    }
}
