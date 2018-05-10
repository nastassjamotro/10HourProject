// Nastassja Motro 5/9/18

// Hangman Game!

import java.util.Scanner;
import java.util.Arrays;

public class Die {
  public static void main(String[] args) {
    String[] words = {"writer", "that", "program"};
    int randomWordNumber = (int)(Math.random() * words.length);
    char[] enteredLetters = new char[words[randomWordNumber].length()];
    int triesCount = 0;
    boolean wordIsGuessed = false;
    do {
      switch (enterLetter(words[randomWordNumber], enteredLetters)) {
        case 0:
          triesCount++;
          break;
        case 1:
          triesCount++;
          break;
        case 2:
          break;
        case 3:
          wordIsGuessed = true;
          break;
      }
    } while (! wordIsGuessed);
    System.out.println("\nThe word is " + words[randomWordNumber] + " You missed " + (triesCount - findEmptyPosition(enteredLetters)) + " time(s)");
  }
  
  public static int enterLetter(String word, char[] enteredLetters) {
    System.out.print("Guess a letter in the word: ");
    if(! printWord(word, enteredLetters)) {
      return 3;
    }
    System.out.print(" > ");
    Scanner scan = new Scanner(System.in);
    int emptyPosition = findEmptyPosition(enteredLetters);
    char userInput = scan.nextLine().charAt(0);
    if (inEnteredLetters(userInput, enteredLetters)) {
      System.out.println(userInput + " is already in the word");
      return 2;
    } else if (word.contains(String.valueOf(userInput))) {
      enteredLetters[emptyPosition] = userInput;
      return 1;
    } else {
      System.out.println(userInput + " is not in the word");
      return 0;
    }
  }
  
  public static boolean printWord(String word, char[] enteredLetters) {
    boolean astPrinted = false;
    for (int i = 0; i < word.length(); i ++) {
      char letter = word.charAt(i);
      if (inEnteredLetters(letter, enteredLetters)) {
        System.out.print(letter);
      } else {
        System.out.print('*');
        astPrinted = true;
      }
    }
    return astPrinted;
  }
  
  public static boolean inEnteredLetters(char letter, char[] enteredLetters) {
    return new String(enteredLetters).contains(String.valueOf(letter));
  }
  
  public static int findEmptyPosition(char[] enteredLetters) {
    int i = 0;
    while (enteredLetters[i] != '\u0000') i++;
    return i;
  }
}
