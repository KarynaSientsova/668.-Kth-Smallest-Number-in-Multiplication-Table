package org.example;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void findKthNum() {

        Solution solution = new Solution();
        int kthNum = solution.findKthNum(1, 100, 79);
        assertEquals(79, kthNum);

    }
}