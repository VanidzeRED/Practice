package ru.ssau.tk.pomelnikov.newtestproject.CollectionsTask;

import org.testng.annotations.Test;
import ru.ssau.tk.pomelnikov.newtestproject.Gender;

import java.util.*;

import static org.testng.Assert.*;

public class CompanyModelTest {

    Settlement village1 = new Settlement();
    Settlement village2 = new Settlement();
    Settlement city1 = new Settlement();
    Settlement city2 = new Settlement();
    Waypoint village1Warehouse = new Waypoint();
    Waypoint village2Waypoint = new Waypoint();
    Waypoint city1Depot = new Waypoint();
    Waypoint city2Warehouse = new Waypoint();
    Waypoint loneDepot = new Waypoint();
    Driver bob = new Driver();
    Driver alice = new Driver();
    Driver eve = new Driver();
    Driver charlie = new Driver();
    Driver chuck = new Driver();
    Driver carol = new Driver();
    Driver dave = new Driver();
    Route route1 = new Route();
    Route route2 = new Route();
    Route route3 = new Route();
    Route route4 = new Route();
    Route route5 = new Route();
    Route route6 = new Route();

    private void fillModels(CompanyModel companyModelOne, CompanyModel companyModelTwo) {
        village1 = companyModelOne.addSettlement("village1", 20.36, 45.12, SettlementType.VILLAGE, 1200);
        village2 = companyModelOne.addSettlement("village2", 20.45, 45.81, SettlementType.VILLAGE, 540);
        city1 = companyModelOne.addSettlement("city1", 20.47, 46.01, SettlementType.CITY, 1250000);
        city2 = companyModelOne.addSettlement("city2", 21.87, 45.84, SettlementType.CITY, 384000);
        village1Warehouse = companyModelOne.addWaypoint("village1.Warehouse", 20.36, 45.12, WaypointType.WAREHOUSE, village1);
        village2Waypoint = companyModelOne.addWaypoint("village2.Waypoint", 20.36, 45.12, WaypointType.EMPTY, village2);
        city1Depot = companyModelOne.addWaypoint("city1.Depot", 20.47, 46.01, WaypointType.DEPOT, city1);
        loneDepot = companyModelOne.addWaypoint("lone Depot", 20.54, 45.85, WaypointType.DEPOT, null);
        city2Warehouse = companyModelOne.addWaypoint("city2.Warehouse", 21.87, 45.84, WaypointType.WAREHOUSE, city2);
        bob = companyModelOne.addDriver("Bob", Gender.MALE, new Date(121, Calendar.APRIL, 21));
        alice = companyModelOne.addDriver("Alice", Gender.FEMALE, new Date(127, Calendar.DECEMBER, 5));
        eve = companyModelOne.addDriver("Eve", Gender.FEMALE, new Date(135, Calendar.AUGUST, 16));
        charlie = companyModelOne.addDriver("Charlie", Gender.MALE, new Date(140, Calendar.JANUARY, 2));
        dave = companyModelOne.addDriver("Dave", Gender.MALE, new Date(129, Calendar.FEBRUARY, 28));
        route1 = companyModelOne.addRoute(new ArrayList<>(Arrays.asList(city1Depot, city1, village2Waypoint, village1Warehouse, city2Warehouse, loneDepot)));
        route2 = companyModelOne.addRoute(new ArrayList<>(Arrays.asList(city1Depot, city1, city2, city2Warehouse, loneDepot)));
        route3 = companyModelOne.addRoute(new ArrayList<>(Arrays.asList(loneDepot, village2, village2Waypoint, village1Warehouse, city1, city1Depot)));
        route6 = companyModelOne.addRoute(new ArrayList<>(Arrays.asList(loneDepot, village1, village1Warehouse, city2, city2Warehouse, city1, city1Depot)));
        companyModelOne.assignRoute(bob, route1);
        companyModelOne.assignRoute(alice, route2);
        companyModelOne.assignRoute(charlie, route3);
        companyModelOne.assignRoute(dave, route2);

        companyModelTwo.addSettlement("village1", 20.36, 45.12, SettlementType.VILLAGE, 1200);
        companyModelTwo.addSettlement("village2", 20.45, 45.81, SettlementType.VILLAGE, 540);
        companyModelTwo.addSettlement("city1", 20.47, 46.01, SettlementType.CITY, 1250000);
        companyModelTwo.addSettlement("city2", 21.87, 45.84, SettlementType.CITY, 384000);
        companyModelTwo.addWaypoint("city1.Depot", 20.47, 46.01, WaypointType.DEPOT, city1);
        companyModelTwo.addWaypoint("lone Depot", 20.54, 45.85, WaypointType.DEPOT, null);
        chuck = companyModelTwo.addDriver("Chuck", Gender.MALE, new Date(123, Calendar.MAY, 6));
        carol = companyModelTwo.addDriver("Carol", Gender.FEMALE, new Date(129, Calendar.OCTOBER, 28));
        route4 = companyModelTwo.addRoute(new ArrayList<>(Arrays.asList(city1Depot, city1, village1, village2, city2, loneDepot)));
        route5 = companyModelTwo.addRoute(new ArrayList<>(Arrays.asList(loneDepot, village1, city2, city1, city1Depot)));
        companyModelTwo.assignRoute(chuck, route4);
        companyModelTwo.assignRoute(carol, route5);
    }

