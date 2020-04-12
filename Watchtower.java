package FlightManager;
import java.util.ArrayList;

public class Watchtower
{
    private String TakeofTime;
    private String LandingTime;
    private ArrayList<Flight> ListOfAirportFlights = new ArrayList <Flight>();

    private Watchtower()
    {
        TakeofTime = null;
        LandingTime = null;
    }

    public void AddFlight()
    {
        Flight AddedFlight = new Flight();
        ListOfAirportFlights.add(AddedFlight);
    }

    public ArrayList<String> SpecialFlights(String Name)
    {
        ArrayList <String> SpecialFlights = new ArrayList <String>();
        for (int i = 0 ; i < ListOfAirportFlights.size() ; i++)
        {
            if (Name != null)
            {
                if (ListOfAirportFlights.get(i).GetDestination().equals(Name))
                    SpecialFlights.add(Name);
            }
            else
                throw new RuntimeException("name cannot be null.");
        }

        return SpecialFlights;
    }
}