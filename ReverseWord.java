import java.util.*;

public class ReverseWord {

    public void reverseEachWord(String str1) {
        String[] each_words = str1.split(" ");
        String revString = "";
        for (int i = 0; i < each_words.length; i++) {
            String word = each_words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            revString = revString + reverseWord + " ";
        }
        System.out.println(revString);
    }

    public static void main(String[] args) {
        ReverseWord obj = new ReverseWord();
        String StrGiven;
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Enter a string: ");
        StrGiven = sc.nextLine();

        System.out.println("The given string is: " + StrGiven);
        System.out.println("The string reversed word by word is: ");
        obj.reverseEachWord(StrGiven);
    }
}

    

