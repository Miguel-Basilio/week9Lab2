import java.util.Scanner;


 public class GuessGame2 {
	 
	
	 
 public static void main(String[] args) {
Scanner in = new Scanner(System.in);

int myRandomNum;
int numberGuess;
int lowNumber;
int highNumber;
getNumber getNumber = new getNumber();
	System.out.println("please enter a low number: ");
lowNumber = in.nextInt();
 getNumber.setLowNumber(0);
 
 System.out.println("Please enter a high number");
 highNumber = in.nextInt();
 getNumber.setHighNumber(0);
 
 System.out.printf("Please enter a number Between %d and %d; ", lowNumber, highNumber);
 numberGuess= in.nextInt();
 myRandomNum = getNumber.GetANumber();
 
 if (numberGuess == myRandomNum)
	 System.out.printf("Congratulations you guess it. the correct number is %d\n", numberGuess);
 else if (numberGuess > myRandomNum)
	 System.out.printf("your number is %d,  computer number is %d you failed", numberGuess, myRandomNum);
 else 
	 System.out.printf("Your number is too Small %d , compare to mine %d",numberGuess, myRandomNum);
	 
 }
 }
 