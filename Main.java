
/*
Lab 4
Partners: Evan Schroeder and Andrew Kaiser
Date: 9/22/20
*/
import java.util.Random;

class Main {
  public static void main(String[] args) {

    Random r = new Random();
    int randomNum = r.nextInt(51);

    System.out.println("The Random number is: " + randomNum);
    for (int i = randomNum; i >= 0; i--) {
      System.out.println(i);
    }

    
    if(randomNum<=25)
    {
       System.out.println("Ahoy Mateys!"); 
    }
    else if (randomNum>25 && randomNum<42)
    {
       System.out.println("CannonBall!"); 
    }
    else
    {
      System.out.println("Blast off!");
    }

     
  }
}