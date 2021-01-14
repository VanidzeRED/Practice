package ru.ssau.tk.pomelnikov.newtestproject.CollectionsTask;

import ru.ssau.tk.pomelnikov.newtestproject.Gender;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompanyModel {

    private final Collection<Location> allLocations;
    private final Collection<Route> allRoutes;
    private final Collection<Driver> allDrivers;
    private final Map<Driver, Route> driverRouteMap;
    private int maxId = 0;

    static final Comparator driversComparator = Comparator.comparing(Driver::getGender).
            thenComparing(Driver::getLicenseExpirationDate);
    static final Comparator locationsComparator = new LocationsComparator().thenComparing(Location::getName);
    static final Comparator routesComparator = Comparator.comparing(Route::getDriversOnRoute);

    public CompanyModel() {
        allLocations = new LinkedHashSet<>();
        allRoutes = new LinkedHashSet<>();
        allDrivers = new LinkedHashSet<>();
        driverRouteMap = new TreeMap<>(Comparator.comparing(Driver::getId));
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
        route.addDriverOnRoute();
        driverRouteMap.put(driver, route);
    }

    public static void sort(List<Settlement> settlements, Comparator<? super Settlement> comparator) {
        Collections.sort(settlements, comparator);
    }

    public static void sortByName(List<? extends Location> locations) {
        Collections.sort(locations, ((o1, o2) -> CharSequence.compare(o1.getName(), o2.getName())));
    }

    public Map<Driver, Route> driversOnRoute() {
        Map<Driver, Route> returnableDriverRouteMap = new TreeMap<>(Comparator.comparing(Driver::getName));
        List<Driver> drivers = new ArrayList<>(this.driverRouteMap.keySet());
        for (Driver driver : drivers) {
            returnableDriverRouteMap.put(driver, this.driverRouteMap.get(driver));
        }
        return returnableDriverRouteMap;
    }

    public Map<Settlement, SettlementType> getSettlementsWithType() {
        Map<Settlement, SettlementType> settlementTypeMap =
                new TreeMap<>(Comparator.comparing(Settlement::getSettlement).reversed());
        List<Settlement> settlementList = new ArrayList<>();
        for (Location location : this.allLocations) {
            if (location.getClass() == Settlement.class) {
                settlementList.add((Settlement) location);
            }
        }
        for (Settlement settlement : settlementList) {
            if (settlement.getType() == SettlementType.CITY) {
                settlementTypeMap.put(settlement, SettlementType.CITY);
            } else {
                settlementTypeMap.put(settlement, SettlementType.VILLAGE);
            }
        }
        return settlementTypeMap;
    }

    public Map<WaypointType, List<Waypoint>> getTypesOfWaypoints() {
        Map<WaypointType, List<Waypoint>> waypointTypeListMap = new LinkedHashMap<>();
        Set<WaypointType> waypointTypeList = new LinkedHashSet<>();
        List<Waypoint> waypointList = new ArrayList<>();
        for (Location location : this.allLocations) {
            if (location.getClass() == Waypoint.class) {
                waypointTypeList.add(((Waypoint) location).getType());
                waypointList.add((Waypoint) location);
            }
        }
        List<Waypoint> insertableWaybointList;
        for (WaypointType waypointType : waypointTypeList) {
            insertableWaybointList = new ArrayList<>();
            for (Waypoint waypoint : waypointList) {
                if (waypoint.getType() == waypointType) {
                    insertableWaybointList.add(waypoint);
                }
            }
            waypointTypeListMap.put(waypointType, insertableWaybointList);
        }
        return waypointTypeListMap;
    }

    public List<Location> getLocationsOnNorthSemisphere() {
        return allLocations.stream()
                .filter(location -> location.getLatitude() > 0)
                .collect(Collectors.toList());
    }

    public List<String> getWaypointInSettlementsNames() {
        return allLocations.stream()
                .filter(location -> location instanceof Waypoint)
                .filter(location -> ((Waypoint) location).getSettlement() != null)
                .map(Location::getName)
                .collect(Collectors.toList());
    }

    public Collection<Location> getWaypointsInSettlements() {
        return allLocations.stream()
                .filter(location -> location instanceof Waypoint)
                .filter(location -> ((Waypoint) location).getSettlement() != null)
                .flatMap(location -> Stream.of(location, ((Waypoint) location).getSettlement()))
                .distinct()
                .collect(Collectors.toList());
    }

    public double minRouteLength() {
        return allRoutes.stream()
                .mapToDouble(Route::length)
                .min()
                .orElse(0);
    }

    public Driver maxDriverLicenseExpirationDate() {
        return allDrivers.stream()
                .max(Comparator.comparing(Driver::getLicenseExpirationDate))
                .orElse(null);
    }

    public double sumOfRoutesLength() {
        return allRoutes.stream()
                .mapToDouble(Route::length)
                .sum();
    }
}
