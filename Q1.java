import java.io.*;
import java.util.*;


class Q1
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String dna = input.readLine();
        String rna = "";
        boolean b = true;
        HashMap<Character, Character> map = new HashMap<>();
        map.put('G', 'C');
        map.put('C', 'G');
        map.put('T', 'A');
        map.put('A', 'U');
        
        for(int i = 0 ; i < dna.length() && b ; i++)
        {
            char c = dna.charAt(i);
            if(map.containsKey(c))
                rna += map.get(c);
            else
                b = false;
        }

        if(b)
            System.out.println(rna);
        else
            System.out.println("Invalid Input");
    }    
}
