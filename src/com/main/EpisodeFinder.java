package com.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class EpisodeFinder {

    public static void main(String[] args) throws NoSuchElementException, FileNotFoundException {

        //This just lives here no use please move on to the methods

        System.out.println(EpisodeFinder());

        //System.out.println(eps.length);

        System.exit(69);

        //String text = readString();

        //System.out.println(text);

    }



    //Giving a random link from the text file
    public static String EpisodeFinder(){

        String[] eps = epsList("watched.txt");
        int result = new Random().nextInt(eps.length);
        return eps[result];

    }





    //MAKING A ARRAY OF ALL SHOWS
    public static String[] epsList(String file){

        int ctr = 0; //Starting to find the amount of lines
        try {
            File f = new File(file); //calling text file
            Scanner scf = new Scanner(f);
            while (scf.hasNextLine()){
                ctr = ctr+1; //checking amount of lines
                scf.nextLine();//Moving to next line to scan (without this we will be stuck)
            }

            String[] eps = new String[ctr]; //initialising new array with already counted lines "ctr"

            Scanner scf2 = new Scanner(new File(file)); //reinstating all links
            for (int i = 0; i < ctr; i = i + 1){
                eps[i] = scf2.next(); //storing links into "eps" array
            }
            //returning the link/website of the show
            return eps;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;

    }




    //RANDOMLY SELECTING A ELEMENT FORM A ARRAY
    public static int getRanEps(int[] array){

        int result = new Random().nextInt(array.length); //RANDOMLY SELECTING A LINK

        //returning the selected link
        return array[result];
    }


/*
    public static String readString() throws FileNotFoundException {

        File f = new File("watched.txt");
        Scanner scf = new Scanner(f);

        String text = "watched.txt";

        while (scf.hasNextLine()){

            text = text + scf.next() + "\n" ;

        }

        return text;
    }


*/




/*
    public static String[] epsList() throws NoSuchElementException, FileNotFoundException { //fileNotFoundException so it stops crying

        int ctr = 0; //Starting to find the amount of lines

        File f = new File("watched.txt"); //calling text file
        Scanner scf = new Scanner(f);
        while (scf.hasNextLine()){
            ctr = ctr+1; //checking amount of lines
            //scf.nextLine();
        }

        String[] eps = new String[ctr]; //initialising new array with already counted lines "ctr"

        Scanner scf2 = new Scanner(new File("watched.txt")); //reinstating all links
        for (int i = 0; i < ctr; i = i++){

            eps[i] = scf2.next(); //storing links into "eps" array

        }

        return eps;

    }
*/






    /*
        File f = new File("NEWEXPORTgrp.txt");
        Scanner scf = new Scanner(f);
        while (scf.hasNext() ){
            String record = scf.nextLine();
            //WATCH THE VID YA DUMMY

        }
        */
    //System.out.println("Hello World!");
    // }}
//}

}