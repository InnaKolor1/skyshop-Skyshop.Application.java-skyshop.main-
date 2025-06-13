package org.skypro.skyshop.model.search;

import java.util.Comparator;

public abstract class SearchResultComparator implements Comparator<org.skypro.skyshop.model.search.Searchable> {

    @Override
    public int compare(org.skypro.skyshop.model.search.Searchable o2, org.skypro.skyshop.model.search.Searchable o1) {
        int lengthCompare = Integer.compare(o2.getName().length(), o1.getName().length());
        if (lengthCompare == 0) {
            return o2.getName().compareToIgnoreCase(o1.getName());
        }
        return lengthCompare;
    }
}