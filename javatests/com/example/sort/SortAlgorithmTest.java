package com.example.sort;

import org.junit.Assert;
import org.junit.Test;

public class SortAlgorithmTest {

    @Test
    public void verifyInputLineTest() {
        SortAlgorithm sortAlgorithm = new SortAlgorithm();
        String inputStream = "";
        boolean verifyState = sortAlgorithm.verifyInputLine(inputStream);
        Assert.assertFalse(verifyState);

        inputStream = null;
        verifyState = sortAlgorithm.verifyInputLine(inputStream);
        Assert.assertFalse(verifyState);

        inputStream = "s,b";
        verifyState = sortAlgorithm.verifyInputLine(inputStream);
        Assert.assertTrue(verifyState);


    }

    @Test
    public void sortTest() {
        SortAlgorithm sortAlgorithm = new SortAlgorithm();

        String[] inputArrays = new String[]{"s", "a", "b"};
        String[] outArrays = sortAlgorithm.sort(inputArrays);

        Assert.assertArrayEquals(outArrays, new String[]{"a", "b", "s"});
    }
}
