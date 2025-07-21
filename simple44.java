package learnInit;

public class simple44 {
    public static void main(String[] args) {
        int rows = 4; 
        
       
        for (int i = 0; i < rows; i++) {
            char letter = 'A'; 
            for (int j = 0; j < rows - i - 1; j++) {
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
