class Q3
{

    public static int chainLength(int n)
    {
        int count = 0;
        while(n > 1)
        {
            count++;
            if(n % 2 == 0)
                n /= 2;
            else
                n = 3 * n + 1;
        }
        return count + 1;
    }


    public static void main(String[] args)
    {
        int max = 0;
        for(int i = 1 ; i <= 1000000 ; i++)
            max = Math.max(max, chainLength(i));
        System.out.println(max);
    }    
}
