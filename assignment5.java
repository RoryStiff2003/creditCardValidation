package creditCardValidation;
import java.util.Scanner;

public class assignment5 {
    public static void main(String[] args) {
        
    }

    /**
 * Description: This class recreates the process of validating credit cards
 */
public class CreditCardValidation {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

            //tell the user to enter a credit card number as long
            System.out.println("Enter a credit card number as a long: ");
            //assign variable as a long and use input.nextLong
            long creditCardNumber = input.nextLong();
            
   
            
            //call the methode validate validateCreditCardNumber 
            validateCreditCard(creditCardNumber);
   
        
                    
    }

    /**
     * Description: This method takes validates a credit card number against the Luhn check.
     * @param creditCardNumber A credit card number that should have between 13 and 19 digits.
     * @return A boolean if the credit card number is valid or not.
     * @throws Exception Throws a standard exception if credit card is not within the specified range.
     */
    public static boolean validateCreditCard(long  creditCardNumber) throws Exception {
        // The following code ensures that the creditCardNumber is within the allowed size.
        if (getCreditCardSize(creditCardNumber) > 19){
            throw new Exception("Credit Card Number to large. Size: " + creditCardNumber );
        }

        if (getCreditCardSize(creditCardNumber) < 13){
            throw new Exception("Credit Card Number to small. Size: " + creditCardNumber );
        }

        // your code for the Luhn Algorithm goes here.

        return true;
    }

    /**
     * Description: Returns the number of digits or size of the credit card number.
     * @param creditCardNumber A credit card number that is within 13 to 19 digits.
     * @return Size of the Credit Card Number
     */
    public static int getCreditCardSize(long creditCardNumber){
        
        String num = creditCardNumber + "";
        return num.length();
    }

    /**
     * Description: Takes a credit card doubles the even positions number and sums them. I
     * f an even digits doubles to a double-digit number then the individual digits are added into the sum.
     * @param creditCardNumber A credit card number that is within 13 to 19 digits.
     * @return Returns the sum of the doubled even position numbers in the creditCardNumber parameter.
     */
    public static int calculateEvenPositionSum(long creditCardNumber){
        
        int sum = 0; // create a variable to return the sum
        String num = creditCardNumber + ""; //converte to a string
        for (int i = getCreditCardSize(creditCardNumber) - 2; i >= 0; i -= 2){
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);//this method is used to parse the string value to an integer value
            
        }
        return sum; //return sum to evenplace

    }


        //returns this number if it is a single digit, otherwise,
    // return the sum of two digits
    public static int getDigit(int creditCardNumber){
        if (creditCardNumber < 9){ //if card number is less than 9 return the peremater creditcard number
            return creditCardNumber;
        }

        else{
            return creditCardNumber / 10 + creditCardNumber % 10; //else return credit card number modulus 10
        }
    }


    }

    /**
     * Description: Takes a credit card doubles the odd positions number and sums them.
     * @param creditCardNumber A credit card number that is within 13 to 19 digits.
     * @return Returns the sum of the odd position numbers in the creditCardNumber parameter.
     */
    public static int calculateOddPositionSum(long creditCardNumber){
        int sum = 0; // craete a sum var to return later
        String num = creditCardNumber + ""; //convert to a string
        for (int i = getCreditCardSize(creditCardNumber) - 1; i >= 0; i -= 2){
            sum += Integer.parseInt(num.charAt(i) + ""); //parse the string to an integer value
        }

        return sum; //return the sum of odd place
    }
        
    }


    




