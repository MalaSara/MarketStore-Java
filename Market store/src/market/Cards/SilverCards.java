package market.Cards;

import market.Owner;
public class SilverCards extends Card {

	public SilverCards(Owner ow) {
		super(CardType.SILVER,ow,2);
		
	}

	@Override
	public double currentRate() {
		if (getTurnover() <= 300) {
            return getInitialRate();
        }

        return 3.5;
	}

}
