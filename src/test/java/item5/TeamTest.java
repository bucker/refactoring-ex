package item5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeamTest {

    @Test
    public void testWins() {
        Team team = new Team();
        team.row[0] = "Liverpool";
        team.row[1] = "15";
        String name = team.row[0];
        assertEquals(15, Integer.parseInt(team.row[1]));
    }

    @Test
    public void testName() {
        Team team = new Team();
        team.row[0] = "Liverpool";
        assertEquals("Liverpool", team.row[0]);
    }
}