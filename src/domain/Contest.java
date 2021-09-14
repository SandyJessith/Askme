/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import static domain.Question.input;
import static domain.Question.tester;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sandy Jessith Chico
 */
public class Contest {
    
    
    //This method well come the players and ask for their names
    public static int welcomePlayer(Player player, Scanner sc){
        System.out.print("Please type your name: ");
        player.setName(sc.nextLine());

        //Starting the game
        System.out.print("Do you want to start now? \n");
        System.out.println("Type 1 or 2 \n \n"
                + "1. Yes \n"
                + "2. No \n");
        System.out.println("");

        int input = Integer.parseInt(sc.nextLine());
        System.out.println("");
        
        return input;
    }
    
    //This method ask the questions
    public static void askQuestions(Set<Question> questions, int counter, ArrayList<Question> auxQuestions, Player player, Scanner sc){
          //Create an Array list depending on the category
                for (Question its : questions) {

                    if (its.getCategory() == counter) {
                        auxQuestions.add(its);
                        Round round = new Round();

                    }
                }

                //iterate through the new ArrayList
                for (Question it : auxQuestions) {

                    System.out.println("Question level: " + it.getCategory() + "\n");
                    System.out.println(it.getQuestionId() + ". " + it.getQuestion() + "\n");
                    System.out.print(it.getaOption());
                    System.out.print(it.getbOption());
                    System.out.print(it.getcOption());
                    System.out.println(it.getdOption());

                    char c;
                    System.out.print("Type your answer: ");
                    c = sc.nextLine().charAt(0);

                    //Test if the answer is correct
                    if (c == it.getAnswer()) {
                        continue;

                    } else {
                        System.out.println("");
                        System.out.println("Wrong answer");
                        switch(it.getCategory()){
                            case 1: 
                                System.out.println("You don't know about this \n");
                                break;
                                
                            case 2: 
                                System.out.println("You are considered as an Amateur \n");
                                break;
                             
                            case 3: 
                                System.out.println("You are considered as an Intermediate \n");
                                break;
                                
                            case 4: 
                                System.out.println("You are considered as an Advanced \n");
                                break;
                            
                            case 5: 
                                System.out.println("You are considered as an Senior \n");
                                break;
                                
                        }
                        System.out.println("you got: " + player.getCurrentScore() + "  USD");
                        tester = false;
                        break;
                    }

                }
    }

    //This method explain the metodology of the game to the user
    public static void explainMetodology() {
        //Wellcome to the game
        System.out.println("Hello, this si Askme. We will test your knowledge"
                + " about cargo inspection \n");

        try {
            sleep(4500);
        } catch (Exception e) {

        }
        System.out.println("The metodoloy is the next: \n \n"
                + "The game has 5 levels and 5 questions per level,  \n"
                + "each level has points that you will earn only if you answer \n"
                + "all questions correctly.\n");

        try {
            sleep(2500);
        } catch (Exception e) {

        }

        System.out.println("You have to type a, b, c or d according to options \n"
                + "that you consider as the correct answer. Any letter typed \n "
                + "different from a, b , c or d will be considered as a wrong \n"
                + " answer and the game will finish \n");

        try {
            sleep(3000);
        } catch (Exception e) {

        }

    }

    //This method shows some some required information and set current Score
    public static void showPreviousInfo(int counter, Player player) {

        switch (counter) {
            case 1:
                System.out.println("Level Amareur \n");
                break;

            case 2:
                player.setCurrentScore(100);
                Contest.showIntermediateMsg(player, "Amateur");
                System.out.println("Level Intermediate\n");
                break;

            case 3:
                player.setCurrentScore(300);
                Contest.showIntermediateMsg(player, "Intermediate");
                System.out.println("Level Advanced\n");
                break;

            case 4:
                player.setCurrentScore(600);
                Contest.showIntermediateMsg(player, "Advanced");
                System.out.println("Level Senior\n");
                break;

            case 5:
                player.setCurrentScore(1000);
                Contest.showIntermediateMsg(player, "Senior");
                System.out.println("Level Expert\n");
                break;

            default:
                player.setCurrentScore(1500);
                Contest.showFinalMsg(player);
                try {
                    sleep(4000);
                } catch (Exception e) {

                }
                System.exit(0);
                break;

        }
    }

    public static void showFinalMsg(Player player) {

        System.out.println("");
        System.out.println("Congratulation," + player.getName() + " you've won");
        System.out.println("All your answer were correct");
        System.out.println("You are an expert!!");
        System.out.println("You will take home" + player.getCurrentScore() + "USD");
        System.out.println("");
        System.out.println("Thanks for playing");
        System.out.println("");

        try {
            sleep(4000);
        } catch (Exception e) {

        }
    }

    public static void showIntermediateMsg(Player player, String level) {

        System.out.println("");
        System.out.println(player.getName() + " You have now " + player.getCurrentScore() + "USD");
        System.out.print("Would you like to continue ? \n");
        System.out.println("Remember if you continue and you fail "
                + "any question you will go with no money \n");
        System.out.println("Type 1 or 2 \n \n"
                + "1. Yes \n"
                + "2. No \n");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        input = Integer.parseInt(sc.nextLine());
        System.out.println("");

        if (input == 2) {

            System.out.println("You are considered as an " + level + "\n");
            System.out.println("you got: " + player.getCurrentScore()
                    + "  USD");
            System.out.println("");
            System.out.println("Bye  " + player.getName());
            try {
                sleep(4000);
            } catch (Exception e) {
                
            }
            System.exit(0);
        }

    }
}
