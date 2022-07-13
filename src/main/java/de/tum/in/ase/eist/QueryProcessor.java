package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Optional;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "David";
        } else if(query.contains("which")) {
            String numbers = query.substring(query.indexOf("largest:")+9);
            String[] num = numbers.split(",");
            if(num.length < 2){ return "0";}
            Optional<Integer> max = Arrays.stream(num).map(Integer::parseInt).max(Integer::compareTo);
            return max.map(integer -> integer + "").orElse("0");
        } else{ // TODO extend the programm here
                return "";

        }
    }
}
