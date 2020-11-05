public class Q6
{
    public  static boolean checkPrime(int number)
    {
        boolean b = true;
        for(int i = 3 ; i <= Math.sqrt(number) && b ; i += 2)
        {
            if(number % i == 0)
                b = false;
        }
        return b;
    }

    public static void main(String args[])
    {
        int serialNumber = 1 ; int number = 0;
        for(int i = 3 ; serialNumber < 10001 ; i+=2)
        {
            if(checkPrime(i))
            {
                serialNumber++;
                number = i;
            }  
        }
        System.out.println(number);
    }
}