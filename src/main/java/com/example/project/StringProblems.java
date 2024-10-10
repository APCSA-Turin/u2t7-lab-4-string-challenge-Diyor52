package com.example.project;

public class StringProblems {
    //empty constructor
    public StringProblems(){}

    // Given a string, return true if it ends in "ly".
    // endsLy("oddly") → true
    // endsLy("y") → false
    // endsLy("oddy") → false
    public boolean endsLy(String x) {
        return x.endsWith("ly"); 
        
        //https://www.w3schools.com/java/ref_string_endswith.asp#:~:text=The%20endsWith()%20method%20checks,the%20specified%20character(s).// 
        /* This is where i learned ends with and begins with*/
    }

    // Given two strings, append them together (known as "concatenation")
    // and return the result. However, if the concatenation creates a double-char,
    // then omit one of the chars, so "abc" and "cat" yields "abcat".
    // conCat("abc", "cat") → "abcat"
    // conCat("dog", "cat") → "dogcat"
    // conCat("abc", "") → "abc"
    public String conCat(String s1, String s2) {
        if (s1.length() > 0 && s2.length() > 0 && s1.charAt(s1.length() - 1) == s2.charAt(0)) {
            return s1 + s2.substring(1);
        }
        return s1 + s2;
    }
    //https://www.w3schools.com/java/ref_string_charat.asp#:~:text=The%20charAt()%20method%20returns,is%201%2C%20and%20so%20on.// 
    /* I learned charat is basically where the character is t like an index at a certain string*/


    // Given a string, return a version without the first 2 chars.
    // Except keep the first char if it is 'a' and keep the second char if it is 'b'.
    // The string may be any length. Harder than it looks.
    // deFront("Hello") → "llo"
    // deFront("java") → "va"
    // deFront("away") → "aay"
    // deFront("aapple") -> "apple"
    // deFront("abeep") -> "abeep"
    public String deFront(String s1) {
        String result = "";
        if (s1.length() > 0 && s1.charAt(0) == 'a') {
            result += s1.charAt(0);
        }
        if (s1.length() > 1 && s1.charAt(1) == 'b') {
            result += s1.charAt(1);
        }
        if (s1.length() > 2) {
            result += s1.substring(2);
        }
        return result;
    }

    //https://www.w3schools.com/java/ref_string_charat.asp#:~:text=The%20charAt()%20method%20returns,is%201%2C%20and%20so%20on.// 
    /* I learned charat is basically where the character is t like an index at a certain string and instead of using double quotes for it you just use singular quotes*/

    // Given a string, if the first or last chars are 'x',
    // return the string without those 'x' chars, and otherwise
    // return the string unchanged.
    // withoutX("xHix") → "Hi"
    // withoutX("xHi") → "Hi"
    // withoutX("Hxix") → "Hxi"
    public String withoutX(String s1) {
        if (s1.length() > 0 && s1.charAt(0) == 'x') {
            s1 = s1.substring(1);
        }
        if (s1.length() > 0 && s1.charAt(s1.length() - 1) == 'x') {
            s1 = s1.substring(0, s1.length() - 1);
        }
        return s1;
    }

        //https://www.w3schools.com/java/java_operators.asp//
        /* I learned the && and || from this certain website which means "and" and "or" */
    

    

    // Given a string str, if the string starts with "f" return "Fizz".
    //  If the string ends with "b" return "Buzz". If both the "f" and "b"
    //  conditions are true, return "FizzBuzz". In all other cases, return the
    //  string unchanged. (See also: FizzBuzz Code)
    // fizzString("fig") → "Fizz"
    // fizzString("dib") → "Buzz"
    // fizzString("fib") → "FizzBuzz"
    public String fizzString(String s1) {
        boolean startsWithF = s1.startsWith("f");
        boolean endsWithB = s1.endsWith("b");
        
        if (startsWithF && endsWithB) {
            return "FizzBuzz";
        } else if (startsWithF) {
            return "Fizz";
        } else if (endsWithB) {
            return "Buzz";
        } else {
            return s1;
        }
    }

    // Given an int n, return the string form of the number followed
    // by "!". So the int 6 yields "6!". Except if the number is
    // divisible by 3 use "Fizz" instead of the number, and if the
    // number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz".
    //  Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3.
    //   What will the remainder be when one number divides evenly into another?
    // fizzString2(1) → "1!"
    // fizzString2(2) → "2!"
    // fizzString2(3) → "Fizz!"
    public String fizzString2(int x) {
        if (x % 3 == 0 && x % 5 == 0) {
            return "FizzBuzz!";
        } else if (x % 3 == 0) {
            return "Fizz!";
        } else if (x % 5 == 0) {
            return "Buzz!";
        } else {
            return x + "!";
        }
    }
    // % is MOD and == is just equals for integers but for string it would be .equals//
}