package com.modules;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Random;

public class NumOfEps {
    public static void main(String[] args) throws IOException { //this is here just for keepsake

        //System.out.println("THe name: " +  NameOfShow() + "\n" + "Episode Count: " + NumOfEps());

    }

    //Always same
    //GETTING NUMBER OF EPISODES FROM SELECTED SHOW
    public static String NumOfEps(String website) throws IOException { //getting the number of eps

        Document document; //initiating a Document instance

        //getting connection to website
        document = Jsoup.connect(website).userAgent("Chrome/19.0.1042.0").timeout(10000).get();
        //Getting the number of episodes element
        Element elements = document.getElementById("curEps");

        return elements.text(); //returning the number of episodes in a Sting class
    }




    //GETTING NAME OF SELECTED SHOW
    public static String NameOfShow(String website) throws IOException {

        Document document;//initiating a Document instance

        //Getting connection to website
        document = Jsoup.connect(website).userAgent("Chrome/19.0.1042.0").timeout(10000).get();
        //Getting the name of the show
        Elements elements = document.getElementsByClass("title-name h1_bold_none");

        return elements.text(); //returning the name of the show
    }




    public static int randomEps(String NumOfEps){

        try{
            //turning the sting number of episoeds to a integer
            int number = Integer.parseInt(NumOfEps);

            //initiating a random sequence
            Random rnd = new Random();

            //getting a random episode number
            int eps = rnd.nextInt(number+1);

            if (eps == 0 /*|| eps == -1*/){ //Safety block
                eps = eps + 1;
            }

            //returning the selected episode number
            return eps;
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
            //well shit...
            System.out.println("well shit...");
            return 0;
        }
    }
}
