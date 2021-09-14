/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import static java.lang.Thread.sleep;

/**
 *
 * @author Sandy Jessith Chico
 */
public class Test {

    public static int input;

    public static void main(String[] args) {

        Contest.explainMetodology();

        //Player information
        Scanner sc = new Scanner(System.in);
        Player player = new Player();

        input = Contest.welcomePlayer(player, sc);

        Question questions = new Question();

        questions.startGame(input, player, sc);
    

    }
}
