import java.util.Scanner;
public class DeleteOccuranceWord {
    static void remove(String str, String word) {

        String msg[] = str.split(" ");
        String new_str = "";

        for (String words : msg) {

            if (!words.equals(word)) {

                new_str += words + " ";
            }
        }

        System.out.print(new_str);
    }

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Enter a string: ");
        str = sc.nextLine();

        String word = "the";

        remove(str, word);
    }
}
