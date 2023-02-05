public class TennisGame {

    private int homePoints = 0;
    private int awayPoints = 0;

    public void homePoint() {
        homePoints++;
    }

    public void awayPoint() {
        awayPoints++;
    }

    public String score() {
        if (homePoints == awayPoints) {
            return score(homePoints) + "-all";
        } else {
            return score(homePoints) + "-" + score(awayPoints);
        }
    }
    private String score(final int points) {
        switch (points) {
            case 0:
                return "Love";
            case 1:
                return "15";
            case 2:
                return "30";
            default:
                throw new IllegalStateException("Unexpected point: " + points);
        }
    }

}