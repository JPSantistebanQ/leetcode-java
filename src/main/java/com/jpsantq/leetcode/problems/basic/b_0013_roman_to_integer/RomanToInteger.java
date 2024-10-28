package com.jpsantq.leetcode.problems.basic.b_0013_roman_to_integer;

import java.util.List;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int response = 0;
        Map<Character, Integer> numbers = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        char[] reverse = s.toCharArray();

        //List<String> reverse = Arrays.asList(s.split(""));
        //Collections.reverse(reverse);

        //System.out.println(reverse);

        char lastSymbol = ' ';
        for (int i = reverse.length - 1; i >= 0; i--) {
            char symbol = reverse[i];
            int add = numbers.getOrDefault(symbol, 0);
            if ((symbol == 'I' && List.of('V', 'X').contains(lastSymbol))
                    || (symbol == 'X' && List.of('L', 'C').contains(lastSymbol))
                    || (symbol == 'C' && List.of('D', 'M').contains(lastSymbol))) add = add * -1;
            //if(isNegative(i, lastSymbol)) add = add * -1;

            response += add;
            lastSymbol = symbol;

            //System.out.println("actual: " + add + ", acc: " + response);
        }

        return response;
    }
/*
    protected boolean isNegative(String symbol, String lastSymbol) {
        if((symbol.equals("I") && List.of("V", "X").contains(lastSymbol))
        || (symbol.equals("X") && List.of("L", "C").contains(lastSymbol))
        || (symbol.equals("C") && List.of("D", "M").contains(lastSymbol)))
            return true;
        return false;
    }
    */
}
