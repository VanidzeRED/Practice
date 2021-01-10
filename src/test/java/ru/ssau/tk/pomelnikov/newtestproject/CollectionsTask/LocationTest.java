package ru.ssau.tk.pomelnikov.newtestproject.CollectionsTask;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LocationTest {

    Settlement villageOne = new Settlement();
    Settlement villageTwo = new Settlement();
    Settlement villageThree = new Settlement();
    Settlement city = new Settlement();
    Waypoint depot = new Waypoint();

    @Test
    public void testEquals() {
        villageOne.setId(1);
        villageTwo.setId(1);
        villageThree.setId(2);
        city.setId(1);
        depot.setId(1);
        villageOne.setType(SettlementType.VILLAGE);
        villageTwo.setType(SettlementType.VILLAGE);
        villageThree.setType(SettlementType.VILLAGE);
        city.setType(SettlementType.CITY);
        depot.setType(WaypointType.DEPOT);
        villageOne.setName("One");
        villageTwo.setName("Two");
        assertTrue(villageOne.equals(villageTwo));
        assertTrue(villageTwo.equals(villageTwo));      //рефлексивность
        assertTrue(villageTwo.equals(villageOne));      //симметричность
        assertTrue(villageOne.equals(city));
        assertTrue(villageTwo.equals(city));            //транзитивность
        assertFalse(villageOne.equals(depot));
        assertFalse(villageOne.equals(villageThree));
        city.setId(3);
        assertFalse(villageOne.equals(city));           //консистентность
        assertFalse(city.equals(null));                 //сравнение с null
    }
}