package travel.booking;
public class ticket
	{
	int ticket_id;
	String destination;
	int fare;
	static int count;
	public ticket()
	{
	    this.ticket_id=ticket_id;
	    this.destination=destination;
	    this.fare=fare;
	
	}
        public ticket(int ticket_id,String destination,int fare)
	{
		count++;
            this.ticket_id=ticket_id;
	    this.destination=destination;
	    this.fare=fare;
	}
       public int getTicket_id()
	{
		return ticket_id;
	}
	public String getDestination()
	{
	  	return destination;
	}
	public int getFare()
	{
		return fare;
	}
       public String status()
	{
		if(count==1) return "Ticket Booking Succesfully";
                 return "Ticket Booking Failed";
	}
}