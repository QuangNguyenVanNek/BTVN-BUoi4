import java.util.Scanner;

public class Bai5 {
    public static int Gan(char c){
        int[] a = {1,    5,   10, 50,  100, 500, 1000};
        char[] b ={'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        for(int i = 0; i < 7; i++){
            if(c == b[i]){
                return a[i];
            }
        }
        return 0;
    }
    public static boolean Case(char a, char b){
        if(a == 'I' && b == 'V' || a == 'I' && b == 'X' || a == 'X' && b == 'L'
                ||a == 'X' && b == 'C'||a == 'C' && b == 'D'||a == 'C' && b == 'M'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int Sum = 0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] a = s.toCharArray();
        System.out.println(s.length());
        if(s.length() >= 2){
            for(int i = 0; i < s.length()-1; i++){
                if(Case(a[i], a[i+1]) == true){
                    Sum += (Gan(a[i + 1]) - Gan(a[i]));
                    i++;
                    if(i == s.length() - 2){
                        Sum += Gan(a[s.length() - 1]);
                    }
                }else{
                    Sum += Gan(a[i]) ;
                    if(i == s.length() - 2){
                        Sum += Gan(a[s.length() - 1]);
                    }
                }
            }
        }else{
            Sum = Gan(a[0]);
        }
        System.out.println(Sum);
    }
}
