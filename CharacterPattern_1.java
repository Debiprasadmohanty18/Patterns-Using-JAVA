/* Character Square Pattern :- 

    A B C D E 
    A B C D E 
    A B C D E 
    A B C D E 
    A B C D E 

 */

public class CharacterPattern_1 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<n;i++)
        {
            char ch = 'A';
            for(int j=0;j<n;j++)
            {
                System.out.print(ch + " ");
                ch = (char) (ch + 1);
            }
            System.out.println();
        }
    }
}
