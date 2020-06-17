package test.com.codechallenges.LeetCode;

import com.codechallenges.LeetCode.UndergroundSystem;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import java.util.Arrays;

/**
 * UndergroundSystem Tester.
 *
 * @author <Jose R. Camilo>
 * @version 1.0
 * @since <pre>Jun 17, 2020</pre>
 */
public class UndergroundSystemTest {
    UndergroundSystem undergroundSystem;

    @Before
    public void before() throws Exception {
        undergroundSystem = new UndergroundSystem();
    }

    @Test
    public void get_all_that_have_checked_in() {
        undergroundSystem.checkIn(45, "Leyton", 3);
        undergroundSystem.checkIn(32, "Paradise", 8);
        Assert.assertEquals(Arrays.asList("32: Station: Paradise Time: 8","45: Station: Leyton Time: 3"), undergroundSystem.getAllCheckIns());
    }

    @Test
    public void check_that_checking_out_a_person_works() {
        undergroundSystem.checkIn(45, "Leyton", 3);
        undergroundSystem.checkIn(32, "Paradise", 8);
        undergroundSystem.checkIn(27, "Leyton", 10);
        undergroundSystem.checkOut(45, "Waterloo", 15);
        Assert.assertEquals(Arrays.asList("32: Station: Paradise Time: 8", "27: Station: Leyton Time: 10"), undergroundSystem.getAllCheckIns());
    }

    @Test
    public void get_average_time_when_one_person_checks_out() {
        undergroundSystem.checkIn(45, "Leyton", 3);
        undergroundSystem.checkIn(32, "Paradise", 8);
        undergroundSystem.checkIn(27, "Leyton", 10);
        undergroundSystem.checkOut(45, "Waterloo", 15);
        Assert.assertEquals(12, undergroundSystem.getAverageTime("Leyton", "Waterloo"), 0.0);
    }

    @Test
    public void check_that_one_complete_trip_gives_correct_average() {
        undergroundSystem.checkIn(45, "Leyton", 3);
        undergroundSystem.checkIn(32, "Paradise", 8);
        undergroundSystem.checkIn(27, "Leyton", 10);
        undergroundSystem.checkOut(45, "Waterloo", 15);
        undergroundSystem.checkOut(27, "Waterloo", 20);
        undergroundSystem.checkOut(32, "Cambridge", 22);
        undergroundSystem.getAverageTime("Paradise", "Cambridge");
        Assert.assertEquals(14, undergroundSystem.getAverageTime("Paradise", "Cambridge"), 0.0);
    }

    @Test
    public void check_that_multiple_complete_trip_gives_correct_average() {
        undergroundSystem.checkIn(45, "Leyton", 3);
        undergroundSystem.checkIn(32, "Paradise", 8);
        undergroundSystem.checkIn(27, "Leyton", 10);
        undergroundSystem.checkOut(45, "Waterloo", 15);
        undergroundSystem.checkOut(27, "Waterloo", 20);
        undergroundSystem.checkOut(32, "Cambridge", 22);
        undergroundSystem.getAverageTime("Paradise", "Cambridge");
        Assert.assertEquals(11, undergroundSystem.getAverageTime("Leyton", "Waterloo"), 0.0);
    }

    @Test
    public void test_case_1() {
        undergroundSystem.checkIn(45, "Leyton", 3);
        undergroundSystem.checkIn(32, "Paradise", 8);
        undergroundSystem.checkIn(27, "Leyton", 10);
        undergroundSystem.checkOut(45, "Waterloo", 15);
        undergroundSystem.checkOut(27, "Waterloo", 20);
        undergroundSystem.checkOut(32, "Cambridge", 22);
        Assert.assertEquals(14, undergroundSystem.getAverageTime("Paradise", "Cambridge") , 0.0);
        Assert.assertEquals(11, undergroundSystem.getAverageTime("Leyton", "Waterloo") , 0.0);
        undergroundSystem.checkIn(10, "Leyton", 24);
        Assert.assertEquals(11, undergroundSystem.getAverageTime("Leyton", "Waterloo") , 0.0);
        undergroundSystem.checkOut(10, "Waterloo", 38);
        Assert.assertEquals(12, undergroundSystem.getAverageTime("Leyton", "Waterloo") , 0.0);

    }

    @Test
    public void test_case_2() {
        undergroundSystem.checkIn(10, "Leyton", 3);
        undergroundSystem.checkOut(10, "Paradise", 8);
        Assert.assertEquals(5, undergroundSystem.getAverageTime("Leyton", "Paradise") , 0.0);
        undergroundSystem.checkIn(5, "Leyton", 10);
        undergroundSystem.checkOut(5, "Paradise", 16);
        Assert.assertEquals(5.5, undergroundSystem.getAverageTime("Leyton", "Paradise") , 0.0);
        undergroundSystem.checkIn(2, "Leyton", 21);
        undergroundSystem.checkOut(2, "Paradise", 30);
        Assert.assertEquals(6.66667, undergroundSystem.getAverageTime("Leyton", "Paradise") , 0.0);

    }
} 
