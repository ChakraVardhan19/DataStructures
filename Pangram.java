import java.util.Scanner;
public class Pangram {
    public boolean check (String sen) {
        for (char ch = 'a'; ch <= 'z'; ch++){
            if (!sen.toLowerCase().contains("" + ch)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String pan = sc.nextLine();
        PanChecker pc = new PanChecker();
        assertEquals(true,(boolean) pc.check(pan));
        assertEquals(false,(boolean) pc.check(pan));
        sc.close();
    }
    private static boolean assertEquals(boolean b, boolean check) {
        if ( b != check ) {
            return false;
        } 
        return true;
    }


    
}
