package ru.ssau.tk.pomelnikov.newtestproject.CollectionsTask;

import java.util.Comparator;
import java.lang.Math;

public class EquatorComparator implements Comparator<Location> {
    @Override
    public int compare(Location location1, Location location2) {
        return Double.compare(Math.abs(location1.getLatitude()), Math.abs(location2.getLatitude()));
    }
}
