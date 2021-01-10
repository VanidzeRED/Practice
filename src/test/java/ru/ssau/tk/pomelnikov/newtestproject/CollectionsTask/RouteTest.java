package ru.ssau.tk.pomelnikov.newtestproject.CollectionsTask;

import org.testng.annotations.Test;
import ru.ssau.tk.pomelnikov.newtestproject.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.testng.Assert.*;

public class RouteTest {

    Location village = new Settlement();
    Location city = new Settlement();
    Location depot = new Waypoint();
    Location warehouse = new Waypoint();
    Route testRoute;

    private void fillRoute(){
        testRoute.addLocation(village);
        testRoute.addLocation(city);
    }

    @Test
    public void testGetLocations() {
        testRoute = new Route();
        assertEquals(testRoute.getLocations(), Collections.EMPTY_LIST);
        fillRoute();
        assertEquals(testRoute.getLocations(), new ArrayList<>(Arrays.asList(village, city)));
    }

    @Test
    public void testAddLocation() {
        testRoute = new Route();
        fillRoute();
        testRoute.addLocation(depot);
        assertEquals(testRoute.getLocations(), new ArrayList<>(Arrays.asList(village, city, depot)));
        testRoute.addLocation(1, warehouse);
        assertEquals(testRoute.getLocations(), new ArrayList<>(Arrays.asList(village, warehouse, city, depot)));
    }

    @Test
    public void testRemoveLocation() {
        testRoute = new Route();
        fillRoute();
        testRoute.removeLocation(1);
        assertEquals(testRoute.getLocations(), new ArrayList<>(Arrays.asList(village)));
        city.setId(1);
        depot.setId(1);
        warehouse.setId(2);
        Location newCity = new Settlement();
        newCity.setId(1);
        testRoute.addLocation(city);
        testRoute.addLocation(depot);
        testRoute.addLocation(warehouse);
        testRoute.addLocation(newCity);
        testRoute.removeLocation(newCity);
        assertEquals(testRoute.getLocations(), new ArrayList<>(Arrays.asList(village, depot, warehouse, newCity)));
        testRoute.removeLocation(warehouse);
        assertEquals(testRoute.getLocations(), new ArrayList<>(Arrays.asList(village, depot, newCity)));
        testRoute.removeLocation(warehouse);
        assertEquals(testRoute.getLocations(), new ArrayList<>(Arrays.asList(village, depot, newCity)));
    }

    @Test
    public void testGetFirstLocation() {
        testRoute = new Route();
        fillRoute();
        assertEquals(testRoute.getFirstLocation(), village);
        testRoute.addLocation(0, depot);
        assertEquals(testRoute.getFirstLocation(), depot);
    }

    @Test
    public void testGetLastLocation() {
        testRoute = new Route();
        fillRoute();
        assertEquals(testRoute.getLastLocation(), city);
        testRoute.addLocation(depot);
        assertEquals(testRoute.getLastLocation(), depot);
    }

    @Test
    public void testEquals() {
        testRoute = new Route();
        Route equalRoute = new Route();
        Route notEqualRoute = new Route();
        Person person = new Person();
        Location village1 = new Settlement();
        Location village2 = new Settlement();
        Location newVillage1 = new Settlement();
        Location depot = new Waypoint();
        Location warehouse = new Waypoint();
        Location depotInVillage = new Waypoint();
        village1.setId(1);
        village2.setId(2);
        newVillage1.setId(1);
        depot.setId(3);
        warehouse.setId(4);
        depotInVillage.setId(1);

        testRoute.addLocation(village1);
        testRoute.addLocation(village2);
        testRoute.addLocation(depot);
        testRoute.addLocation(warehouse);

        equalRoute.addLocation(newVillage1);
        equalRoute.addLocation(village2);
        equalRoute.addLocation(depot);
        equalRoute.addLocation(warehouse);

        notEqualRoute.addLocation(village1);
        notEqualRoute.addLocation(village1);
        notEqualRoute.addLocation(depot);
        notEqualRoute.addLocation(warehouse);

        assertTrue(testRoute.equals(equalRoute));
        assertFalse(testRoute.equals(notEqualRoute));
        assertFalse(testRoute.equals(person));

        equalRoute.removeLocation(warehouse);
        assertFalse(testRoute.equals(equalRoute));

        equalRoute.addLocation(warehouse);
        equalRoute.removeLocation(0);
        equalRoute.addLocation(0, depotInVillage);
        assertFalse(testRoute.equals(equalRoute));
    }

    @Test
    public void testIterator() {
        testRoute = new Route();
        village.setId(0);
        city.setId(1);
        depot.setId(2);
        warehouse.setId(3);
        testRoute.addLocation(village);
        testRoute.addLocation(city);
        testRoute.addLocation(depot);
        testRoute.addLocation(warehouse);
        int count = 0;
        for (Location location : testRoute){
            assertEquals(location.getId(), count);
            count++;
        }
        assertEquals(count, 4);
    }
}