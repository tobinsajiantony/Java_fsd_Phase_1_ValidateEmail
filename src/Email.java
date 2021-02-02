import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		ValidateEmail validateEmail = new ValidateEmail();
		System.out.println("Enter the number of emails you want to add");
		Scanner s = new Scanner(System.in);
        int noOfInputs = s.nextInt();
        String[] emailInputs = new String[noOfInputs];
        for(int i=0; i< noOfInputs; i++) {
        	System.out.println("Enter the email no. "+(i+1));
        	String temp = s.next();
        	if(validateEmail.CheckEmail(temp)) {
        		emailInputs[i] = temp;
        	}
        	else {
        		System.out.println("The Entered String is not a valid email !");
        		i--;
        	}
        	
        }
        System.out.println("The List of emails you have entered are: ");
        for(int i=0; i< noOfInputs; i++) {
        	System.out.println(emailInputs[i]);
        }
        System.out.println("Please enter the email that you want to search: ");
    	String searchString = s.next();
        
        while(validateEmail.CheckEmail(searchString) != true) {
        	System.out.println("The entered email is not valid! Please try again.");
            searchString = s.next();
        }
        int flag = 0;
        for(int i=0; i< noOfInputs; i++) {
        	if(emailInputs[i].equals(searchString))
        	{
        		flag = 1;
        		break;
        	}
        }
        if(flag == 1) {
        	System.out.println("The entered email is available");
        }
        else {
        	System.out.println("Could not find the email!");
        }
	}

}
