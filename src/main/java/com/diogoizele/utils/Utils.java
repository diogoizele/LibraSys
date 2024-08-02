package main.java.com.diogoizele.utils;

import java.security.SecureRandom;

public class Utils {

    private static final String DIGITS = "0123456789";
    private static final int ID_SIZE = 10;
    private static final SecureRandom RANDOM = new SecureRandom();

    public static String generateId() {

        StringBuilder id = new StringBuilder(ID_SIZE);
        for (int i = 0; i < ID_SIZE; i++) {
            int index = RANDOM.nextInt(DIGITS.length());
            id.append(DIGITS.charAt(index));
        }
        return id.toString();
    }

}
