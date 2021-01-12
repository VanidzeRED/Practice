package ru.ssau.tk.pomelnikov.newtestproject.CollectionsTask;

import java.util.Comparator;
import java.util.Map;

public class CountOfDriversComparator implements Comparator<Route> {

    CompanyModel companyModel = new CompanyModel();
    Map<Driver, Route> driverRouteMap = companyModel.getDriverRouteMap();

    @Override
    public int compare(Route route1, Route route2) {
        return 0;
    }
}
