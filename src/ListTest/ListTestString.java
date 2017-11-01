package ListTest;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

public class ListTestString {

    @Test
    public void testAssertList() {

        List<String> actual = Arrays.asList("a", "b", "c");
        List<String> expected = Arrays.asList("a", "b", "c");

        //1. Test Equal
        assertThat(actual, is(expected));

        //2. 리스트에 존재하는 값이 같은지 확인
        assertThat(actual, hasItem("b"));

        //3. 리스트 size 확인
        assertThat(actual, hasSize(3));
        assertThat(actual.size(), is(3));

        //4. List Order
        //Ensure Correct order
        assertThat(actual, contains("a", "b", "c"));
        // Can be any order
        assertThat(actual, containsInAnyOrder("c", "b", "a"));

        //5. check empty list
        assertThat(actual, not(IsEmptyCollection.empty()));
        assertThat(new ArrayList<>(), IsEmptyCollection.empty());

    }
}
