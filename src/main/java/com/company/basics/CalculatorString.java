package com.company.basics;

public class CalculatorString {

    public int add(String numbers) {
        if (numbers.isEmpty())
            return 0;
        String[] numbersTable = numbers.split(",");// regex na rozdzielanie wyrazów
        int result = 0;
        for (String s : numbersTable) {
            result += Integer.parseInt(s);// zamiana stringa na int
        }
        return result;
    }
}
