package service;

import model.Passenger;
import model.Station;
import model.Ticket;
import model.Train;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TicketsGodServiceTests {

    static Train train = new Train();
    static Passenger passenger = new Passenger();
    static Station startStation = new Station();
    static Station endtStation = new Station();

    @Before
    public void setUp(){
        train.setId(42);
        passenger.setId(33);
    }

    @Test
    public void CreateTicketNotSuccess(){
        TicketsGodService ticketsGodService = new TicketsGodService();
        Assert.assertFalse(ticketsGodService.createTicket(train, startStation, endtStation, passenger));
    }
}
