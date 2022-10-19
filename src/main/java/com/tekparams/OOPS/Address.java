package com.tekparams.OOPS;

public class Address {
    // Data Members (or) Variables (or) Instance Variables
    String doorNo;
    String street;
    String city;
    int pin;

    void printAddress(){
        System.out.println("\n"+doorNo+"\n"+street+"\n"+city+"\n"+pin);
    }

    // Dafault Constructor
    Address(){
        doorNo="D100";
        street="ABC Street";
        city="Bangalore";
        pin=78242;
    }

    // Parameterized constructor
    Address(String doorNo,String street,String city, int pin){
        this.doorNo=doorNo;
        this.street=street;
        this.city=city;
        this.pin=78242;
    }

    public static void main(String[] args){
        Address address = new Address();
        address.printAddress();
        //System.out.println();
        Address address1 = new Address("D200","XYZ Street","Bangalore",50938);
        address1.printAddress();
    }
}
