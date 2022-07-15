package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    int highest;

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "ecesapp";
        } else if (query.contains("plus")) {
            String [] strings = query.split(" ");
            int result = Integer.parseInt(strings[strings.length - 1]) + Integer.parseInt(strings[strings.length - 3]);
            return "" + result;
        } else if (query.contains("multiplied")) {
            String [] strings = query.split(" ");
            int result = Integer.parseInt(strings[strings.length - 1]) * Integer.parseInt(strings[strings.length - 4]);
            return "" + result;
        } else if (query.contains("largest")) {
            String [] subsection = query.split(": ");
            String [] strings = subsection[1].split(", ");
            Integer [] numbers = new Integer[strings.length];
            for (int i = 0; i <= strings.length - 1; i++) {
                numbers[i] = Integer.parseInt(strings[i]);
            }
            for (Integer integer : numbers) {
                if(integer > highest) {
                    highest = integer;
                }
            }
            return "" + highest;
            // } else if (query.contains("name")) {
            // return "Nico";
        } else { // TODO extend the programm here
            return "";
        }
    }
}
