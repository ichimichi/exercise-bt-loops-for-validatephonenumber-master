package com.stackroute.basics;

import java.util.Scanner;

public class PhoneNumberValidator {
    //Create Scanner object as instance variable
    private Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        //call the functions in the required sequence
        PhoneNumberValidator phNumVal = new PhoneNumberValidator();
        phNumVal.displayResult(
                phNumVal.validatePhoneNumber(phNumVal.getInput())
        );
        phNumVal.closeScanner();

    }

    public String getInput() {
        return scn.nextLine();
    }

    public void displayResult(int result) {
        switch (result) {
            case 1: {
                System.out.println("Valid");
                break;
            }
            case 0: {
                System.out.println("Invalid");
                break;
            }
            default: {
                System.out.println("Empty String");
            }
        }

    }

    public int validatePhoneNumber(String input) {
        int countDigits = 0;

        if(input.length()==0 || input==null)
            return -1;

        for(char ch: input.toCharArray()){
            if(ch=='-'){
                continue;
            }
            else {
                if(ch=='0'||ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'){
                    countDigits++;
                }
                else{
                    return 0;
                }
            }
        }

        if(countDigits==10){
            return 1;
        }
        return 0;

    }

    public void closeScanner() {
        scn.close();
    }
}
