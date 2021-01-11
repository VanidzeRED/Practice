package ru.ssau.tk.pomelnikov.newtestproject.CollectionsTask;

import org.testng.annotations.Test;
import ru.ssau.tk.pomelnikov.newtestproject.Gender;

import java.util.*;

import static org.testng.Assert.*;

public class CompanyModelTest {

    CompanyModel companyModelOne = new CompanyModel();
    CompanyModel companyModelTwo = new CompanyModel();
    Settlement village1 = new Settlement();
    Settlement village2 = new Settlement();
    Settlement city1 = new Settlement();
    Settlement city2 = new Settlement();
    Waypoint village1Warehouse = new Waypoint();
    Waypoint village2Waypoint = new Waypoint();
    Waypoint city1Depot = new Waypoint();
    Waypoint city2Warehouse = new Waypoint();
    Waypoint loneDepot = new Waypoint();

    private void fillModels() {
        village1.setName("village1");
        village1.setType(SettlementType.VILLAGE);
        village2.setName("village2");
        village2.setType(SettlementType.VILLAGE);
        city1.setName("city1");
        city1.setType(SettlementType.CITY);
        city2.setName("city2");
        city2.setType(SettlementType.CITY);
        village1Warehouse.setName("village1.Warehouse");
        village1Warehouse.setType(WaypointType.WAREHOUSE);
        village2Waypoint.setName("village2.Waypoint");
        village2Waypoint.setType(WaypointType.EMPTY);
        city1Depot.setName("city1.Depot");
        city1Depot.setType(WaypointType.DEPOT);
        city2Warehouse.setName("city2.Warehouse");
        city2Warehouse.setType(WaypointType.WAREHOUSE);
        loneDepot.setName("lone Depot");
        loneDepot.setType(WaypointType.DEPOT);

        companyModelOne.addSettlement("village1", 20.36, 45.12, SettlementType.VILLAGE, 1200);
        companyModelOne.addSettlement("village2", 20.45, 45.81, SettlementType.VILLAGE, 540);
        companyModelOne.addSettlement("city1", 20.47, 46.01, SettlementType.CITY, 1250000);
        companyModelOne.addSettlement("city2", 21.87, 45.84, SettlementType.CITY, 384000);
        companyModelOne.addWaypoint("village1.Warehouse", 20.36, 45.12, WaypointType.WAREHOUSE, village1);
        companyModelOne.addWaypoint("village2.Waypoint", 20.36, 45.12, WaypointType.EMPTY, village2);
        companyModelOne.addWaypoint("city1.Depot", 20.47, 46.01, WaypointType.DEPOT, city1);
        companyModelOne.addWaypoint("lone Depot", 20.54, 45.85, WaypointType.DEPOT, null);
        companyModelOne.addWaypoint("city2.Warehouse", 21.87, 45.84, WaypointType.WAREHOUSE, city2);
        companyModelOne.addDriver("Bob", Gender.MALE, new Date(121, Calendar.APRIL, 21));
        companyModelOne.addDriver("Alice", Gender.FEMALE, new Date(127, Calendar.DECEMBER, 5));
        companyModelOne.addDriver("Eve", Gender.FEMALE, new Date(135, Calendar.AUGUST, 16));
        companyModelOne.addDriver("Charlie", Gender.MALE, new Date(140, Calendar.JANUARY, 2));
        companyModelOne.addRoute(new ArrayList<>(Arrays.asList(city1Depot, city1, village2Waypoint, village1Warehouse, city2Warehouse, loneDepot)));
        companyModelOne.addRoute(new ArrayList<>(Arrays.asList(city1Depot, city1, city2, city2Warehouse, loneDepot)));
        companyModelOne.addRoute(new ArrayList<>(Arrays.asList(loneDepot, village2, village2Waypoint, village1Warehouse, city1, city1Depot)));

        companyModelTwo.addSettlement("village1", 20.36, 45.12, SettlementType.VILLAGE, 1200);
        companyModelTwo.addSettlement("village2", 20.45, 45.81, SettlementType.VILLAGE, 540);
        companyModelTwo.addSettlement("city1", 20.47, 46.01, SettlementType.CITY, 1250000);
        companyModelTwo.addSettlement("city2", 21.87, 45.84, SettlementType.CITY, 384000);
        companyModelTwo.addWaypoint("city1.Depot", 20.47, 46.01, WaypointType.DEPOT, city1);
        companyModelTwo.addWaypoint("lone Depot", 20.54, 45.85, WaypointType.DEPOT, null);
        companyModelTwo.addDriver("Bob", Gender.MALE, new Date(121, Calendar.APRIL, 21));
        companyModelTwo.addDriver("Alice", Gender.FEMALE, new Date(127, Calendar.DECEMBER, 5));
        companyModelTwo.addDriver("Eve", Gender.FEMALE, new Date(135, Calendar.AUGUST, 16));
        companyModelTwo.addDriver("Charlie", Gender.MALE, new Date(140, Calendar.JANUARY, 2));
        companyModelTwo.addRoute(new ArrayList<>(Arrays.asList(city1Depot, city1, village1, village2, city2, loneDepot)));
        companyModelTwo.addRoute(new ArrayList<>(Arrays.asList(loneDepot, village1, city2, city1, city1Depot)));
    }

    @Test
    public void testGetAllLocations() {
        fillModels();
        Collection<Location> locationsOne = companyModelOne.getAllLocations();
        Collection<Location> locationsTwo = companyModelTwo.getAllLocations();
        for (Location location : locationsOne) {
            System.out.println(location.toString());
        }
        System.out.println("\n------------------\n");
        for (Location location : locationsTwo) {
            System.out.println(location.toString());
        }
    }

    @Test
    public void testGetAllRoutes() {
        fillModels();
        Collection<Route> routesOne = companyModelOne.getAllRoutes();
        Collection<Route> routesTwo = companyModelTwo.getAllRoutes();
        for (Route route : routesOne) {
            System.out.println(route.toString());
        }
        System.out.println("------------------\n");
        for (Route route : routesTwo) {
            System.out.println(route.toString());
        }
    }

    @Test
    public void testGetAllDrivers() {
        fillModels();
        Collection<Driver> drivers = companyModelOne.getAllDrivers();       //Водители для обеих компаний одинаковы,
        for (Driver driver : drivers) {                                     //  поэтому тестирую только одну
            System.out.println(driver.toString());
        }
    }
}