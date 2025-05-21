package Q7;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence="", replacedword="", replacementword="";

        System.out.println("Enter the sentence :");
        sentence = scanner.nextLine();
        System.out.println("Enter the replace word :");
        replacedword = scanner.nextLine();
        System.out.println("Enter the replacement wrod :");
        replacementword = scanner.nextLine();

        String[] words = sentence.split(" ");

        for (int i=0; i< words.length; i++){
            if (words[i].equalsIgnoreCase(replacedword)){
                words[i]=replacementword;
            }
        }
        String modifiedword = String.join(" ",words);

        System.out.println("Modified Word : "+modifiedword);


    }
}