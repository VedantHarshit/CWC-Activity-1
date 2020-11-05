import java.io.*;


class Q2
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int rounds = 3;
        int userScore = 0;
        char[] ar = {'R', 'P', 'S'};
        while(rounds-->0)
        {
            System.out.println("Enter User's choice:");
            char user = input.readLine().charAt(0);
            char comp = ar[(int)(Math.random() * (3))];
            System.out.println("Computer's Choice (randomly generated):");
            System.out.println(comp);
            if(user != comp)
            {
                if(user == 'R' && comp == 'S' || user == 'P' && comp == 'R' || user == 'S' && comp == 'P')
                {
                    System.out.println("User won the round");
                    userScore++;
                }
                else
                    System.out.println("Computer won the round");
            }
            else
                System.out.println("Tie of the round");
        }
        if(userScore > 3- userScore)
            System.out.println("User won the round \n3 Rounds over, User scored " + userScore + ", user won the game");
        else
            System.out.println("Computer won the round \n3 Rounds over, Computer scored " + (3 - userScore) + ", computer won the game");
    }
}
