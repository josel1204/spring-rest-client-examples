package guru.springframework.api.domain;

import java.io.Serializable;

public class Billing implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Card card;

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}
	
	
}
