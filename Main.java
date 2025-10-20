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
    
    
    int num;
    System.out.println("How many numbers do you want to input?");
    num = scan.nextInt();
    

    int counter = 0;
    int userInput;
    int max = Integer.MIN_VALUE;

    while(counter < num)
    {
      userInput = scan.nextInt();
      
      if (userInput > max)
      {
        max = userInput;
      }
      counter++;
    }

    System.out.println("The max is " + max);

    //Problem 3

    String word = "calculator";
    int index = 0;
    int counter1 = 0;
  
    while (counter1 < word.length())
    {
      String currentLetter = word.substring(index, index + 2); // gets 2 letter at a time
      counter1++;
      index = index + 2;

    }
    
    System.out.println(currentLetter);
    
   scan.close();
  }
}
