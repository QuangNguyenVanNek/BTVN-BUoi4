import java.util.Scanner;

public class Bai2 {
    public static String Remove(String s, int pos) {
        return s.substring(pos + 1);
    }
    public static int Pos(String s) {
        int pos = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                pos = i;
                break;
            }
        }
        return pos;
    }
    public static void main(String[] args) {
        int max = 0;
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        for(int i = 0; i <= s1.split( "\\s").length + 1; i++){
            for (String w : s1.split("\\s", 0)) {
                if(s.contains(w) == true){
                    cnt = 1;
                    if(max < w.length()){
                        max = w.length();
                    }
                }
                s1 = Remove(s1, Pos(s1));
                break;
            }
        }
        if(cnt == 0){
            System.out.println("0");
        }else{
            System.out.println(max);
        }
    }
}
