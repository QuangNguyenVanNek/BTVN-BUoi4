import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        float sum = 0;
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 48 && s.charAt(i) <= 57){
                int so = s.charAt(i) - '0';
                sum += so;
                cnt++;

            }
        }
        if(sum == 0){
            System.out.println("False");
        }else{
            System.out.println("True");
            System.out.println(String.format("%.3f", sum/cnt));
        }
    }
}
