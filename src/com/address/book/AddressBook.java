package com.address.book;
import java.util.Scanner;
public class AddressBook {
	
	public static void main(String[] args) {
		//print massage
		System.out.println("Welcome to Address Book Program");
		//create object
		PersonInfo personDetail = new PersonInfo();
		System.out.println("Enter '1'to add person detail"); //choices for operation
		Scanner sc = new Scanner(System.in);	
		int choice = sc.nextInt();
		//switch case for choice
		switch (choice){
		case 1:
			//add person detail
			personDetail.addContacts();
			System.out.println("Contact Added Successfully!");
			break;
		default:
			System.out.println("Please Enter Valid Choice:");
			break;
		}
	}
}
