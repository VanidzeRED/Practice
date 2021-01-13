package ru.ssau.tk.pomelnikov.newtestproject.CollectionsTask;

import java.util.Comparator;

public class LocationsComparator implements Comparator<Location> {
    @Override
    public int compare(Location location1, Location location2) {
        if (location1.getClass() != location2.getClass()) {
            if (location1.getClass() == Settlement.class) {
                return -1;
            } else {
                return 1;
            }
        }
        return 0;
    }
}
