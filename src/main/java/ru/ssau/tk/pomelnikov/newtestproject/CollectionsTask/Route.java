package ru.ssau.tk.pomelnikov.newtestproject.CollectionsTask;

import java.util.*;
import java.lang.Math;
import java.util.stream.Stream;

public final class Route implements Iterable<Location>, Comparable<Route> {

    private final List<Location> locations;
    private int driversOnRoute;
    private final RouteLengthComparator routeLengthComparator = new RouteLengthComparator();

    public Route() {
        this.locations = new ArrayList<>();
        driversOnRoute = 0;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void addLocation(Location location) {
        this.locations.add(location);
    }

    public void addLocation(int index, Location location) {
        this.locations.add(index, location);
    }

    public void removeLocation(int index) {
        this.locations.remove(index);
    }

    public void removeLocation(Location location) {
        int flag = 0;
        for (Location currentLocation : this.locations) {
            if (currentLocation.equals(location)) {
                removeLocation(flag);
                return;
            }
            flag++;
        }
    }

    public Location getFirstLocation() {
        return locations.get(0);
    }

    public Location getLastLocation() {
        return locations.get(locations.size() - 1);
    }

    public void addDriverOnRoute() {
        driversOnRoute++;
    }

    public int getDriversOnRoute() {
        return driversOnRoute;
    }

    public double length() {
        double length = 0;
        for (int i = 1; i < locations.size(); i++) {
            double x1 = locations.get(i - 1).getLatitude();
            double y1 = locations.get(i - 1).getLongitude();
            double x2 = locations.get(i).getLatitude();
            double y2 = locations.get(i).getLongitude();
            length += Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        }
        return length;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Route route = (Route) object;
        List<Location> objectLocations = route.getLocations();
        if (objectLocations.size() != this.locations.size()) return false;
        for (int i = 0; i < locations.size(); i++) {
            if (!(objectLocations.get(i).equals(locations.get(i)))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(locations);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Location location : locations) {
            stringBuilder.append(location.toString());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public Iterator<Location> iterator() {
        return new Iterator<>() {
            private int count = 0;

            @Override
            public boolean hasNext() {
                return count < getLocations().size();
            }

            @Override
            public Location next() {
                if (hasNext()) {
                    return locations.get(count++);
                } else {
                    throw new NoSuchElementException();
                }
            }
        };
    }

    @Override
    public int compareTo(Route anotherRoute) {
        return routeLengthComparator.compare(this, anotherRoute);
    }

    public Stream<Location> streamOfLocations() {
        return new ArrayList<Location>(locations).stream();
    }

    public Location getFirstLocationOnBeginning(String beginning) {
        return this.streamOfLocations()
                .filter(location -> location.getName().startsWith(beginning))
                .findFirst()
                .orElse(new Waypoint());
    }

    public boolean anyMatchLocation(String name) {
        return this.streamOfLocations()
                .anyMatch(location -> location.getName().equals(name));
    }

    public  boolean allMathLocation() {
        return this.streamOfLocations()
                .allMatch(location -> (location.getClass() == Settlement.class) ||
                        (((Waypoint) location).getSettlement() != null));
    }

    public  boolean noneMathLocation() {
        return this.streamOfLocations()
                .noneMatch(location -> ((Waypoint) location).getType() == WaypointType.EMPTY);
    }
}
