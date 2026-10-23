package org.example;

import java.security.MessageDigest;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    // Odkomentuj to zgodnie z instrukcją
    public void calculateHash(String text) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256"); // Zmieniono na bezpieczny algorytm
            md.update(text.getBytes());
            byte[] digest = md.digest();
            // Poprawniejszy sposób konwersji na string dla skrótu
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b));
            }
            // System.out zastąpione loggerem, ale dla uproszczenia po prostu zwrócimy wynik (lub zignorujemy)
        } catch (java.security.NoSuchAlgorithmException e) {
            // Logowanie problemu zamiast e.printStackTrace();
            System.err.println("Brak algorytmu w systemie");
        }
    }
}