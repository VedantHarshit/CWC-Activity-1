public class Q5
{
    public static boolean checkPalindrome(int number)
    {
        int rev = 0, temp = number;
        while(temp != 0)
        {
            rev = (rev * 10) + (temp % 10);
            temp /= 10;
        }
        if(rev == number)
            return true;
        else
            return false;
    }
    
    
    public static void main(String args[])
    {
        int max = 0;
        for(int i = 100 ; i <= 999 ; i++)
        {
            for(int j = i ; j <= 999 ; j++)
            {
                int product = i * j;
                if(checkPalindrome(product))
                    max = Math.max(product, max);
            }
        }
        System.out.println(max);
    }
}