package ru.ssau.tk.pomelnikov.newtestproject.CollectionsTask;

import ru.ssau.tk.pomelnikov.newtestproject.Gender;

import java.util.Comparator;

public class DriversComparator implements Comparator<Driver> {
    @Override
    public int compare(Driver driver1, Driver driver2) {
        if (driver1.getGender() != driver2.getGender()) {
            if (driver1.getGender() == Gender.FEMALE) {
                return -1;
            } else {
                return 1;
            }
        } else {
            return Long.compare(driver1.getLicenseExpirationDate().getTime(), driver2.getLicenseExpirationDate().getTime());
        }
    }
}
