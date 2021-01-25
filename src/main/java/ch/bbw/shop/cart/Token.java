package ch.bbw.shop.cart;

import java.util.UUID;

public class Token {
	
	private UUID id;

	public Token() {
		super();
		this.id = UUID.randomUUID();
	}

	public String getId() {
		return id.toString();
	}

}
