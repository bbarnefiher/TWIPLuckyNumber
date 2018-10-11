package com.company;
import java.util.*;
import java.io.*;
import javax.xml.bind.SchemaOutputResolver;

public class Main {

    public static void main(String[] args) {
        int userInput = -1;

        while (userInput != 0) {

            System.out.println("Please enter your name.");
            Scanner stringReader = new Scanner(System.in);


            perfectRandom userData = new perfectRandom();
            userData.userName = stringReader.nextLine();

            int userLuckyNumber = userData.perfectRandom();
            System.out.println("Nice to meet you " + userData.userName + "! Your lucky number is " + userLuckyNumber + ".");

            while (true) {
                System.out.println("Press 0 to exit. \nPress 1 for a listing of the name and their lucky number again. \nPress 2 to enter another name.");

                Scanner intReader = new Scanner(System.in);
                userInput = intReader.nextInt();
                if (userInput == 1) {
                    System.out.println("Name: " + userData.userName + ". \nLucky number: " + userLuckyNumber + ".");

                }
                else if (userInput == 2 || userInput == 0){
                    break;
                }
                else {
                    System.out.println("Sorry, I do not know what you mean.");
                }
            }
        }
        System.exit(0);
    }
}
