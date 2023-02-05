import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class TennisGameBehaviour {

    @Test
    public void shouldReturnScore_Love_All_AtGameStart() {
        final TennisGame tennisGame = new TennisGame();
        assertThat(tennisGame.score(), is("Love-all"));
    }

    @Test
    public void shouldReturnScore_15_Love_WhenHomePlayerWinsFirstBall() {
        final TennisGame tennisGame = new TennisGame();
        tennisGame.homePoint();
        assertThat(tennisGame.score(), is("15-Love"));
    }

    @Test
    public void shouldReturnScore_30_Love_WhenHomePlayerWinsFirstTwoBalls() {
        final TennisGame tennisGame = new TennisGame();
        tennisGame.homePoint();
        tennisGame.homePoint();
        assertThat(tennisGame.score(), is("30-Love"));
    }

    @Test
    public void shouldReturnScore_30_15_WhenHomePlayerWinsFirstTwoBallsAndAwayPlayerWinsThirdBall() {
        final TennisGame tennisGame = new TennisGame();
        tennisGame.homePoint();
        tennisGame.homePoint();
        tennisGame.awayPoint();
        assertThat(tennisGame.score(), is("30-15"));
    }

}