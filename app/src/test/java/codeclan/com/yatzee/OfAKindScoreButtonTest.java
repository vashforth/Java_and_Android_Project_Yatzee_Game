package codeclan.com.yatzee;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.yatzee.TheRoll.Roll;
import codeclan.com.yatzee.TheScoreButtons.OfAKindScoreButton;
import codeclan.com.yatzee.TheScoreButtons.Strategy;

/**
 * Created by user on 25/03/2018.
 */

public class OfAKindScoreButtonTest {

    OfAKindScoreButton ofAKindScoreButton;
    Roll roll;

    @Before
    public void before() {
        ofAKindScoreButton = new OfAKindScoreButton(Strategy.THREEOFAKIND);
    }

    @Test
    public void canCalculateScoreForThreeOfAKind() {
        roll = new Roll();
        roll.firstFullRollOfDice();
        System.out.println(roll.getDiceRollValues());
        System.out.println(ofAKindScoreButton.calculateScore(roll));
    }

}
