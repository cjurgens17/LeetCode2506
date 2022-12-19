import static org.junit.Assert.*;

public class LC2506Test {

    @org.junit.Test
    public void similarPairs() {
        int expected = 2;
        int expected2 = 3;
        int expected3 = 0;

        int actual = LC2506.similarPairs(new String[] {"aba","aabb","abcd","bac","aabc"});
        int actual2 = LC2506.similarPairs(new String[] {"aabb","ab","ba"});
        int actual3 = LC2506.similarPairs(new String[] {"nba","cba","dba"});

        assertEquals(expected,actual);
        assertEquals(expected2,actual2);
        assertEquals(expected3,actual3);

    }
}