package ru.ssau.tk.pomelnikov.newtestproject.CollectionsTask;

import ru.ssau.tk.pomelnikov.newtestproject.Gender;

import java.util.*;

public class CompanyModel {

    private final Collection<Location> allLocations;
    private final Collection<Route> allRoutes;
    private final Collection<Driver> allDrivers;
    private final Map<Driver, Route> driverRouteMap;
    private int maxId = 0;

    public CompanyModel() {
        allLocations = new LinkedHashSet<>();
        allRoutes = new LinkedHashSet<>();
        allDrivers = new LinkedHashSet<>();
        driverRouteMap = new LinkedHashMap<>();
    }

    public Collection<Location> getAllLocations() {
        return allLocations;
    }

    public Collection<Route> getAllRoutes() {
        return allRoutes;
    }

    public Collection<Driver> getAllDrivers() {
        return allDrivers;
    }

    public Map<Driver, Route> getDriverRouteMap() {
        return driverRouteMap;
    }

    public Settlement addSettlement(String name, double latitude, double longitude, SettlementType type, int population) {
        Settlement settlement = new Settlement();
        settlement.setId(++maxId);
        settlement.setName(name);
        settlement.setLatitude(latitude);
        settlement.setLongitude(longitude);
        settlement.setType(type);
        settlement.setSettlement(population);
        allLocations.add(settlement);
        return settlement;
    }

    public Waypoint addWaypoint(String name, double latitude, double longitude, WaypointType type, Settlement settlement) {
        Waypoint waypoint = new Waypoint();
        waypoint.setId(++maxId);
        waypoint.setName(name);
        waypoint.setLatitude(latitude);
        waypoint.setLongitude(longitude);
        waypoint.setType(type);
        waypoint.setSettlement(settlement);
        allLocations.add(waypoint);
        return waypoint;
    }

    public Driver addDriver(String name, Gender gender, Date licenseExpirationDate) {
        Driver driver = new Driver();
        driver.setId(++maxId);
        driver.setName(name);
        driver.setGender(gender);
        driver.setLicenseExpirationDate(licenseExpirationDate);
        allDrivers.add(driver);
        return driver;
    }

    public Route addRoute(List<Location> locations) {
        Route route = new Route();
        for (Location location : locations) {
            route.addLocation(location);
        }
        allRoutes.add(route);
        return route;
    }

    public void assignRoute(Driver driver, Route route) {
        driverRouteMap.put(driver, route);
    }
}
