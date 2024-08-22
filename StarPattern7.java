/* Star Pattern - 7

    *****
     *****
      *****
       *****
        *****
 */

public class StarPattern7 {
    public static void main(String[] args) {
        for(int i = 0;i<5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<5;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
