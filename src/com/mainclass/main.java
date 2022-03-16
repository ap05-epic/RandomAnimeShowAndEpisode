package com.mainclass;

import java.io.IOException;
import java.net.URISyntaxException;

import static com.modules.NumOfEps.*;
import static com.modules.goToWebsite.opener;
import static com.modules.urlMaker.URL;

import static com.modules.EpisodeFinder.EpisodeFinder;

public class main {
    public static String EpisodeFinderM = EpisodeFinder();
    public static int randomEpsN; static {
        try {
            randomEpsN = randomEps(NumOfEps(EpisodeFinderM));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {



        System.out.println("\nThe name: " +  NameOfShow(EpisodeFinderM) + "\n" + "Episode Count: " + NumOfEps(EpisodeFinderM));
        Thread.sleep(2000);
        //System.out.println("\nNow opening a random episode in 5 seconds)");
        System.out.println("\nNow opening episode: " + randomEpsN + "/" + NumOfEps(EpisodeFinderM) /*+  " in 5 seconds)"*/);
        Thread.sleep(5000);
        opener(URL());


    }
}
