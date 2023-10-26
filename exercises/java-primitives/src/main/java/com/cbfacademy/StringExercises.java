package com.cbfacademy;

public class StringExercises {

    public String concatenate(String word1, String word2, String word3) {
        // TODO: Write code that concatenates the input parameters and returns the result
        return word1 + word2 + word3;
    }

    public Boolean areEqual(String word1, String word2) {
        // TODO: Write code to determine whether the input parameters are equal strings
        return word1.equals(word2);
    }

    public String format(String item, int quantity, double price) {
        // TODO: Write code to return a string formatted as follows: "Item: [item]. Price: £[amount]. Quantity: [quantity]". The date should be formatted as DD/MM/YYYY, e.g. 24/10/2023
        return String.format("Item: %s. Price: £%.2f. Quantity: %d", item, price, quantity);
    }
}
