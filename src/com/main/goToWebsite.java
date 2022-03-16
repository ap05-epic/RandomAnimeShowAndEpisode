package com.main;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class goToWebsite {
    public static void main(String[] args) {

    }

    public static void opener(String URL) throws URISyntaxException, IOException {

        Desktop d = Desktop.getDesktop();
        d.browse(new URI(URL));

    }

}
