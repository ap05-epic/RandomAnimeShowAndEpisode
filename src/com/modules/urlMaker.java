package com.modules;

import java.io.IOException;
import java.util.Locale;

import static com.modules.NumOfEps.*;
import static com.mainClass.main.*;

public class urlMaker {
    public static void main(String[] args) throws IOException {
        //dead space
    }


    //Making the URL
    public static String URL() throws IOException {

        String url = NameOfShow(EpisodeFinderM).toLowerCase(Locale.ROOT);


        url = url.replace("2nd season","2");
        url = url.replace(": "," ");
        url = url.replace(" - "," ");
        url = url.replace("!","");
        url = url.replace(".  ","");
        url = url.replace("","");
        url = url.replace(":"," ");
        url = url.replace(","," ");
        url = url.replace("high-school","highschool");
        url = url.replace(" - ","");
        url = url.replace("."," ");
        url = url.replace("re-zero","rezero");
        url = url.replace("  "," ");
        url = url.replace("(","");
        url = url.replace(")","");
        url = url.replace("","");
        url = url.replace("","");
        url = url.replace("","");
        url = url.replace("","");
        url = url.replace("","");
        url = url.replace("","");
        url = url.replace("","");
        url = url.replace(" ","-"); //main
        url = url.replace("IS--","");
        url = url.replace("?","");
        url = url.replace("re-zero","rezero");
        url = url.replace("hangyaku","lelouch");
        url = url.replace("2nd-season","2-part-2");
        url = url.replace("","");
        url = url.replace("","");
        url = url.replace("","");
        url = url.replace("","");




        //all this above is for weird scenarios

        //int epsNum = randomEpsM();

        /*
          SO this is adding the start of the link then the "url" which has the website modified
          to fit the searchbar THEN we are adding the "episode" boundary then finally
          we call the "randomEps" which calls "NumOfEps" which then calls "EpisodeFInder"
          dumming it down we are calling a random episode which needs the number of episodes
          but to know how many episodes there are it needs the website so it can retrieve the
          number of episodes to then display a random episode in terms of a link that can be used
        */
        url = "https://anitaku.to/" + url + "-episode-" + randomEpsN;

        //System.out.println(randomEpsM());
        //System.out.println(randomEpsM());

        //System.out.println(url);

        //returning the final URL that can be used
        return url;

    }

}
