package market.Cards;

import market.Owner;

public abstract class Card {

	private double turnover;
	private double initRate;
	private CardType type;
	private Owner owner;
	
	Card(CardType ct,Owner ow,double inr){
		this.type=ct;
		this.initRate=inr;
		this.owner=ow;
	}
	
	

	public CardType getType() {
		return type;
	}
	double getInitialRate() {
		return this.initRate;
	}
	
	
	double getTurnover() {
		return this.turnover;
	}
	
	public void setTurnover(double turnover) {
		this.turnover=turnover;
	}
	
	public abstract double currentRate();

	
}
