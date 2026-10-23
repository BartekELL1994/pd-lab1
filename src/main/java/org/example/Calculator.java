package org.example;

import java.security.MessageDigest;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    // Odkomentuj to zgodnie z instrukcją
    // public void calculateHash(String text) {
    //     try {
    //         MessageDigest md = MessageDigest.getInstance("MD5");
    //         md.update(text.getBytes());
    //         byte[] digest = md.digest();
    //         System.out.println("Hash: " + digest.toString());
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    // }
}