package com.address.book;
import java.util.Scanner;
public class AddressBook {
	
	public static void main(String[] args) {
		// print message
		System.out.println("Welcome to Address Book Program");
		PersonInfo person = new PersonInfo();
		
		System.out.println("Address Book Menu!!");
        System.out.println("1.Add contact");//choices for operation
        System.out.print("enter choice:");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice){
            case 1:
            	person.addContacts();
                System.out.println("Contact Added Successfully!");
                break;
            default:
                System.out.println("Please Enter Valid Choice:");
                break;
        }
	
	}

}
