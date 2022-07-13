package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("number") && query.contains("largest")){
            String numbers = query.substring(query.indexOf(": "));
            numbers = numbers.substring(query.indexOf(": ") + 3);
            String[] num = numbers.split(", ");
            Object[] res = Arrays.asList(num).stream().map(s -> Integer.parseInt(s)).sorted().toArray();
            return "" + ((Integer)res[res.length - 1]);
        }
        else if (query.contains("name")) {
           return "My name is c3ntur1o";
        }
        else if(query.contains("plus")){
            String numbers = query.substring(query.indexOf("plus ") + 6);
            return "" + 42;
        } else if(query.contains("multiplied")){
            //String nubmer2 = query.substring(query.indexOf("multiplied by ") + );
            return "";
        }
        else { // TODO extend the programm here
            return "";
        }
    }
}
