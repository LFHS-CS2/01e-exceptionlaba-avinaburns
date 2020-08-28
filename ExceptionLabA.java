import java.io.*;

class ExceptionLabA
{
    public static void main(String args[]) throws IOException
    {
        int numberOne = 0, numberTwo = 0;
        while (numberOne != -9999)
        {
            BufferedReader console = new BufferedReader(new InputStreamReader (System.in));
            System.out.println("Please enter one number (-99999 to stop):");
            String input = console.readLine();
            numberOne = Integer.parseInt(input);
            if (numberOne == -99999)
            {
                break;
            }
            else
            {
                System.out.println("Please enter another number:");
                input = console.readLine();
                numberTwo = Integer.parseInt (input);
                try
                {
                    int numberThree = numberOne / numberTwo;
                    System.out.println("numberOne divided by numberTwo = " + numberThree);
                }
                catch(Exception E)
                {
                    System.out.println("General Exception Thrown");
                }
            }
        }
        
        System.out.println("Goodbye");
    }
}

