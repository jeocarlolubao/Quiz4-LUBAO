/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz4lubao;

import java.util.Scanner;
import singlylinkedlist.SNode;
import singlylinkedlist.SList;
import quiz4lubao.Words;

/**
 *
 * @author Jeo
 */
public class Sentence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence;
        String decision;
        System.out.println("Enter your sentence: ");
        sentence = input.nextLine();

        String[] words = sentence.split(" ");

        Words[] words1 = new Words[words.length];

        for (int i = 0; i < words1.length; i++) {
            words1[i] = new Words(words[i]);
        }
        for (int i = 0; i < words1.length; i++) {
            System.out.print(words1[i].getWord() + " ");
        }
        int length = words1.length;
        int start = 0;
        for (int i = 0; i < words1.length; i++) {
            System.out.print("\nundo? (y/n): ");
            decision = input.next();
            if (decision.equalsIgnoreCase("y")) {
                while (length >= 0 && start < length ) {                   
                    System.out.print(words1[start].getWord() + " ");
                    start++;
                    length--;
                    if (length == 0) {
                        break;
                    }
                }
            } else {
                System.exit(0);

            }
        }

    }


}
