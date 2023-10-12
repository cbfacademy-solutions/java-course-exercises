package com.cbfacademy.words;

public class ReverseCharSequence implements CharSequence {

    private String str;

    public ReverseCharSequence(String str) {
        this.str = str;
    }

    @Override
    public int length() {
        return str.length();
    }

    @Override
    public char charAt(int index) {
        return str.charAt(length() - 1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new ReverseCharSequence(str.substring(start, end));
    }

    @Override
    public String toString() {
        StringBuilder reversed = new StringBuilder();

        for (int i = 0; i < length(); i++) {
            reversed.append(charAt(i));
        }

        return reversed.toString();
    }
}
