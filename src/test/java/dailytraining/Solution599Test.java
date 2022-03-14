package dailytraining;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution599Test {
    Solution599 solution = new Solution599();

    @Test
    public void findRestaurant() {
        solution.findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"}, new String[]{"KFC", "Shogun", "Burger King"});
    }
}