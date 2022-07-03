//Program to check the number is prime or not
class PrimeNumber
{

    public static void main(String[] args)
    {

        int num = 29;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i)
        {
            // condition for nonprime
            if (num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}