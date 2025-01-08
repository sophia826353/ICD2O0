/* Heading 

Sophia Mohamed 
826353 
Date : December 6, 2024 
Course: ICD 2O0

*/ 


import java.util.Scanner;
public class Assignment 3  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("how many games would you like to play? "); 
        int numGames = sc.nextInt();
       
       int playerWins = 0;
       int computerWins = 0;
       int ties = 0;

       
    for (int n = 0; n < numGames; n++) {
         System.out.print("choose your move. (r = rock, p = paper, and s = scissors.): "); 
          char playerchoice = sc.next().toLowerCase().charAt(0);
       
    if(playerchoice != 'r' &&  playerchoice != 's' && playerchoice != 'p' ){
          System.out.println("Please enter (r = rock; p = paper, and s = scissors)");
         
        }
        int computerRandomChoice = (int)(3 * Math.random());
        char computerChoice = ' ';
         
         if (computerRandomChoice == 0) {
                computerChoice = 'r'; 
            } else if (computerRandomChoice == 1) {
                computerChoice = 'p';
            } else {
                computerChoice = 's'; 
            }
        System.out.println("Computer chose: " + computerChoice);
       
        if (playerchoice == computerChoice){
            System.out.println("It's a tie!! ");  
            ties++;
        } else if ((playerchoice =='r' && computerChoice =='s') || 
                   (playerchoice =='p' && computerChoice =='r')||
                   (playerchoice =='s' && computerChoice =='p')) { 
             System.out.println("you win!");
             playerWins++;
        }else {
                System.out.println("computer wins!");
                computerWins++;
            }
        }
          System.out.println("\nFinal Score:");
          System.out.println("player Wins: " + playerWins);
          System.out.println("computer Wins: " + computerWins);
          System.out.println("Ties: " + ties);
         
          sc.close();
    }
   }  
