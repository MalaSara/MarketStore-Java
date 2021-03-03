package market.Cards;

import market.Owner;

public class GoldenCards extends Card {

	public GoldenCards(Owner ow){
		
			super(CardType.GOLD, ow, 2);
	}

	@Override
	public double currentRate() {
		// TODO Auto-generated method stub
		
		if(getTurnover()<100)
			return getInitialRate();
		
		double rateGrows=1;
		double maxRate=10;
		
		
		double rate= rateGrows*(int) (getTurnover()/100);
		double curRate=getInitialRate()+rate;
		if(curRate>maxRate)
			return maxRate;
		
		return curRate;
	}

}
