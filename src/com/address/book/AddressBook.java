package com.address.book;
import java.util.Scanner;
public class AddressBook {
	
	public static void main(String[] args) {
		//print massage
		System.out.println("Welcome to Address Book Program");
		//create object
		PersonInfo personDetail = new PersonInfo();
		boolean flag = true;
		
		while(flag) {
			System.out.println("Enter 1.add person detail  2.Edit contact  3.Delete contact 4.Exit"); //choices for operation
			Scanner sc = new Scanner(System.in);	
			int choice = sc.nextInt();
			//switch case for choice
			switch (choice){
			case 1:
				//add person detail
				personDetail.addContacts();
				System.out.println("Contact Added Successfully!");
				personDetail.toPrint();
				break;
			case 2:
				personDetail.editContacts();
				System.out.println("Contact Edited Successfully!");
				personDetail.toPrint();
				break;
			case 3:
				personDetail.deleteContact();
				System.out.println("Contact delete Successfully!");
				break;
			case 4:
				flag = false;
				System.out.println("Exit");
				break;
			default:
				System.out.println("Please Enter Valid Choice:");
				break;
		}
		}
	}
}
