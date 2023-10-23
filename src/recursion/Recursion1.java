package recursion;

public class Recursion1 {

    public static void main(String[] args)
    {
        long factAnswer = factRec(14);

        for (int i = 1; i <= 10; i++)
        {
            factAnswer = fact(i);
            System.out.println("The factorial of " + i + " is " + factAnswer);
        }
    }

    public static long fact(int num)
    {
        long result = 1;

        for(int k = 1; k <= num; k++)
        {
            result*=k;
        }

        return  result;
    }

    public static long factRec(int num)
    {
        if(num == 1)
        {
            return 1;
        }

        return factRec(num-1) * num;
    }

    public static String reverse(String str)
    {
        String answer = "";
        for (int i = str.length() - 1; i >= 0; i--)
        {
            answer = answer + str.charAt(i);
        }
        return answer;
    }

    public static String reverseRec(String str)
    {
        return ""; // remove this when you start coding
    }
}