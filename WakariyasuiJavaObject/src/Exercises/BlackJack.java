package Exercises;

import lib.Util;

public class BlackJack {
	private CardDeck deck;
	private Dealer dealer;
	private Player player;
	
	static final String DEALER_ICON = "□";
	static final String PLAYER_ICON = "■";
	static final String BANNER = "\n■□■□■□■□Blackjack■□■□■□■□";
	static final int CARDS = 52;
	static final String Q_CONTONUE = "続けますか(Enter/n)";
	static final String Q_DEAL = "さらにカードを引きますか(Enter/n)";
	static final int LIMIT = 17;
	static final String EVEN = "引き分け";
	static final String WIN = "あなたの勝ち";
	static final String LOST = "ディーラーの勝ち";
	static final String ANIMATION_ICON = "□■";
	static final int TIMES = 25;
	static final int DELAY = 20;
	
	public BlackJack(String dname, String pname) {
		this.deck = new CardDeck(CARDS);
		this.dealer = new Dealer(dname, DEALER_ICON, this.deck);
		this.player = new Player(pname, PLAYER_ICON, this.deck);
	}
	
	public void initialize() {
		if (deck.size()<LIMIT) {
			this.deck = new CardDeck(CARDS);
		}
		this.dealer.initialize();
		this.player.initialize();
	}
	
	public void show() {
		System.out.println("");
		System.out.println(this.dealer);
		System.out.println(this.player);
	}
	
	public void play() {
		String str;
		do{
			System.out.println(BANNER);
			initialize();
			showHalf();
			deal();
			dealer.over16();
			animation(TIMES, DELAY, ANIMATION_ICON);
			show();
			judge();
		}
		while((str=Util.getString(Q_CONTONUE))==null);
		
	}
	
	public void showHalf() {
		System.out.println("");
		System.out.println(this.dealer.half());
		System.out.println(this.player);
	}
	
	public void deal() {
		while (this.player.score()<21) {
			String str = Util.getString(Q_DEAL);
			if (str != null) {
				break;
			}
			this.player.addACard();
			showHalf();
		}
	}
	
	public void judge() {
		int d = dealer.score();
		int p = player.score();
		if (d > 21 && p > 21 || d == p) {
			System.out.println(EVEN);
		} else if(p <= 21 && (d > 21 || d < p)) {
			System.out.println(WIN);
		} else {
			System.out.println(LOST);
		}
	}
	
	public void animation(int times, int delay, String icon) {
		System.out.println("");
		try {
			for (int i = 0; i < times; i++) {
				Thread.sleep(delay);
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
