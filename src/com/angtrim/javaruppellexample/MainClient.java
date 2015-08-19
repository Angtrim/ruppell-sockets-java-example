package com.angtrim.javaruppellexample;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Simple Client class to connect to your Heroku App using ruppell's socket addon
 * @author angtrim
 *
 */

public class MainClient {


    public static void main(String[] args) {
        
        /* Follow this guide : https://devcenter.heroku.com/articles/ruppells-sockets#provisioning-the-add-on 
         * and get Ruppell's address and port
         */
        String ruppellAddress = "1234.5678.9121299.xxx.sockets.ruppells.io";
        int ruppellPort = 37684;
        try {
            Socket socket = new Socket(InetAddress.getByName(ruppellAddress),ruppellPort);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
