/* Floyd's Triangle Pattern :- 
  
    1 
    2 3 
    4 5 6 
    7 8 9 10 

 */

public class FloydTrianglePattern {
    public static void main(String[] args) {
        int n = 4;
        int num = 1;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j>=0;j--)
            {
                System.out.print(num + " ");
                num++;

            }
            System.out.println();
        }
    }
    
}
