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
        if (location1.getClass() == Settlement.class) {
            Settlement settlement1 = (Settlement) location1;
            Settlement settlement2 = (Settlement) location2;
            if (settlement1.getType() != settlement2.getType()) {
                if (settlement1.getType() == SettlementType.CITY) {
                    return -1;
                } else {
                    return 1;
                }
            }
        } else {
            Waypoint waypoint1 = (Waypoint) location1;
            Waypoint waypoint2 = (Waypoint) location2;
            if (waypoint1.getType() != waypoint2.getType()) {
                if (waypoint1.getType() == WaypointType.DEPOT) {
                    return -1;
                }
                if (waypoint1.getType() == WaypointType.EMPTY) {
                    return 1;
                } else {
                    if (waypoint2.getType() == WaypointType.DEPOT) {
                        return 1;
                    }
                    if (waypoint2.getType() == WaypointType.EMPTY) {
                        return -1;
                    }
                }
            }
        }
        return 0;
    }
}
