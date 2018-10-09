package com.company;

import java.util.Scanner;

/**
 * Created by bb222 on 10/9/18.
 */
public class perfectRandom {

    public String userName = "";
    public int perfectRandom(){

        double luckyNumber = 0;

        luckyNumber = (int)Math.ceil(Math.random()*77);

        luckyNumber = Math.pow(luckyNumber, 2);

        int luckyNumberInt = (int)luckyNumber;

        return luckyNumberInt;
    }




}
