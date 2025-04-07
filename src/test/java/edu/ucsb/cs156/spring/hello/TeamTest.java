package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team"); 
    }

    @Test
    public void getName_returns_correct_name() {
        assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_returns_true_for_equal_team1() {
        // case 1: same object
        assert(team.equals(team));
    }

    @Test
    public void equals_returns_true_for_equal_team2() {
        // case 2: other object isn't same class
        String team2 = new String("test-team");
        assert(!team.equals(team2));
    }

    @Test
    public void equals_correct_all_cases() {
        // case 3: does name equal and do members equal
        // first 2 teams equal
        Team team1 = new Team("test-team");
        team1.addMember("test1");
        Team team2 = new Team("test-team");
        team2.addMember("test1");

        // third team differs in members
        Team team3 = new Team("test-team");
        team3.addMember("test3");

        // fourth team differs in name
        Team team4 = new Team("test-team1111");
        team4.addMember("test1");

        assert(team1.equals(team2) && !team1.equals(team3) && !team1.equals(team4));
    }

    @Test
    public void hashCode_correct_for_equal_team() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    public void hashCode_correct_particular_implementation() {
        Team t = new Team();
        t.setName("foo");
        t.addMember("bar");

        int result = t.hashCode();
        int expectedResult = 130294;
        assertEquals(expectedResult, result);
    }

    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
