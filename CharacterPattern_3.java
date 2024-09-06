/* Character Triangle Pattern-2 :-  

    A 
    B C 
    D E F 
    G H I J 
    K L M N O 

 */

public class CharacterPattern_3 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch + " ");
                ch = (char)(ch + 1);
            }
            System.out.println();
        }
    }
}
