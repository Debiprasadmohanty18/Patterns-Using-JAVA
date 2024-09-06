/* Number Square pattern :- 

    1 2 3 4 5 
    1 2 3 4 5 
    1 2 3 4 5 
    1 2 3 4 5 
    1 2 3 4 5 
     
 */

public class NumberPattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<n;i++)
        {
            int num = 1;
            for(int j=0;j<n;j++)
            {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
