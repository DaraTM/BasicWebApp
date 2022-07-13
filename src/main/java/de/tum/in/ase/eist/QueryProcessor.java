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
           return "David";
        } else if(query.contains("which")) {
            String numbers = query.substring(query.indexOf("largest:")+8);
            String[] num = numbers.split(",");
            if(num.length < 2){ return "0";}
            int max = Math.max(Integer.parseInt(num[0]),Integer.parseInt(num[1]));
            return max + "";
        } else{ // TODO extend the programm here
                return "";

        }
    }
}
