import java.util.Scanner; 
public class VowelsOccurance {
    static boolean isVowel(char ch) {
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }

    static int vowelPairs(String s, int n) {
        int cnt = 0;
        for (int i = 0; i < n - 1; i++) {

            if (isVowel(s.charAt(i)) && isVowel(s.charAt(i + 1)))
                cnt++;
        }
        return cnt;
    }

    public static void main(String args[]) {
        String s;
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Enter a string");
        s = sc.nextLine();
        int n = s.length();
        System.out.print(vowelPairs(s, n));
    }
}


