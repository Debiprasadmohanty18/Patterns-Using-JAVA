/* Reverse Triangle Number Pattern :- 

    1 
    2 1 
    3 2 1 
    4 3 2 1 
    5 4 3 2 1

 */

public class ReverseNumberTrianglePattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
