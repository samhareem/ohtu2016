package ohtuesimerkki;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;

/**
 * Created by sami on 25.3.2016.
 */
public class StatisticsTest {

    private Statistics stats;
    private Reader readerStub = new Reader() {

        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<Player>();

            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));

            return players;
        }
    };

    @Before
    public void setUp() {
        stats = new Statistics(readerStub);
    }

    @Test
    public void returnsSinglePlayer() {
        Player testPlayer = stats.search("Kurri");
        Assert.assertEquals("Kurri", testPlayer.getName());
    }

    @Test
    public void returnsNullIfPlayerNotFound() {
        Player testPlayer = stats.search("Exxon-Valdez");
        Assert.assertNull(testPlayer);
    }

    @Test
    public void returnsTeam() {
        List<Player> testTeam = stats.team("EDM");
        for (Player player : testTeam) {
            Assert.assertEquals("EDM", player.getTeam());
        }
    }

    @Test
    public void returnsTop() {
        List<Player> testTop = stats.topScorers(3);
        Assert.assertEquals(3, testTop.size());
        int points = testTop.get(0).getPoints();
        for (int index = 1; index < testTop.size(); index++) {
            Assert.assertEquals(true, points > testTop.get(index).getPoints());
            points = testTop.get(index).getPoints();
        }
    }
}
