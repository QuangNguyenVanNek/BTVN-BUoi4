import java.util.Locale;
import java.util.Scanner;

public class Bai1 {
    public static String Remove(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = str.toLowerCase(Locale.ROOT);
        int dem = 1;
        for(int i = 0; i < str1.length() - 1; i++){
            if(str1.charAt(i) == ' '){
                continue;
            }
            for(int j = i + 1; j < str1.length(); j++){
                if(str1.charAt(i) == str1.charAt(j)){
                    dem++;
                    str1 = Remove(str1, j);
                }else{
                    continue;
                }
            }
            System.out.println(str1.charAt(i) + ": " + dem);
            dem = 1;
        }
        System.out.println(str1.charAt(str1.length() - 1) + ": 1");
    }
}
