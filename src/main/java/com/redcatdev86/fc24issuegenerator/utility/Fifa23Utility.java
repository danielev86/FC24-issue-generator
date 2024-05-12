package com.redcatdev86.fc24issuegenerator.utility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Fifa23Utility {

    public static final List<String> tacticts = Arrays.asList(
            "3-4-3", "3-5-2", "3-4-1-2","3-4-2-1", "3-2-2-1-2"
            , "4-1-4-1","4-2-2-2", "4-2-1-3", "4-2-3-1", "4-3-3","4-3-1-2", "4-3-2-1", "4-1-2-3", "4-1-2-1-2", "4-4-2", "4-4-1-1"
            , "5-2-3", "5-3-2", "5-4-1", "5-2-1-2");

    public static String generateModule(){
        int randomNumber = generateRandomNumber(0, tacticts.size()-1);
        return tacticts.get(randomNumber);
    }

    public static int generateRandomNumber(int origin, int bound){
        return ThreadLocalRandom.current().nextInt(origin, bound);
    }

}
