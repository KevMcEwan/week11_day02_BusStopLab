import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    BusStop busstop;
    Person person;

    @Before
    public void before(){
        busstop = new BusStop("Sighthill - 34");
        person = new Person();
    }

    @Test
    public void canAddPersonToQueue(){
        busstop.addPersonToQueue(person);
        assertEquals(1, busstop.queueSize());
    }

    @Test
    public void canRemovePersonFromQueue(){
        busstop.addPersonToQueue(person);
        assertEquals(1, busstop.queueSize());
        busstop.removePersonFromQueue();
        assertEquals(0, busstop.queueSize());
    }

}
