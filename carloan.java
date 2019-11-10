```java
package carloan;
import java.util.Scanner;

public class CarLoan {
	
public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);

	float carPrice, downPayment, Principal, Balance, totalInterest, monthlyRepayment, Interest, interestRate;
        int loanPeriod, Years = 0;
           
                System.out.println("ENTER CAR PRICE(RM):");
	        carPrice = input.nextFloat();
                if(carPrice < 30000){    
		System.out.println("ERROR!! CAR PRICE CANNOT LESS THAN RM30 000 ");
               }
                
                System.out.println("ENTER DOWNPAYMENT(RM): ");
		downPayment = input.nextFloat();
                if (downPayment >= carPrice) {
		System.out.println("THE LOAN WAS PAID IN FULL");
                }
                
                System.out.println("ENTER LOAN PERIOD(YEARS) : ");
		loanPeriod= input.nextInt();
                if (loanPeriod  < 5 ) {
		System.out.println("THE LOAN PERIOD CANNOT LESS THAN 5 YEARS");
		}
                else if (loanPeriod >  9 ) {
		System.out.println("THE LOAN CANNOT BE LONGER THAN 9 YEARS" );
                }
                
                System.out.println("ENTER INTEREST RATE(%) :");
                interestRate = input.nextFloat();
                if (interestRate <3){
                System.out.println("INTEREST RATE CANNOT LESS THAN 3%"); 
                }
                else if (interestRate >7){
                System.out.println("INTEREST RATE CANNOT MORE THAN 7%"); 
                }

        totalInterest = (carPrice-downPayment)*loanPeriod*(interestRate/100);
        monthlyRepayment = (carPrice- downPayment + totalInterest)/(loanPeriod*12);      

        System.out.printf("---------------------------------------\n");
	System.out.printf("YOUR MONTHLY REPAYMENT IS: RM%.2f\n", monthlyRepayment );
        System.out.printf("---------------------------------------\n");
        
        System.out.printf("\t\t................................................................\n");
        System.out.printf("\t\t%s%17s%20s%20s", "Years", "Principal", "Interest", "Balance");   
        
        while (Years <= loanPeriod){ 
            
            Principal = monthlyRepayment * 12 * Years;
            Interest = (carPrice-downPayment)*(interestRate/100)*Years;
            Balance = (monthlyRepayment * loanPeriod)* 12- Principal;
        System.out.printf("\n\t\t%3d%,20.2f%,20.2f%,20.2f", Years, Principal , Interest , Balance);
        Years++;
        }
        System.out.printf("\n\t\t...............................................................\n");
    }
 }   

```
        
        
        
        

