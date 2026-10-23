package org.example;

public class UserManager {
    // Błąd 1: Hasło przechowywane w kodzie (Hardcoded password - poważny błąd SonarQube)
    private String adminPassword = "superSecretPassword123";

    // Błąd 2: Metoda z dużą ilością zagnieżdżeń i pusta instrukcja if
    public void login(String username, String password) {
        if (username != null) {
            if (password != null) {
                if (username.equals("admin")) {
                    if (password.equals(adminPassword)) {
                        // pusty blok to też błąd dla Sonara!
                    }
                }
            }
        }
    }
}