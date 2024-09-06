/* Number Pattern-2 :-

     11111
      2222
       333
        44
         5
         
 */

public class NumberPattern_2 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int k=n-i;k>0;k--)
            {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}
