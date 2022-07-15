package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "ecesapp";
        } else if (query.contains("which of the following numbers is the largest")) {
        String numbers = query.substring("d956fe10: which of the following numbers is the largest: ".length());
        String[] n = numbers.split(", ");
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
            try {
                int num = Integer.parseInt(n[i]);
                if(num > largest) {
                    largest = num;
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return "" + largest;
    } else if (query.contains("what is ")) {
        String[] parts = query.split(" ");
        int result = 0;
        try {
            int a = Integer.parseInt(parts[parts.length - 1]);
            int b = Integer.parseInt(parts[parts.length - 3]);
            result = a + b;
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return "" + result;
        } else { // TODO extend the programm here
            return "";
        }
    }
}
