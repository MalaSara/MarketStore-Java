package market;

import java.text.DecimalFormat;

import market.Cards.*;
import market.Payment;

public class Main {

	private static void print(int purchaseValue,Card card) {
	
		DecimalFormat dec=new DecimalFormat("#0.00");
		
		System.out.println(card.getType() + ":\n"
				 + "Purchase value: $" + dec.format(purchaseValue) + "\n"
	                + "Discount rate: " + dec.format(Payment.discountRate(card)) + " %" + "\n"
	                + "Discount: $" + dec.format(Payment.discount(purchaseValue, card)) + "\n"
	                + "Total: $" + dec.format(Payment.total(purchaseValue, card)) + "\n");
	}
	
	

	
	public static void main(String[] args)
	{
			
		Owner ow1=new Owner("Milan","Bronzic");
		Card cardbr=new BronzeCards(ow1);
		print(150,cardbr);
		
		Owner ow2=new Owner("Lazar", "Srebrenovic");
		Card cardsil=new SilverCards(ow2);
		cardsil.setTurnover(600);
		print(850,cardsil);
		
		Owner ow3=new Owner("Zlatan", "Milic");
		Card cardgold=new GoldenCards(ow3);
		cardgold.setTurnover(1500);
		print(1300,cardgold);
		
		
	}
}
