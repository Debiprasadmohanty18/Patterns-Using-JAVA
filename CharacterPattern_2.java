/* Character Triangle Pattern :- 

    A 
    A B 
    A B C 
    A B C D 
    A B C D E 

 */

public class CharacterPattern_2 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<n;i++)
        {
            char ch = 'A';
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch + " ");
                ch = (char) (ch + 1);
            }
            System.out.println();
        }
    }
}
