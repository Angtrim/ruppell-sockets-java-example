package com.angtrim.javaruppellexample;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Simple "Heroku App" that uses Ruppell's Socket addon
 * @author angtrim
 *
 */
public class MainServer {
    public static void main(String[] args) {
        System.out.println("Looking for connections...");
        try {
            ServerSocket serverSocket = new ServerSocket(Integer.parseInt(System.getenv("RUPPELLS_SOCKETS_LOCAL_PORT")));
            Socket sessionSocket = serverSocket.accept();
            System.out.println("Client connected");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
