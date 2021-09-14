/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import test.Test;
import static java.lang.Thread.sleep;

/**
 *
 * @author Sandy Jessith Chico
 */
public class Contest {

    //Prize prize = new Prize();
    //This method well come the players and ask for their names
    public static int welcomePlayer(Player player, Scanner sc) {
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
    public static void askQuestions(Set<Question> questions, int counter, ArrayList<Question> auxQuestions, Player player, Scanner sc) {
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
            System.out.println("");

            //Test if the answer is correct
            if (c == it.getAnswer()) {
                continue;

            } else {
                System.out.println("");
                System.out.println("Wrong answer");
                switch (it.getCategory()) {
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
                Question.setTester(false);
                break;
            }

        }
    }

    //This method explain the metodology of the game to the user
    public static void explainMetodology() {
        //Wellcome to the game
        System.out.println("Hello, this is 'Askme' App. We will test your knowledge"
                + " about cargo inspection \n");

        sleepNow(1200);

        System.out.println("The metodoloy is the next: \n \n"
                + "The game has 5 levels and 5 questions per level,  \n"
                + "each level has points that you will earn only if you answer \n"
                + "all questions correctly.\n");

        sleepNow(2500);

        System.out.println("You have to type a, b, c or d according to options \n"
                + "that you consider as the correct answer. Any letter typed \n "
                + "different from a, b , c or d will be considered as a wrong \n"
                + " answer and the game will finish \n");

        sleepNow(3000);

    }

    //This method add the current Prize to the current score
    public static void addToCurrentScore(Player player, Prize prize, int counter, String level, String questionLevel) {
        player.setCurrentScore(player.getCurrentScore() + prize.getPrizes()[counter - 1]);
        sleepNow(500);
        System.out.println("Level " + questionLevel + "\n");
        sleepNow(1500);
        System.out.println("Round prize for : " + prize.getPrizes()[counter]
                + " USD");
        sleepNow(500);
        System.out.println("Current prize: " + player.getCurrentScore() + " USD");
        sleepNow(1500);
        System.out.println("Good luck");
        sleepNow(1500);
        Contest.showIntermediateMsg(player, level);

    }

    //This method add the current Prize to the current score
    public static void addToCurrentScore(Player player, Prize prize, int counter, String questionLevel) {
        player.setCurrentScore(player.getCurrentScore() + prize.getPrizes()[counter - 1]);
        sleepNow(500);
        System.out.println("Level " + questionLevel + "\n");
        sleepNow(1500);
        System.out.println("Round prize for : " + prize.getPrizes()[counter]
                + " USD");
        sleepNow(500);
        System.out.println("Current prize: " + player.getCurrentScore() + " USD");
        sleepNow(1500);
        System.out.println("Good luck");
        sleepNow(1500);

    }

    //This method shows some some required information and set current Score
    public static void showPreviousInfo(int counter, Player player) {

        Prize prize = new Prize();

        switch (counter) {

            case 1:

                addToCurrentScore(player, prize, counter, "Amateur");
                break;

            case 2:

                addToCurrentScore(player, prize, counter, "Amateur", "Intermediate");
                break;

            case 3:

                addToCurrentScore(player, prize, counter, "Intermediate", "Advanced");
                break;

            case 4:

                addToCurrentScore(player, prize, counter, "Advanced", "Senior");
                break;

            case 5:
                addToCurrentScore(player, prize, counter, "Senior", "Expert");
                break;

            default:
                player.setCurrentScore(player.getCurrentScore() + prize.getPrizes()[counter - 1]);
                Contest.showFinalMsg(player);

                sleepNow(4000);

                System.exit(0);
                break;

        }
    }

    public static void showFinalMsg(Player player) {

        System.out.println("");
        System.out.println("Congratulation," + player.getName() + " you've won");
        System.out.println("All your answer were correct");
        System.out.println("You are an expert!!");
        System.out.println("You will take home " + player.getCurrentScore() + "USD");
        System.out.println("");
        System.out.println("Thanks for playing");
        System.out.println("");

        sleepNow(4000);

    }

    public static void showIntermediateMsg(Player player, String level) {

        System.out.println("");
        System.out.println("Your current level is: " + level + "\n");
        System.out.println(player.getName() + " You have now " + player.getCurrentScore() + "USD");
        System.out.print("Would you like to continue ? \n");
        System.out.println("Remember if you continue and you fail "
                + "any question you will go with no money \n");
        System.out.println("Type 1 or 2 \n \n"
                + "1. Yes \n"
                + "2. No \n");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        Test.input = Integer.parseInt(sc.nextLine());
        System.out.println("");

        if (Test.input == 2) {

            System.out.println("You are considered as an " + level + "\n");
            System.out.println("you got: " + player.getCurrentScore()
                    + "  USD");
            System.out.println("");
            System.out.println("Bye  " + player.getName());
            sleepNow(4000);
            System.exit(0);
        }

    }

    public static void sleepNow(int miliseconds) {
        try {
            sleep(miliseconds);
        } catch (Exception e) {

        }
    }
}
