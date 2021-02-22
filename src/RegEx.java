import java.util.Scanner;

public class RegEx
{
    private String bestPlayers;
    private String bestTeams;
    private String websites;
    private String support;
    private String averagePay;
    private String batSize;
    private final Scanner scan = new Scanner(System.in);

    public RegEx(String bestPlayers, String bestTeams, String websites, String support, String averagePay, String batSize)
    {
        this.bestPlayers = checkBestPlayers(bestPlayers);
        this.bestTeams = checkBestTeams(bestTeams);
        this.websites = checkWebsite(websites);
        this.support = checkSupport(support);
        this.averagePay = checkAveragePay(averagePay);
        this.batSize = checkBatSize(batSize);
    }

    public RegEx()
    {
        this.bestPlayers = "";
        this.bestTeams = "";
        this.websites = "";
        this.support = "";
        this.averagePay = "";
        this.batSize = "";
    }

    public String getBestPlayers()
    {
        return bestPlayers;
    }

    public String getBestTeams() {
        return bestTeams;
    }

    public String getWebsite()
    {
        return websites;
    }
    public String getSupport()
    {
        return support;
    }
    public String getAveragePay()
    {
        return averagePay;
    }
    public String getBatSize()
    {
        return batSize;
    }


    public void setBestPlayers(String bestPlayers)
    {
        this.bestPlayers = checkBestPlayers(bestPlayers);
    }

    public void setBestTeams(String bestTeams)
    {
        this.bestTeams = checkBestTeams(bestTeams);
    }

    public void setWebsites(String websites)
    {
        this.websites = checkWebsite(websites);
    }

    public void setSupport(String support)
    {
        this.support = checkSupport(support);
    }

    public void setAveragePay(String averagePay)
    {
        this.averagePay = checkAveragePay(averagePay);
    }

    public void setBatSize(String batSize)
    {
        this.batSize = checkBatSize(batSize);
    }

    private String checkBestPlayers(String name)
    {
        if(!name.matches("[A-Z][A-Za-z]+"))
        {
            name = "Best Players: Invalid";
        }
        return name;
    }

    private String checkBestTeams(String name)
    {
        if(!name.matches("[A-Z]([A-Za-z]|-)+"))
        {
            name = "Best Teams: Invalid";
        }
        return name;
    }


    private String checkWebsite(String email)
    {
        if(!email.matches("[A-Za-z0-9]+@[a-z]+\\.(com|net|edu)"))
        {
           email = "Websites: Invalid";
        }
        return email;
    }

    private String checkSupport(String num)
    {
        if(!num.matches("\\([0-9]{3}\\)[0-9]{3}-[0-9]{4}"))
        {
            num = "Support: Invalid";
        }
        return num;
    }

    private String checkAveragePay(String num)
    {
        if(!num.matches("[0-9]{7}"))
        {
            num = "Average Pay: Invalid";
        }
        return num;
    }

    private String checkBatSize(String num)
    {
        if(!num.matches("[0-9]{2}"))
        {
            num = "Bat Size: Invalid";
        }
        return num;
    }

    public String toString()
    {
        String output;
        output  = "Best Player(First Name): " + bestPlayers;
        output += "\nBest Teams: " + bestTeams;
        output += "\nWebsite: " + websites;
        output += "\nSupport: " + support;
        output += "\nAverage Pay: " + averagePay;
        output += "\nBat Size: " + batSize;
        return output;
    }
}