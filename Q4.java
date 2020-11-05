import java.io.*;
import java.util.*;


class Q4
{

    public static boolean isLeap(int y)
    {
        return (y % 4 == 0 && y % 100!= 0) || y % 400 == 0;    
    }

    public static void main(String[] args)throws IOException
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int ar[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dayNumber = 0;
        HashMap<String, Integer> monthNumber = new HashMap<>();
        monthNumber.put("January", 1);
        monthNumber.put("February", 2);
        monthNumber.put("March", 3);
        monthNumber.put("April", 4);
        monthNumber.put("May", 5);
        monthNumber.put("June", 6);
        monthNumber.put("July", 7);
        monthNumber.put("August", 8);
        monthNumber.put("September", 9);
        monthNumber.put("October", 10);
        monthNumber.put("November", 11);
        monthNumber.put("December", 12);

        System.out.print("Enter a date: ");
        String date = input.readLine();
        if(isLeap(Integer.parseInt(date.substring(date.lastIndexOf(" ") + 1))))
            ar[2]++;
        int month = monthNumber.get(date.substring(date.indexOf(" ") + 4 , date.lastIndexOf(" ")));

        for(int i = 1 ; i < month ; i++)
            dayNumber += ar[i];

        dayNumber += Integer.parseInt(date.substring(0, date.indexOf(" ")));

        System.out.println("Day Number:" + dayNumber);
    }    
}
