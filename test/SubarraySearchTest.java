import org.junit.Test;

import static org.junit.Assert.*;

public class SubarraySearchTest {

    int[] arr1 = new int[]{2, 3, 6, -8 , 4, -6, 7, 4, -2, 8, 4, -3, 2};
    int[] arr2 = new int[]{-2, 3, -4, 5};
    int[] arr3 = new int[]{-2, 3, -4, 5, 2, -3, -5, 4};
    int[] arr4 = new int[]{-2, -3, -4, -5};

    SubarraySearch ss1 = new SubarraySearch(arr1);
    SubarraySearch ss2 = new SubarraySearch(arr2);
    SubarraySearch ss3 = new SubarraySearch(arr3);
    SubarraySearch ss4 = new SubarraySearch(arr4);

    @Test
    public void testSubarraySearch() throws Exception {
        ss1.subarraySearch();
        assertEquals(0, ss1.getFirstIndex());
        assertEquals(10, ss1.getSecondIndex());

        ss2.subarraySearch();
        assertEquals(3, ss2.getFirstIndex());
        assertEquals(3, ss2.getSecondIndex());

        ss3.subarraySearch();
        assertEquals(3, ss3.getFirstIndex());
        assertEquals(4, ss3.getSecondIndex());

        ss4.subarraySearch();
        assertEquals(-1, ss4.getFirstIndex());
        assertEquals(-1, ss4.getSecondIndex());
    }

}