package market.Cards;
import market.Owner;

public class BronzeCards extends Card {

	public BronzeCards(Owner ow) {
		super(CardType.BRONZE, ow, 0);
		
	}

	@Override
	public double currentRate() {
		// TODO Auto-generated method stub
		
		if(getTurnover()<100)
			return getInitialRate();
		if(getTurnover()<=300)
			return 1;
		
		return 2.5;
	}

}
