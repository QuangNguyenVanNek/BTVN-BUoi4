import java.util.Locale;
import java.util.Scanner;

public class Bai4 {
    public static String Remove(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = s.trim().toLowerCase(Locale.ROOT);
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) > 47 && s1.charAt(i) < 58 || s1.charAt(i) == ' ' && s1.charAt(i + 1) == ' ') {
                s1 = Remove(s1, i);
                i--;

            }
        }
        char[] a = s1.toCharArray();
        a[0] = Character.toUpperCase(a[0]);
        System.out.print(a[0]);
        for(int i = 1; i < s1.length(); i++){
            if(a[i] != ' '){
                System.out.print(a[i]);
            }
            if(a[i] == ' '){
                a[i + 1] = Character.toUpperCase(a[i+1]);
                System.out.print(" " + a[i + 1]);
                i++;
            }
        }
    }
}
