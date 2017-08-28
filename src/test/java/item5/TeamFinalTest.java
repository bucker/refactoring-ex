package item5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeamFinalTest {

    @Test
    public void testWins() {
        TeamFinal team = new TeamFinal();
        PerformanceFinal performance = new PerformanceFinal();
        team.setPerformance(performance);
        performance.setName("Liverpool");
        performance.setWins("15");
        assertEquals(15, performance.getWins());
    }

    @Test
    public void testName() {
        TeamFinal team = new TeamFinal();
        PerformanceFinal performance = new PerformanceFinal();
        team.setPerformance(performance);
        performance.setName("Liverpool");
        assertEquals("Liverpool", performance.getName());
    }
}