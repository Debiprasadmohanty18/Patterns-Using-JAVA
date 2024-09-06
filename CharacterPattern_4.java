/*  Character Pattern-4 :-
  
        AAAAA
         BBBB
          CCC
           DD
            E
 */

public class CharacterPattern_4 {
    public static void main(String[] args) {
        int n=5;
        char ch = 'A';
        for(int i=0;i<n;i++)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int k=n-i;k>0;k--)
            {
                System.out.print(ch);
            }
            ch = (char)(ch + 1);
            System.out.println();
        }
    }
}
