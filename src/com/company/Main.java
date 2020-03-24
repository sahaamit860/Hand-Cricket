package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(" * Hand Cricket *"+
                "\nPress 1: For Batting"+
                "\nPress 2: For Bowling"+
                "\nPress 3: To exit the game"+
                "\n______________________________________________");

        Scanner sc = new Scanner(System.in);
        int user,comp;
        boolean exit=false;
        while (!exit){
            System.out.println("\n*** Select a Choice ***");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    user=batting();
                    System.out.println("your score is: "+user);
                    comp=bowling();
                    System.out.println("Computer score is: "+comp);
                    if (user>comp){
                        System.out.println("Your score is: "+user);
                        System.out.println("You won!!!!");
                    }else if(user<comp){
                        System.out.println("Your score is: "+user);
                        System.out.println("Sorry! you lose");
                    }else{
                        System.out.println("Your score is: "+user);
                        System.out.println("Match draw!!!!");
                    }
                    break;
                case 2:
                    comp=bowling();
                    System.out.println("Computer score is: "+comp);
                    user=batting();
                    System.out.println("Your score is: "+user);
                    if (user>comp){
                        System.out.println("Computer score is: "+comp);
                        System.out.println("You won!!!!");
                    }else if(user <comp){
                        System.out.println("Computer score is: "+comp);
                        System.out.println("Sorry! you lose");
                    }else{
                        System.out.println("Computer score is: "+comp);
                        System.out.println("Match draw!!!!");
                    }
                    break;
                case 3:
                    exit=true;
                    break;
                default:
                    System.out.println("Enter a correct choice");
                    break;
            }
        }
    }

    private static int batting() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int user,comp,result=0;
        boolean exit=false;
        System.out.println("You are batting");
        while (!exit){
            user=sc.nextInt();
            if (user>6){
                user=0;
                exit=true;
            }
            comp=random.nextInt(7);
            System.out.println(comp);
            if (user==comp){

                exit=true;
            }else{
                result+=user;
            }
        }
        return result;
    }

    private static int bowling() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        boolean exit=false;
        int user,comp,result=0;
        System.out.println("You are bowling");
        while (!exit){
            user=sc.nextInt();
            comp=random.nextInt(7);
            System.out.println(comp);
            if (user==comp){

                exit=true;
            }else{
                result+=comp;
            }
        }
        return result;
    }
}
