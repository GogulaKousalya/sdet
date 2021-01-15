package JavaActivity2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlaneS2B {
	class Plane {
	    private List<String> passengers;
	    private int maxPassengers;
	    private Date lastTimeTookOf;
	    private Date lastTimeLanded;
	    
	    public Plane (int maxPassengers)
	    {
	    	this.maxPassengers=maxPassengers;
	    	this.passengers=new ArrayList<>();
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
