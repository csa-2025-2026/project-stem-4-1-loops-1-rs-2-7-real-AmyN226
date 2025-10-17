import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter numbers to add. Enter -1 to stop");

    int N = 0;
    int sum = 0;
    while (N != -1)
    {
        N = scan.nextInt();
        sum += N;
    }
    sum++;
    System.out.println("The sum is: " + sum);
    

    //problem 2
    
    System.out.println("enter numbers to find max. enter -1 to stop");

    int currentNum = 0;
    int max = 0;
  
    while (N != -1)
    {
      currentNum = scan.nextInt();
        if (currentNum > max)
        {
          max = currentNum;

        }
        System.out.println("The max is: " + max);
    }



    
    
   scan.close();
  }
}
