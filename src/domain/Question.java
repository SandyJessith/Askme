/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import test.Test;

/**
 *
 * @author Sandy Jessith Chico
 */
public class Question {

    private int questionId;
    private int category;
    //private Category category;
    private String question;
    private char Answer;
    private String aOption;
    private String bOption;
    private String cOption;
    private String dOption;
    public static int input;

    public Question() {

    }

    public Question(int questionId, int category, String question, char Answer, String aOption, String bOption, String cOption, String dOption) {
        this.questionId = questionId;
        this.category = category;
        this.question = question;
        this.Answer = Answer;
        this.aOption = aOption;
        this.bOption = bOption;
        this.cOption = cOption;
        this.dOption = dOption;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public char getAnswer() {
        return Answer;
    }

    public void setAnswer(char Answer) {
        this.Answer = Answer;
    }

    public String getaOption() {
        return aOption;
    }

    public void setaOption(String aOption) {
        this.aOption = aOption;
    }

    public String getbOption() {
        return bOption;
    }

    public void setbOption(String bOption) {
        this.bOption = bOption;
    }

    public String getcOption() {
        return cOption;
    }

    public void setcOption(String cOption) {
        this.cOption = cOption;
    }

    public String getdOption() {
        return dOption;
    }

    public void setdOption(String dOption) {
        this.dOption = dOption;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Question{questionId=").append(questionId);
        sb.append(", category=").append(category);
        sb.append(", question=").append(question);
        sb.append(", Answer=").append(Answer);
        sb.append(", aOption=").append(aOption);
        sb.append(", bOption=").append(bOption);
        sb.append(", cOption=").append(cOption);
        sb.append(", dOption=").append(dOption);
        sb.append('}');
        return sb.toString();
    }

    public static boolean tester = true;

    public static void startGame() {

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

        //Player information
        Scanner sc = new Scanner(System.in);
        Player player = new Player();

        System.out.print("Please type your name: ");
        player.setName(sc.nextLine());

        System.out.print("Do you want to start now? \n");
        System.out.println("Type 1 or 2 \n \n"
                + "1. Yes \n"
                + "2. No \n");
        System.out.println("");

        int input = Integer.parseInt(sc.nextLine());
        System.out.println("");

        //Test if the answer is correct
        if (input == 1) {

            while (tester) {

                //idCategory will encrease per Category class call
                Category category = new Category();
                int counter = category.getCategoryId();

                Set<Question> questions = new HashSet();
                ArrayList<Question> auxQuestions = new ArrayList<>();
                char respuestaUsuario;

                //Here we create level 1 questions
                questions.add(new Question(1, 1, "As the density of a material"
                        + " increases, what will happen to theAPI gravity?", 'b',
                        "a. Go up\n", "b. Go down\n", "c. remains\n", "d. all answer are "
                        + "incorrect\n"));

                questions.add(new Question(2, 1, "When calculating the Gross Standard "
                        + "Volume (GSV) in a tank of\n" + "earth at the pressure of 1 "
                        + "atmosphere, does the term “Ctpl” mean\n" + "same as what"
                        + " other factor?", 'b', "a. VEF\n", "b. VCF\n", "c. WCF\n", "d. VAR\n"));

                questions.add(new Question(3, 1, "If a shipment does not contain BS&W, "
                        + "the Gross Standard Volume\n" + "and the Net Standard Volume "
                        + "are the same", 'a', "a. TRUE\n", "b. FALSE\n", "c. MAYBE\n", "d. IDK\n"));

                questions.add(new Question(4, 1, "For a shipment of crude, what "
                        + "information does the\n" + "GOV x VCF formula?", 'a',
                        "a. GSV\n", "b. NSV\n", "c. TCV\n", "d. VCF\n"));

                questions.add(new Question(5, 1, "Total Calculated Volume equals Gross"
                        + " Standard Volume\n" + "plus what?", 'a', "a. Free water\n",
                        "b. BS&W\n", "c. Roof Correction\n", "d. Free water plus BS&W\n"));

                //Here we create level 2 questions
                questions.add(new Question(6, 2, "What is the generally accepted value"
                        + "of the density of the\n" + "pure water at 15ºC?", 'b',
                        "a.60 Kg/m3\n", "b.1000 Kg/m3\n", "c.14.5 Kg/m3\n", "d.1.0 Kg/m3\n"));

                questions.add(new Question(7, 2, "When the density at the observed "
                        + "temperature of\n" + "a crude oil, which table should be "
                        + "used to obtain the density at 15ºC?", 'a', "a. TABLE 53A\n",
                        "b.TABLE 53B\n", "c.TABLE 24A\n", "d.TABLE 24B\n"));

                questions.add(new Question(8, 2, "How many centimeters is an inch?",
                        'c', "a. 3.16\n", "b.2.75\n", "c.2.54\n", "d.a, b and c are false\n"));

                questions.add(new Question(9, 2, "What is the equivalent of 0 degrees "
                        + "Celsius on the scale Fahrenheit?", 'd', "a. 0 °F\n", "b.12 °F\n",
                        "c. 50 °F\n", "d.32 °F\n"));

                questions.add(new Question(10, 2, "The density used in the measurement"
                        + " tables (Tables 54A, B, C,D) is it in air or vacuum?", 'b',
                        "a. Air\n", "b.Vacuum\n", "c. IDK\n", "d.Only god knows\n"));

                //Here we create level 3 questions
                questions.add(new Question(11, 3, "A product has an API density at 60ºF "
                        + "of 21.3. What table\n" + "should be used to obtain the density"
                        + " equivalent to 15 degrees Celsius?", 'c', "a. TABLE 8\n",
                        "b. TABELE 11\n", "c. TABLE 3\n", "d. TABLE 6B\n"));

                questions.add(new Question(12, 3, "Which table should be used to convert"
                        + " m3 at 15 ° C to tons metric in air?", 'b', "a. TABLE 53A\n",
                        "b. TABLE 56\n", "c. TABLE 54B\n", "d. TABLE 13\n"));

                questions.add(new Question(13, 3, "Which table should be used to convert"
                        + " barrels at 60ºF to meters cubic at 15 ° C?", 'b',
                        "a. TABLE 11\n", "b. TABELE 52\n", "c. TABLE 6A\n", "d. TABLE 13\n"));

                questions.add(new Question(14, 3, "What does the API Gravity scale indicate?",
                        'a', "a. Relative density\n", "b. Volume\n", "c. Width\n",
                        "d. Weigth\n"));

                questions.add(new Question(15, 3, "The density of a liquid will change "
                        + "as its temperature changes.", 'a', "a. True\n", "b. False\n",
                        "c. Tell me more\n", "d. IDK\n"));

                //Here we create level 4 questions
                questions.add(new Question(16, 4, "Which chapter of the MPMS API provides"
                        + " guidelines for identifying the source of free water?", 'd',
                        "a. Chapter 8.3\n", "b. Chapter 15\n", "c. Chapter 17.2\n",
                        "d. Chapter 17.3\n"));

                questions.add(new Question(17, 4, "A volumetric loss is normally\n"
                        + " determined by comparing the quantity received at the port\n "
                        + "of discharge with the quantity of the Bill of Lading at the \n"
                        + "port of loading. In a crude oil, how much volume does it"
                        + " compare?\n", 'a', "a. TCV\n", "b. TOV\n", "c. GOV\n",
                        "d.a , b and c are false \n"));

                questions.add(new Question(18, 4, "After deducting the OBQ or ROB, what"
                        + " volume is used to calculate an experience factor (VEF)\n?",
                        'a', "a. TCV\n", "b. TOV\n", "c. GSV\n", "d. GOV \n"));

                questions.add(new Question(19, 4, "Volumetric shrinkage occurs when raw"
                        + " materials are mixed of different densities. Which chapter \n"
                        + "of the API MPMS does the aspect of volumetric shrinkage?\n?",
                        'd', "a. Chapter 9.3\n", "b. Chapter 12.1\n", "c. Chapter 12.2\n",
                        "d. Chapter 12.3\n"));

                questions.add(new Question(20, 4, "If the boat has boards for the wedge "
                        + "certified by a independent body, can be used instead of \n"
                        + "calculating thewedge oneself.\n", 'a', "a. True\n", "b. False\n",
                        "c. Tell me more\n", "d. IDK\n"));

                //Here we create level 5 questions
                questions.add(new Question(21, 5, "Can the volume of free water be \n "
                        + "calculated using the formula wedge, if the water does not \n"
                        + " touch the forward bulkhead?", 'a', "a. Yes \n", "b. No\n",
                        "c. Tell me more\n", "d. IDK\n"));

                questions.add(new Question(22, 5, "What is called the load that adheres\n"
                        + " to vertical walls of a tank?\n ", 'b', "a. Slops \n", "b. Clingage\n",
                        "c. Coatage\n", "d. Klingons\n"));

                questions.add(new Question(23, 5, "If the ship is at an open sea berth \n "
                        + "and rocking so that the load in the tank oscillates by more\n "
                        + "than 3 mm, What is the minimum number of measurements to be made? \n",
                        'b', "a. One \n", "b. Two\n", "c. Three\n", "d. Five\n"));

                questions.add(new Question(24, 5, "Regardless of the product, and in \n"
                        + "accordance with IP475 / ISO 3170, what is the maximum degree \n"
                        + " of filling of a container?\n", 'c', "a. 50% \n", "b. 80%\n",
                        "c. 95%\n", "d. 100% \n"));

                questions.add(new Question(25, 5, "According to the ‘International \n"
                        + "Safety Guide for Oil Tankers and Terminals' (ISGOTT), what\n "
                        + "should the gas reading be? fuel in a tank to be considered \n"
                        + "safe for entrance of people?\n", 'c', "a.Below 15% \n",
                        "b.Below 10%\n", "c.Below 1 %\n", "d. Below 0.5% \n"));

              
                Question question = new Question();
                switch (counter) {
                    case 1:
                        System.out.println("Level Amareur \n");
                        break;

                    case 2:
                        player.setCurrentScore(100);
                        showIntermediateMsg(player, "Amateur");
                        System.out.println("Level Intermediate\n");
                        break;

                    case 3:
                        player.setCurrentScore(300);
                        showIntermediateMsg(player, "Intermediate");
                        System.out.println("Level Advanced\n");
                        break;

                    case 4:
                        player.setCurrentScore(600);
                        showIntermediateMsg(player, "Advanced");
                        System.out.println("Level Senior\n");
                        break;

                    case 5:
                        player.setCurrentScore(1000);
                        showIntermediateMsg(player, "Senior");
                        System.out.println("Level Expert\n");
                        break;

                    default:
                        player.setCurrentScore(1500);
                        showFinalMsg(player);
                        try {
                            sleep(4000);
                        } catch (Exception e) {

                        }
                        System.exit(0);
                        break;

                }

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

                counter++;

            }

        } else {
            System.out.println("Contest finished");
            System.exit(0);
        }
        tester = false;

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
        System.out.println(player.getName()+" You have now " + player.getCurrentScore() + "USD");
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

            System.out.println("Hello  "+ player.getName());
            System.out.println("You are considered as an " + level+ "\n");
            System.out.println("you got: " + player.getCurrentScore()
                    + "  USD");
            System.out.println("");
            System.exit(0);
        }
        
        
    }
    

}