    @Test
    public void testGetAllLocations() {
        CompanyModel companyModelOne = new CompanyModel();
        CompanyModel companyModelTwo = new CompanyModel();
        fillModels(companyModelOne, companyModelTwo);
        Collection<Location> locationsOne = companyModelOne.getAllLocations();
        Collection<Location> locationsTwo = companyModelTwo.getAllLocations();
        int i = 1;
        for (Location location : locationsOne) {
            if (i == 1) {
                assertEquals(location.toString(), village1.toString());
            }
            if (i == 2) {
                assertEquals(location.toString(), village2.toString());
            }
            if (i == 3) {
                assertEquals(location.toString(), city1.toString());
            }
            if (i == 4) {
                assertEquals(location.toString(), city2.toString());
            }
            if (i == 5) {
                assertEquals(location.toString(), village1Warehouse.toString());
            }
            if (i == 6) {
                assertEquals(location.toString(), village2Waypoint.toString());
            }
            if (i == 7) {
                assertEquals(location.toString(), city1Depot.toString());
            }
            if (i == 8) {
                assertEquals(location.toString(), loneDepot.toString());
            }
            if (i == 9) {
                assertEquals(location.toString(), city2Warehouse.toString());
            }
            i++;
        }
        i = 1;
        for (Location location : locationsTwo) {
            if (i == 1) {
                assertEquals(location.toString(), village1.toString());
            }
            if (i == 2) {
                assertEquals(location.toString(), village2.toString());
            }
            if (i == 3) {
                assertEquals(location.toString(), city1.toString());
            }
            if (i == 4) {
                assertEquals(location.toString(), city2.toString());
            }
            if (i == 5) {
                assertEquals(location.toString(), city1Depot.toString());
            }
            if (i == 6) {
                assertEquals(location.toString(), loneDepot.toString());
            }
            i++;
        }
    }

    @Test
    public void testGetAllRoutes() {
        CompanyModel companyModelOne = new CompanyModel();
        CompanyModel companyModelTwo = new CompanyModel();
        fillModels(companyModelOne, companyModelTwo);
        Collection<Route> routesOne = companyModelOne.getAllRoutes();
        Collection<Route> routesTwo = companyModelTwo.getAllRoutes();
        int i = 1;
        for (Route route : routesOne) {
            if (i == 1) {
                assertEquals(route.toString(), route1.toString());
            }
            if (i == 2) {
                assertEquals(route.toString(), route2.toString());
            }
            if (i == 3) {
                assertEquals(route.toString(), route3.toString());
            }
            if (i == 4) {
                assertEquals(route.toString(), route6.toString());
            }
            i++;
        }
        for (Route route : routesTwo) {
            if (i == 5) {
                assertEquals(route.toString(), route4.toString());
            }
            if (i == 6) {
                assertEquals(route.toString(), route5.toString());
            }
            i++;
        }
    }

