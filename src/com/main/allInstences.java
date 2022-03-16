package com.main;

import static com.main.EpisodeFinder.EpisodeFinder;
import static com.main.NumOfEps.randomEps;

public class allInstences {
    public static void main(String[] args) {
        String EpisodeFinder = EpisodeFinder();
        System.out.println(EpisodeFinder);
    }

    public static String EpisodeFinderS(){
        final String eps = EpisodeFinder();
        return eps;
    }
    public static String EpisodeFinderM(){
        final String eps = EpisodeFinderS();
        System.out.println(eps);
        return eps;
    }

    //public





}
