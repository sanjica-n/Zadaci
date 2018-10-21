import java.util.Scanner;
public class Mtrica {
     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int [] [] matrica = {{1, 2, 3}, {2, 3,1}, {3, 2, 1}};
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                System.out.println(matrica[i][j]) ;
            }
        }
       
        System.out.println("Obrnuta matrica je: ");
        for (int i = 0; i < 3; i++) {
           
            for (int j = 3 - 1; j >= 0; j--) {
                System.out.println(matrica[i][j]);
            }
        }
 
    }
}
