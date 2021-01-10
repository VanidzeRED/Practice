package ru.ssau.tk.pomelnikov.newtestproject.CollectionsTask;

import java.util.Collections;
import java.util.List;

public class Route {

    private List<Location> locations;

    public Route() {
        locations = Collections.emptyList();
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void addLocation(Location location) {
        locations.add(location);
    }

    public void addLocation(int index, Location location) {
        locations.add(index, location);
    }

    public void removeLocation(int index) {
        locations.remove(index);
    }
}
