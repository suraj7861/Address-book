package com.address.book;
import java.util.Scanner;
public class AddressBook {
	
	public static void main(String[] args) {
		// print message
		System.out.println("Welcome to Address Book Program");
		
		//create object 
		PersonInfo person = new PersonInfo();
	    
		System.out.println("Address Book Menu!");
        System.out.println("Enter '1'to add person detail");//choices for operation
        Scanner sc = new Scanner(System.in);		
        int choice = sc.nextInt();
        //swith case for choise
        switch (choice){
            case 1:
            	//add contact
            	person.addContacts();
                System.out.println("Contact Added Successfully!");
                break;
            default:
                System.out.println("Please Enter Valid Choice:");
                break;
        }
	}
}