    @Test
    public void testGetAllDrivers() {
        CompanyModel companyModelOne = new CompanyModel();
        CompanyModel companyModelTwo = new CompanyModel();
        fillModels(companyModelOne, companyModelTwo);
        Collection<Driver> driversOne = companyModelOne.getAllDrivers();
        Collection<Driver> driversTwo = companyModelTwo.getAllDrivers();
        int i = 1;
        for (Driver driver : driversOne) {
            if (i == 1) {
                assertEquals(driver.toString(), bob.toString());
            }
            if (i == 2) {
                assertEquals(driver.toString(), alice.toString());
            }
            if (i == 3) {
                assertEquals(driver.toString(), eve.toString());
            }
            if (i == 4) {
                assertEquals(driver.toString(), charlie.toString());
            }
            if (i == 5) {
                assertEquals(driver.toString(), dave.toString());
            }
            i++;
        }
        for (Driver driver : driversTwo) {
            if (i == 6) {
                assertEquals(driver.toString(), chuck.toString());
            }
            if (i == 7) {
                assertEquals(driver.toString(), carol.toString());
            }
            i++;
        }
    }

    @Test
    public void testAssignRoute() {
        CompanyModel companyModelOne = new CompanyModel();
        CompanyModel companyModelTwo = new CompanyModel();
        fillModels(companyModelOne, companyModelTwo);
        Map<Driver, Route> mapOne = companyModelOne.getDriverRouteMap();
        Map<Driver, Route> mapTwo = companyModelTwo.getDriverRouteMap();
        assertEquals(mapOne.size(), 4);
        assertEquals(mapTwo.size(), 2);
        assertEquals(mapOne.get(bob), route1);
        assertEquals(mapOne.get(alice), route2);
        assertEquals(mapOne.get(charlie), route3);
        assertEquals(mapTwo.get(chuck), route4);
        assertEquals(mapTwo.get(carol), route5);
        assertEquals(mapOne.get(dave), route2);
    }

    @Test
    public void testRouteComparator() {
        CompanyModel companyModelOne = new CompanyModel();
        CompanyModel companyModelTwo = new CompanyModel();
        fillModels(companyModelOne, companyModelTwo);
        List<Route> routes = new ArrayList<>(Arrays.asList(route1, route2, route3, route4, route5, route6));
        assertEquals(Collections.min(routes), route3);
        assertEquals(Collections.max(routes), route4);
        Collections.sort(routes);
        assertEquals(routes, new ArrayList<>(Arrays.asList(route3, route2, route5, route6, route1, route4)));
    }

    @Test
    public void testLocationComparator() {
        CompanyModel companyModelOne = new CompanyModel();
        CompanyModel companyModelTwo = new CompanyModel();
        fillModels(companyModelOne, companyModelTwo);
        List<Location> locations = new ArrayList<>(Arrays.asList(village1, village2, city1, city2, village1Warehouse,
                village2Waypoint, city1Depot, city2Warehouse, loneDepot));
        assertEquals(Collections.max(locations), city2);
        assertEquals(Collections.min(locations), village1);
        Collections.sort(locations);
        assertEquals(locations, new ArrayList<>(Arrays.asList(village1, village1Warehouse, village2Waypoint, village2,
                city1, city1Depot, loneDepot, city2, city2Warehouse)));
    }

    @Test
    public void testSort() {
        CompanyModel companyModelOne = new CompanyModel();
        CompanyModel companyModelTwo = new CompanyModel();
        fillModels(companyModelOne, companyModelTwo);
        List<Settlement> settlements = new ArrayList<>(Arrays.asList(city1, village2, city2, village1));
        CompanyModel.sort(settlements, (o1, o2) -> Integer.compare(o1.getId(), o2.getId()));
        assertEquals(settlements, new ArrayList<>(Arrays.asList(village1, village2, city1, city2)));
        CompanyModel.sort(settlements, (o1, o2) -> Integer.compare(o1.getSettlement(), o2.getSettlement()));
        assertEquals(settlements, new ArrayList<>(Arrays.asList(village2, village1, city2, city1)));
        CompanyModel.sort(settlements, (o1, o2) -> Double.compare(o1.getLatitude(), o2.getLatitude()));
        assertEquals(settlements, new ArrayList<>(Arrays.asList(village1, village2, city1, city2)));
        CompanyModel.sort(settlements, (o1, o2) -> Double.compare(o1.getLongitude(), o2.getLongitude()));
        assertEquals(settlements, new ArrayList<>(Arrays.asList(village1, village2, city2, city1)));
        CompanyModel.sort(settlements, (o1, o2) -> CharSequence.compare(o1.getName(), o2.getName()));
        assertEquals(settlements, new ArrayList<>(Arrays.asList(city1, city2, village1, village2)));
        CompanyModel.sort(settlements, new EquatorComparator());
        assertEquals(settlements, new ArrayList<>(Arrays.asList(village1, village2, city1, city2)));
    }

