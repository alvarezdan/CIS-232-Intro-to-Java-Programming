package pkgPathways;


public class Passenger {
	int passengerID;
	String passName;
	long passCCNum;
	int passTIN;

	
	public int getPassengerID() {
		return passengerID;
	}


	public void setPassengerID(int passengerID) {
		this.passengerID = passengerID;
	}


	public String getPassname() {
		return passName;
	}


	public void setPassname(String passname) {
		this.passName = passname;
	}


	public long getPassccn() {
		return passCCNum;
	}


	public void setPassccn(long passccn) {
		this.passCCNum = passccn;
	}


	public int getPasstin() {
		return passTIN;
	}


	public void setPasstin(int passtin) {
		this.passTIN = passtin;
	}


	Passenger()
	{	passengerID = 0;
		passName = "";
		passCCNum = 0;
		passTIN = 0;	}

	
	Passenger(int id, String name, long ccn, int tin)
	{	passengerID = id;
		passName = name;
		passCCNum = ccn;
		passTIN = tin;	}
}
	
	