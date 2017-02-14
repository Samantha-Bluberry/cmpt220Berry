import java.util.Scanner;
/**
 * file: Problem315.java
 * author: Samantha Berry
 * course: CMPT 220
 * assignment: lab 2
 * due date: February 7, 2017
 * version 1.0
 * 
 * This file calculates the winnings of a three digit lottery
 */
public class Problem315 {
  public static void main(String[] args) {
    int lottery = (int)(Math.random() * 1000);
    int lotteryDigit1, lotteryDigit2, lotteryDigit3;
    int guess;
    int guessDigit1, guessDigit2, guessDigit3;
    int winState;
    Scanner input = new Scanner(System.in);

    System.out.print("Enter you lottery pick (three digits): ");
    guess = input.nextInt();

    lotteryDigit1 = lottery / 100;
    lotteryDigit2 = (lottery / 10) % 10;
    lotteryDigit3 = lottery % 10;

    guessDigit1 = guess / 100;
    guessDigit2 = (guess / 10) % 10;
    guessDigit3 = guess % 10;

    System.out.println("The lottery number is " + lottery);

    if (guess == lottery)
      winState = 1;
    else if ((guessDigit1 == lotteryDigit1 
         || guessDigit1 == lotteryDigit2 
         || guessDigit1 == lotteryDigit3)
         && (guessDigit2 == lotteryDigit1
         || guessDigit2 == lotteryDigit2
         || guessDigit2 == lotteryDigit3)
         && (guessDigit3 == lotteryDigit1
         || guessDigit3 == lotteryDigit2
         || guessDigit3 == lotteryDigit3))
      winState = 2;
    else if ((guessDigit1 == lotteryDigit1 
         || guessDigit1 == lotteryDigit2 
         || guessDigit1 == lotteryDigit3)
         || (guessDigit2 == lotteryDigit1
         || guessDigit2 == lotteryDigit2
         || guessDigit2 == lotteryDigit3)
         || (guessDigit3 == lotteryDigit1
         || guessDigit3 == lotteryDigit2
         || guessDigit3 == lotteryDigit3))
      winState = 3;
    else
      winState = 4;
    switch (winState) {
      case 1: System.out.println("Exact match: you win $10,000");
              break;
      case 2: System.out.println("Match all digits: you win $3,000");
              break;
      case 3: System.out.println("Match one digit: you win $1,000");
              break;
      case 4: System.out.println("Sorry, no match");
              break;
      default: System.out.println("ERROR");
               break;
    }
  } //calculates the winnings of a three digit lottery
}