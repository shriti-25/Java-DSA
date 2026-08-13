class ArmstrongDigit
{
    public static void main(String[] args)
    {
        while(true) 
        {
            System.out.println("Enter the number");

            int x2 = new java.util.Scanner(System.in).nextInt();

            int x1 = x2;
            int temp = x2;
            int digit = 0;
            int rev = 0;

            // Count total digits
            while(temp > 0)
            {
                digit++;
                temp = temp / 10;
            }

            // Calculate Armstrong sum
            while(x1 > 0)
            {
                int z = x1 % 10;
                x1 = x1 / 10;

                rev = rev + (int)Math.pow(z, digit);

            }

            if(rev == x2)
                System.out.println("Number is Armstrong");
            else
                System.out.println("Number is not Armstrong");
        }
    }
}