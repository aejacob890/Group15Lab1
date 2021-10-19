/**
  Athena Jacob (025701882) and Jose Jimenez (026176889)
  August 24, 2021
  Description: In this lab, we generate a number bewteen 1 and 100 which we have to guess. If we get it wrong, it will prompt us to guess again and if we were higher/lower. If we win, then we're pretty good at guessing.
*/

import java.util.Random;

//The above import allow us to introduce different "ideas" within our program. "import java.util.Random;" allows us to use randomly generated numbers in our program.

class Main {
  public static void main(String[] args) {
    
    int upper = 100; //the biggest number it can go to
    int lower = 1; //the smallest number it can go to
    int tries = 1; //to keep track of tries it took 
    Random random = new Random(); // random number generator
    int randomNum = random.nextInt(upper) + 1; //generate the random number we are guessing
    
    //ask the user to guess a number
    System.out.print("I’m thinking of a number. Guess a value (1-100): ");
    
    //while loop for the user to keep guessing if the got it wrong
    while (true) {
      int userInput = CheckInput.getIntRange(lower, upper);//counting the guesses

      //If guess is to high, it prints too high and adds one to number of tries
      if (userInput > randomNum) {
        System.out.print("Too High. Guess again: ");
        tries += 1;
      } 
      //If guess is to low, it prints too low and adds one to number of tries
      else if (userInput < randomNum){
        System.out.print("Too Low. Guess again: ");
        tries += 1;
      }
      //If we managed to guess the correct randomly generated number in a certain amount of tries, the program will print out that we got the correct number within how many tries it took us.
      else {
        System.out.print("Correct!  You got the it in " + tries + " tries.");
        break;
      }
    }
  }
}