    @Test
    public void testSortByName() {
        CompanyModel companyModelOne = new CompanyModel();
        CompanyModel companyModelTwo = new CompanyModel();
        fillModels(companyModelOne, companyModelTwo);
        List<Location> locations = new ArrayList<>(Arrays.asList(loneDepot, village2, village1, city1Depot,
                city2Warehouse, city2, city1, village1Warehouse, village2Waypoint));
        CompanyModel.sortByName(locations);
        assertEquals(locations, new ArrayList<>(Arrays.asList(city1, city1Depot, city2, city2Warehouse,
                loneDepot, village1, village1Warehouse, village2, village2Waypoint)));
        List<Settlement> settlements = new ArrayList<>(Arrays.asList(city1, village2, city2, village1));
        CompanyModel.sortByName(settlements);
        assertEquals(settlements, new ArrayList<>(Arrays.asList(city1, city2, village1, village2)));
    }

    @Test
    public void testDriversComparator() {
        CompanyModel companyModelOne = new CompanyModel();
        CompanyModel companyModelTwo = new CompanyModel();
        fillModels(companyModelOne, companyModelTwo);
        List<Driver> drivers = new ArrayList<>(Arrays.asList(bob, alice, charlie, chuck, eve, dave, carol));
        Collections.sort(drivers, new DriversComparator());
        assertEquals(drivers, new ArrayList<>(Arrays.asList(alice, carol, eve, bob, chuck, dave, charlie)));
    }

    @Test
    public void testLocationsComparator() {
        CompanyModel companyModelOne = new CompanyModel();
        CompanyModel companyModelTwo = new CompanyModel();
        fillModels(companyModelOne, companyModelTwo);
        List<Location> locations = new ArrayList<>(Arrays.asList(village1, village1Warehouse, village2, village2Waypoint,
                city1, city1Depot, city2, city2Warehouse, loneDepot));
        Collections.sort(locations, new LocationsComparator());
        assertEquals(locations, new ArrayList<>(Arrays.asList(city1, city2, village1, village2, city1Depot,
                loneDepot, city2Warehouse, village1Warehouse, village2Waypoint)));
    }

    @Test
    public void testDriversOnRoute() {
        CompanyModel companyModelOne = new CompanyModel();
        CompanyModel companyModelTwo = new CompanyModel();
        fillModels(companyModelOne, companyModelTwo);
        Map<Driver, Route> driverRouteMap = companyModelOne.driversOnRoute();
        Collection<Driver> drivers = driverRouteMap.keySet();
        Collection<Route> routes = driverRouteMap.values();
        assertEquals(drivers, new ArrayList<>(Arrays.asList(alice, bob, charlie, dave)));   //Eve is not on route
        assertEquals(routes, new ArrayList<>(Arrays.asList(route2, route1, route3, route2)));
    }

    @Test
    public void testSettlementTypeMap() {
        CompanyModel companyModelOne = new CompanyModel();
        CompanyModel companyModelTwo = new CompanyModel();
        fillModels(companyModelOne, companyModelTwo);
        Map<Settlement, SettlementType> settlementTypeMap = companyModelOne.settlementTypeMap();
        Collection<Settlement> settlements = settlementTypeMap.keySet();
        Collection<SettlementType> settlementTypes = settlementTypeMap.values();
        assertEquals(settlements, new ArrayList<>(Arrays.asList(city1, city2, village1, village2)));
        assertEquals(settlementTypes, new ArrayList<>(Arrays.asList(SettlementType.CITY, SettlementType.CITY,
                SettlementType.VILLAGE, SettlementType.VILLAGE)));
    }
}