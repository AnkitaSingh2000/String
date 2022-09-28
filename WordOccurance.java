import java.util.Scanner;
        
        public class WordOccurance {
            static int Occurrences(String str, String word) {
                String a[] = str.split(" ");
                int count = 0;
                for (int i = 0; i < a.length; i++) {
                    if (word.equals(a[i]))
                        count++;
                }
                return count;
            }
        
            public static void main(String args[]) {
                String str, word;
                Scanner sc = new Scanner(System.in);
                sc.close();
                System.out.println("Enter a string: ");
                str = sc.nextLine();
        
                System.out.println("Enter a word: ");
                word = sc.nextLine();
        
                System.out.println(Occurrences(str, word));
            }
        }
    

