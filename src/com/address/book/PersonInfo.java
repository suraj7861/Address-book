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
}
