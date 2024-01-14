package com.mainClass;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;

import static com.modules.NumOfEps.*;
import static com.modules.goToWebsite.opener;
import static com.modules.urlMaker.URL;

import static com.modules.EpisodeFinder.EpisodeFinder;
import static java.lang.System.exit;

public class main {

    public static String txtPath() {//PUT txt PATH ⌄
        String path = "PATH/export.txt";//PUT txt PATH HERE
        return path;//PUT txt PATH ^
    }

    public static String EpisodeFinderM;

    static {
        EpisodeFinderM = EpisodeFinder();
    }

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
        exit(69);

    }
}
