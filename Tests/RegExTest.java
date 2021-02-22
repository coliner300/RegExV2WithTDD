import org.junit.jupiter.api.Test;
import java.util.regex.*;

import static org.junit.jupiter.api.Assertions.*;

class RegExTest {

    @Test
    void baseConstructor()
    {
        RegEx tests = new RegEx("Barry", "Yankees", "mlb@baseball.net", "(808)452-8456", "4380000", "34");
        String expected = "Best Player(First Name): Barry" + "\nBest Teams: Yankees" + "\nWebsite: mlb@baseball.net" + "\nSupport: (808)452-8456" + "\nAverage Pay: 4380000" + "\nBat Size: 34";
        assertEquals(expected, tests.toString());
    }

    @Test
    void bestPlayerCorrect()
    {
        RegEx tests = new RegEx();
        tests.setBestPlayers("Barry");
        String expected = "Barry";
        assertEquals(expected, tests.getBestPlayers());
    }

    @Test
    void bestPlayerWrong()
    {
        RegEx tests = new RegEx();
        tests.setBestPlayers("Barry Bonds");
        String expected = "Best Players: Invalid";
        assertEquals(expected, tests.getBestPlayers());
    }

    @Test
    void bestPlayerWithNumbers()
    {
        RegEx tests = new RegEx();
        tests.setBestPlayers("Barry123");
        String expected = "Best Players: Invalid";
        assertEquals(expected, tests.getBestPlayers());
    }

    @Test
    void correctTeamName()
    {
        RegEx tests = new RegEx();
        tests.setBestTeams("Dodgers");
        String expected = "Dodgers";
        assertEquals(expected, tests.getBestTeams());
    }

    @Test
    void wrongTeamName()
    {
        RegEx tests = new RegEx();
        tests.setBestTeams("Yankees and Dodgers");
        String expected = "Best Teams: Invalid";
        assertEquals(expected, tests.getBestTeams());
    }

    @Test
    void addNumbersToTeam()
    {
        RegEx tests = new RegEx();
        tests.setBestTeams("Yankees1234");
        String expected = "Best Teams: Invalid";
        assertEquals(expected, tests.getBestTeams());
    }

    @Test
    void emailWithNumbers()
    {
        RegEx tests = new RegEx();
        tests.setWebsites("mlb@gmail.123");
        String expected = "Websites: Invalid";
        assertEquals(expected, tests.getWebsite());
    }

    @Test
    void correctEmail()
    {
        RegEx tests = new RegEx();
        tests.setWebsites("mlb@gmail.com");
        String expected = "mlb@gmail.com";
        assertEquals(expected, tests.getWebsite());
    }

    @Test
    void emailWithWrongEnding()
    {
        RegEx tests = new RegEx();
        tests.setWebsites("mlb@gmail.xyz");
        String expected = "Websites: Invalid";
        assertEquals(expected, tests.getWebsite());
    }

    @Test
    void correctSupport()
    {
        RegEx tests = new RegEx();
        tests.setSupport("(951)123-4567");
        String expected = "(951)123-4567";
        assertEquals(expected, tests.getSupport());
    }

    @Test
    void supportWithoutParenthesis()
    {
        RegEx tests = new RegEx();
        tests.setSupport("951-123-4567");
        String expected = "Support: Invalid";
        assertEquals(expected, tests.getSupport());
    }

    @Test
    void supportWithExtraNumber()
    {
        RegEx tests = new RegEx();
        tests.setSupport("(951)123-45676");
        String expected = "Support: Invalid";
        assertEquals(expected, tests.getSupport());
    }

    @Test
    void averagePayWrong()
    {
        RegEx tests = new RegEx();
        tests.setAveragePay("438000");
        String expected = "Average Pay: Invalid";
        assertEquals(expected, tests.getAveragePay());
    }

    @Test
    void averagePayCorrect()
    {
        RegEx tests = new RegEx();
        tests.setAveragePay("4380000");
        String expected = "4380000";
        assertEquals(expected, tests.getAveragePay());
    }

    @Test
    void averagePayWithLetters()
    {
        RegEx tests = new RegEx();
        tests.setAveragePay("abcdefg");
        String expected = "Average Pay: Invalid";
        assertEquals(expected, tests.getAveragePay());
    }

    @Test
    void correctBatSize()
    {
        RegEx tests = new RegEx();
        tests.setBatSize("34");
        String expected = "34";
        assertEquals(expected, tests.getBatSize());
    }

    @Test
    void wrongBatSize()
    {
        RegEx tests = new RegEx();
        tests.setBatSize("345");
        String expected = "Bat Size: Invalid";
        assertEquals(expected, tests.getBatSize());
    }

    @Test
    void batSizeWithLetters()
    {
        RegEx tests = new RegEx();
        tests.setBatSize("AB");
        String expected = "Bat Size: Invalid";
        assertEquals(expected, tests.getBatSize());
    }

}