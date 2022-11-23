class factorial
{
    public static void main(String[] args)
    {
        if(args.length!=1)
        {
            System.out.printf("\nYou Must Provide 1 Arguement");
            return;
        }//end if

        int x;
        x=Integer.parseInt(args[0]);
        if(x<0)
        {
            System.out.printf("\nCannot Find Factorial of Negative integer");
            return;
        }//end if
        double fact=1;
        int i;
        for(i=1;i<=x;i++)
        {
            fact=fact*i;
        }//end for

        System.out.println("\nFactorial is: "+fact);
        System.out.printf("\nFactorial is %e ",fact);

    }//end main
}//end class
