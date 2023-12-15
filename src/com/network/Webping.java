package com.network;

import java.net.InetAddress;
import java.net.Socket;

class WebPing {
    public static void main(String[] args) {

        String socketName = "www.javatutorial.com";


        try {
            InetAddress addr;
            Socket sock = new Socket(socketName , 80);
            addr = sock.getInetAddress();
            System.out.println("Connected to " + addr);
            sock.close();
        } catch (java.io.IOException e) {
            System.out.println("Can't connect to " + args[0]);
            System.out.println(e);
        }
    }
}