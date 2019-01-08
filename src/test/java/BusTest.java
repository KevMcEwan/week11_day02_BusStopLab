import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Bus bus;
    Person person;
    BusStop busstop;

    @Before
    public void before() {
        bus = new Bus("Newhaven", 4);
        person = new Person();
        busstop = new BusStop("Sighthill - 34");
    }

    @Test
    public void busHasPassengerCount() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void busAtCapacity(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(4, bus.passengerCount());
        bus.addPassenger(person);
        assertEquals(4, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canPickUpPassenger(){
        busstop.addPersonToQueue(person);
        Person busPassenger = busstop.removePersonFromQueue();
        bus.pickUp(busPassenger);
        assertEquals(1, bus.passengerCount());
    }

}
