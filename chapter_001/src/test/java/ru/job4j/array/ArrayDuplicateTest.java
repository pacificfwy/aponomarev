package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.junit.Assert.*;

public class ArrayDuplicateTest {
    @Test
    public void whenArrayHaveDuplicateCutIt(){
        String[] array  = {"1","1","2","2","3","3","1"};
        String[] expect = {"1","2","3"};

        ArrayDuplicate arrayduplicate = new ArrayDuplicate();
        String[] result = arrayduplicate.remove(array);
        assertThat(result, arrayContainingInAnyOrder(expect));
    }

}
