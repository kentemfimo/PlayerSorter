public class Player {
    private String playerId;
    private String name;
    private String teamName;
    private double score;

    public Player(String playerId, String name, String teamName, double score) {
        this.playerId = playerId;
        this.name = name;
        this.teamName = teamName;
        this.score = score;
    }

    public String getPlayerId() {
        return playerId;
    }

    public String getName() {
        return name;
    }

    public String getTeamName() {
        return teamName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("%-8s %-15s %-15s %.2f", playerId, name, teamName, score);
    }
}
