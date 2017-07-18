package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by Alou on 7/18/2017.
 */
public class AreaComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {

        double diff = o2.getArea() - o1.getArea();
        if (diff < 0)
            return  -1;
        else if (diff > 0)
            return 1;
        else
            return 0;
    }
}
