package com.address.book;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonInfo {
	//ArrayList to store person detail 
	ArrayList<Contacts> personInfo;
	Scanner sc = new Scanner(System.in);
	
	//constructor
    PersonInfo(){
    	personInfo = new ArrayList<Contacts>();
    }
    
    //method: to add contact
    public void addContacts() {
        String firstName,lastName, address, city, zip, phoneNumber, email;
        System.out.println("Enter First Name: ");
        firstName = sc.next();
        
        System.out.println("Enter LastName: ");
        lastName = sc.next();
        
        System.out.println("Enter Address: ");
        address = sc.next();
        
        System.out.println("Enter city: ");
        city = sc.next();
        
        System.out.println("Enter zip: ");
        zip = sc.next();
        
        System.out.println("Enter Phone Number: ");
        phoneNumber = sc.next();
        
        System.out.println("Enter Email Id: ");
        email = sc.next();
        
        //contact class object
        Contacts contact= new Contacts(firstName,lastName, address, city, zip, phoneNumber, email, email);
        personInfo.add(contact);
        //get person detail
        for(int i=0;i<personInfo.size();i++)
        {
            System.out.println(personInfo.get(i));
        }
    }
	
	public void editContacts() {
		System.out.println("Enter the person name you want to edit person detail:");
		String enterName = sc.next();
		//flag to check enter name 
		boolean flag = false;
		//for each loop: 
		for (Contacts person : personInfo) {
			//check entered name is equal or not 
			if(person.firstName.equals(enterName) ) {
				flag = true;
				System.out.println("1. First Name\n" + "2.Last Name\n" + "3.Address\n" + "4.city\n" + "5.State\n" + "6.zip\n" + "7.phoneNumber\n" + "8.email");
				int choice = sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Enter first name : "); // First name
					String editFirstName = sc.next();
					person.firstName = editFirstName;
					break;
				case 2:
					System.out.println("Enter last name : "); //Last name
					String editLastName = sc.next();
					person.lastName = editLastName;
					break;
				case 3:
					System.out.println("Enter address : "); //Address
					String editAddress = sc.next();
					person.address = editAddress;
					break;
				case 4:
					System.out.println("Enter city : "); //City 
					String editCity = sc.next(); 
					person.city = editCity;
					break;
				case 5:
					System.out.println("Enter state : "); // State
					String editState = sc.next();
					person.state = editState;
					break;
				case 6:
					System.out.println("Enter zip : "); // Zip
					String editZip = sc.next();
					person.zip = editZip;
					break;
				case 7:
					System.out.println("Enter phone number : "); //Phone number
					String editPhoneNumber = sc.next();
					person.phoneNumber = editPhoneNumber;
					break;
				case 8:
					System.out.println("Enter email : "); // Email
					String editEmail = sc.next();
					person.email = editEmail;
					break;
				default:
					System.out.println("Enter valid number ");
				
				}
				break;
			}					
		}
		//flag false for name not found
		if(flag == false) {
			System.out.println("etered name not found ");
		}	
	}
		
		//method: Delete person detail
		public void deleteContact() {
			System.out.println("Enter a name you want to delete:");
			String enterName = sc.next();
			boolean flag = false;
			for (Contacts person : personInfo) {
				if(person.firstName.equals(enterName)){
					flag =true;
					personInfo.remove(person);	//remove person contact
					break;
				}
			}
			//person name not found
			if(flag == false) {
				System.out.println("etered name not found ");
			}
			
		}	
}
