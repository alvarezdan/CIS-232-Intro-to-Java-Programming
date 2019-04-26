package pkgPathways;



public class MetroCard {
	private int metroNum;
	private float metroPrice;
	private String cardtype;
	
	
	MetroCard()
	{	metroNum = 0;
		metroPrice = 0.00f;	
		cardtype = "";
	}
	
	MetroCard(int mn, float mp, String c) 
	{	metroNum = mn;
		metroPrice = mp;	
		cardtype = c;
	}
	
	public int getMetroNum() {
		return metroNum;
	}


	public void setMetroNum(int metroNum) {
		this.metroNum = metroNum;
	}


	public float getMetroPrice() {
		return metroPrice;
	}


	public void setMetroPrice(float metroPrice) {
		this.metroPrice = metroPrice;
	}


	public String getType() {
		// TODO Auto-generated method stub
		return cardtype;
	}


	public void setType(String c) {
		// TODO Auto-generated method stub
		cardtype = c;
	}

}