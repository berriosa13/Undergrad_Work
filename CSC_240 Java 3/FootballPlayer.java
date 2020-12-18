public class FootballPlayer {
    private String name;
    private int yearsPlayed;
    private char position;
    private int jerseyNumber;
    private int weight;
    private double fortyTime;
    private String teamName;
    private boolean isActive;

    public FootballPlayer(){

    }

    public FootballPlayer(String name, String yearsPlayed, String position,
                          String jerseyNumber, String weight, String fortyTime,
                          String teamName, String isActive)
    {
        this.name = name;
        this.yearsPlayed = Integer.parseInt(yearsPlayed);
        this.position =  position.charAt(0);
        this.jerseyNumber = Integer.parseInt(jerseyNumber);
        this.weight = Integer.parseInt(weight);
        this.fortyTime = Double.parseDouble(fortyTime);
        this.teamName = teamName;
        this.isActive = Boolean.parseBoolean(isActive);
    }

    public String getName()
    {
        return name;
    }

    public int getYearsPlayed()
    {
        return yearsPlayed;
    }

    public char getPosition()
    {
        return position;
    }

    public int getJerseyNumber()
    {
        return jerseyNumber;
    }

    public int getWeight()
    {
        return weight;
    }

    public double getFortyTime()
    {
        return fortyTime;
    }

    public String getTeamName()
    {
        return teamName;
    }

    public boolean getIsActive()
    {
        return isActive;
    }



}

