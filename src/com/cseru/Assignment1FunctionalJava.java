package com.cseru;

/*
Introduction
These problem sets are an opportunity for you to practice the concepts you learned in class before
moving on to the next lesson. Learning a computer programming language is similar to
learning a human language. Nobody can pick it up overnight, there's a lot of vocabulary
and syntax to remember. Language learners often speak of the moment when they realized
they stopped translating in their head and actually started thinking in their second language.
This will happen with Java too! Eventually, you will be able to consider a task that needs
coding and immediately imagine what Java code would complete it. To get there, though,
requires practice. That's where the problem sets come in. They're just extra learning materials to help you along.

Completing the Problem Sets
There isn't a right or wrong way to work on these. Some problems require you to examine
code or do some arithmetic. You can take notes on paper, print this document and use the
space provided, or try to do it all in your head|whatever works for you. For the exercises
that require programming, we highly recommend that you pick your favorite text editor,
open a blank text File, and try writing out the code.
*/
public class Assignment1FunctionalJava{

    /*
    Problem #1
    Complete the factorial() function below. It should return the product of all the numbers
    from 1 to the parameter n. For example, factorial(5) should return 120 because 1 x 2 x
    3 x 4 x 5 = 120. Think about what kind of loop you want to use to accomplish this.
    Starting code:
    */
    public int factorial(int n) {
        return -1;
    }

    /*
    Problem #2
    Complete the code in this function to find and return the lowest index in the String array stringArray that the String target occurs.
    If the String target does not occur in stringArray, -1 should be returned.
    As an example of how this function should work, this code should print 1, because the word
    “Java” appears at index 1.
    String[] sentence = {"Learning", "Java", "is", "fun."};
    int indexOfWordJava = indexOfFirstOccurrence(sentence, "Java");
    System.out.println(indexOfWordJava);

    Hint: you cannot compare two Strings using the == operator! This will be false unless
    the two Strings are actually the same String object, not just two Strings with the same
    letters. To check whether two Strings have the same letters, use the equals() method:
    if (myString1.equals(myString2)).

    Starting code:
    */
    public int indexOfFirstOccurrence(String[] stringArray, String target)
    {
        return -1;
    }


    /*
    Problem #3
    A savings account yields 5% interest annually. This Java function is designed to determine
    how many years it will take for you to have $1,000,000 on deposit given an initial value. The
    parameter represents the initial deposit, and the function should return an integer number
    of years before there will be $1,000,000 or more in the account. Write a loop to determine
    the number of years, and return that value.

    (Hint: Do we know how many times this loop needs to iterate? Does this mean a for loop
    or a while loop is more appropriate?)

    Starting code:
    */
    public int yearsTilOneMillion(double initialBalance) {
        return 0;
    }

    /*
    Problem #4
    Complete the Java function below to print out all the Strings in the String array parameter
    in reverse order. (The String at the highest index should be printed first, then the String at
    the next highest index, and so on. The String at index 0 should be printed last.)

    For example, if a String array called weekdays had value

    {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"}

    then this function call:

    printInVerverse(weekdays);

    would print:

    Friday
    Thursday
    Wednesday
    Tuesday
    Monday

    Starting code:
     */
    public void printInReverse(String[] stringArray) {
    }


    /*
    Problem #5
    Complete the function below, which finds the range covered by an integer array. Inside
    the function, find the smallest value in the parameter array, and find the largest value, and
    return the largest value minus the smallest value. If the array has length 0, return -1.

    For example, if the variable myIntArray had the value
    {1, 0, 2, 3, -1, 2}

    then the function call

    findRange(myIntArray)

    would return 4. The largest value in the array is 3, the smallest value is -1, and 3−(−1) = 4.

    Starting code: */
    public int findRange(int[] intArray) {
        return -1;
    }


    /*
    Problem #6
    Let’s improve the monopolyRoll() function from the previous problem set. Recall that in
    Monopoly, players roll two six-sided dice to determine their move. If the same value is on
    both dice, this is called “rolling doubles,” and it means they go again. In the last problem
    set, you wrote a function that rolled two six-sided dice and, if the values on both die were
    the same, rolled two more and returned the sum. This time, write a function that does the
    same except it continues rolling until two non-equal values appear on the two dice.
    In other words, the function should behave as follows:
    1. Generate two random numbers in the 1 to 6 range.
    2. If they are not the same, return the sum of all numbers rolled so far.
    3. If they are the same, keep track of the total rolled so far and return to step 1.

    Think about what kind of loop you want to define to repeat these steps. Again, you may
    want to define a separate function for generating dice rolls.

    Optional challenge: in Monopoly, if a player rolls doubles three times in a row, they go
    to “jail.” Modify your function to keep track of the number of rolls made so far. If three
    consecutive doubles are rolled, return -1 instead of continuing to roll.

    Optional challenge 2: in the last lesson, you learned about while loops and for loops as a
    way to make a computer program repeat. There is another method for making a program
    repeat using only functions called recursion. A “recursive” function is one which calls itself
    inside itself. See if you can write the monopolyRoll() function by calling monopolyRoll()
    inside the function itself to handle the case where further rolls are made.

    You can get an overview of recursion in Java here:
    https://howtoprogramwithjava.com/java-recursion/
     */

    //Starting code:
    public int diceRoll(int sides) {
        return 0;
    }

    public int monopolyRoll() {
        return 0;
    }
}