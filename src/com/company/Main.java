package com.company;
import java.util.*;
import java.io.*;
import javax.xml.bind.SchemaOutputResolver;

public class Main {

    public static void main(String[] args) {



        System.out.println("Please enter your name.");
        Scanner stringReader = new Scanner(System.in);


        perfectRandom userData = new perfectRandom();
        userData.userName = stringReader.nextLine();


        System.out.println("Nice to meet you " + userData.userName + "! Your lucky number is " + userData.perfectRandom() + ".");






    }
}
