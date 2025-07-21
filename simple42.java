package learnInit;

public class simple42 {
    public static void main(String[] args) {
         
        for (int i = 0; i < 4; i++) {
            char letter = 'A'; 
            for (int j = 0; j < 4- i - 1; j++) {
                System.out.print("    ");
            }
            
            for (int j = 0; j <= i; j++) {
                System.out.print(letter + "       ");
                letter++;
            }
            System.out.println(); 
        }
    }
}
