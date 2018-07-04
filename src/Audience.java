/**
 * 
 */

/**
 * @author viswe
 *
 */
public class Audience {

	/**
	 * 
	 */
	private int audienceID;
	
	/**
	 * 
	 */
	private String audienceName;
	
	/**
	 * 
	 */
	private int ticketsBooked;
	
	
	/**
	 * @param audienceID
	 * @param audienceName
	 * @param ticketsBooked
	 */
	public Audience(String audienceRecord) {
		this.audienceID = 0;
		this.audienceName = "";
		this.ticketsBooked = 0;
	}
	
	
	/**
	 * @return the audienceID
	 */
	public int getAudienceID() {
		return audienceID;
	}
	/**
	 * @param audienceID the audienceID to set
	 */
	public void setAudienceID(int audienceID) {
		this.audienceID = audienceID;
	}
	/**
	 * @return the audienceName
	 */
	public String getAudienceName() {
		return audienceName;
	}
	/**
	 * @param audienceName the audienceName to set
	 */
	public void setAudienceName(String audienceName) {
		this.audienceName = audienceName;
	}
	/**
	 * @return the ticketsBooked
	 */
	public int getTicketsBooked() {
		return ticketsBooked;
	}
	/**
	 * @param ticketsBooked the ticketsBooked to set
	 */
	public void setTicketsBooked(int ticketsBooked) {
		this.ticketsBooked = ticketsBooked;
	}
	
}
