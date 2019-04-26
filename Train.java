package pkgPathways;
import java.util.Date;


public class Train 
{
	private String trainNumber;
	private String depart_Station;
	private String arrival_Station;
	private int borough_Code;
	private Date depart_Time;
	private Date arrival_Time;
	
	Train()
	{	trainNumber = "";
		depart_Station = "";
		arrival_Station = "";
		borough_Code = 0;
		depart_Time = null;
		arrival_Time = null;	}
	
	Train(String tNumb,String dS,String aS,int bC, Date dT, Date aT)
	{	trainNumber= tNumb;
		depart_Station = dS;
		arrival_Station = aS;
		borough_Code = bC;
		depart_Time = dT;
		arrival_Time = aT;	}

	public String getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getDepart_Station() {
		return depart_Station;
	}

	public void setDepart_Station(String depart_Station) {
		this.depart_Station = depart_Station;
	}

	public String getArrival_Station() {
		return arrival_Station;
	}

	public void setArrival_Station(String arrival_Station) {
		this.arrival_Station = arrival_Station;
	}

	public int getBorough_Code() {
		return borough_Code;
	}

	public void setBorough_Code(int borough_Code) {
		this.borough_Code = borough_Code;
	}

	public Date getDepart_Time() {
		return depart_Time;
	}

	public void setDepart_Time(Date depart_Time) {
		this.depart_Time = depart_Time;
	}

	public Date getArrival_Time() {
		return arrival_Time;
	}

	public void setArrival_Time(Date arrival_Time) {
		this.arrival_Time = arrival_Time;
	}
		
	}
	
	
		


