package com.kavinash.dsaprac.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateTest {

    private final ContainsDuplicate solution = new ContainsDuplicate();

    @Test
    void returnsTrueWhenAValueRepeats() {
        assertTrue(solution.containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    @Test
    void returnsFalseWhenAllValuesAreDistinct() {
        assertFalse(solution.containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    @Test
    void returnsFalseForAnEmptyArray() {
        assertFalse(solution.containsDuplicate(new int[]{}));
    }
}
