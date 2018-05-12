# HangMan Game
![alt text](https://nastassjamotro.github.io/10HourProject/img/hang.png)

This is a simple game of hangman without any lovely visuals created of the diagram of the person gaining more body parts as the player continually loses. It uses just simple Java and no GUI application is to be seen here.

# Code

```
// Nastassja Motro 5/9/18

// Hangman Game!

import java.util.Scanner;
import java.util.Arrays;

public class Die {
  
  private static String[] words = {"picture", "program", "funky", "grass", "pizza", "swig"};
  private static String word = words[(int) (Math.random() * words.length)];
  private static String ast = new String(new char[word.length()]).replace("\0", "*");
  private static int count = 0;
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    While (count < 7 && ast.contains("*")) {
      System.out.println("Guess a letter in the word");
      System.out.println(ast);
      String guess = scan.next();
      hang(guess);
    }
    scan.close();
  }
  
  public static void hang(String guess) {
    String newAst = "";
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == guess.charAt(0)) {
        newAst += guess.charAt(0);
      } else if (ast.charAt(i) != '*') {
        newAst += word.charAt(i);
      } else {
        newAst += "*";
      }
    }
    if (ast.equals(newAst)) {
      count++;
      hangManImage();
    } else {
      ast = newAst;
    }
    if (ast.equals(word)) {
      System.out.println("Righty-O! You guessed it! The word was " + word);
    }
  }
  
  public static void hangmanImage() {
    if (count == 1) {
      System.out.println("Wrong guess, try again");
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println("___|___");
      System.out.println();
    } else if (count == 2) {
      System.out.println("Wrong guess, try again");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("___|___");
    } else if (count == 3) {
      System.out.println("Wrong guess, try again");
      System.out.println("   ____________");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.prinltn("___|___");
    } else if (count == 4) {
      System.out.println("Wrong guess, try again");
      System.out.println("   ____________");
      System.out.println("   |          _|_");
      System.out.println("   |         /   \\");
      System.out.println("   |        |     |");
      System.out.println("   |         \\_ _/");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("___|___");
    } else if (count == 5) {
      System.out.println("Wrong guess, try again");
      System.out.println("   ____________");
      System.out.println("   |          _|_");
      System.out.println("   |         /   \\");
      System.out.println("   |        |     |");
      System.out.println("   |         \\_ _/");
      System.out.println("   |           |");
      System.out.println("   |           |");
      System.out.println("   |");
      System.out.println("___|___");
    } else if (count == 6) {
      System.out.println("Wrong guess, try again");
      System.out.println("   ____________");
      System.out.println("   |          _|_");
      System.out.println("   |         /   \\");
      System.out.println("   |        |     |");
      System.out.println("   |         \\_ _/");
      System.out.println("   |           |");
      System.out.println("   |           |");
      System.out.println("   |          / \\");
      System.out.println("___|___      /   \\");
    } else if (count == 7) {
      System.out.println("GAME OVER!");
      System.out.println("   ____________");
      System.out.println("   |          _|_");
      System.out.println("   |         /   \\");
      System.out.println("   |        |     |");
      System.out.println("   |         \\_ _/");
      System.out.println("   |          _|_");
      System.out.println("   |         / | \\");
      System.out.println("   |          / \\");
      System.out.println("___|___      /   \\");
      System.out.println("GAME OVER! YOU LOSE! The word was " + word);
    }
  }
}
```

[To see the original code on Github, click here](https://github.com/nastassjamotro/10HourProject/)

[BACK](https://nastassjamotro.github.io/10HourProject/)
