 package learnInit;
public class simple43 {
 public static void main(String[] args) {
		        int rows = 4; 
		        
		        
		        for (int i = 0; i < rows; i++) {
		            char letter = (char) ('A' + i); 
		            
		            for (int j = 0; j < rows - i - 1; j++) {
		                System.out.print("    ");
		            }
		            
		            for (int j = 0; j <= i; j++) {
		                System.out.print(letter + "       ");
		            }
		            System.out.println(); 
		        }
		    }   
}
