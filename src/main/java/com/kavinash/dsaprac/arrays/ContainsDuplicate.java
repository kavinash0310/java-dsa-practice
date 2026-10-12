package com.kavinash.dsaprac.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    /**
     * Returns true if the array contains any repeated value.
     * Expected time: O(n). Extra space: O(n).
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int number : nums) {
            if (!seen.add(number)) {
                return true;
            }
        }

        return false;
    }
}
