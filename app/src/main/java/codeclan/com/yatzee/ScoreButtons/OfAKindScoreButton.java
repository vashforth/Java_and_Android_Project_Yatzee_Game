package codeclan.com.yatzee.ScoreButtons;

import codeclan.com.yatzee.Roll.Roll;

/**
 * Created by user on 25/03/2018.
 */

public class OfAKindScoreButton extends ScoreButtons {

    private int scoreValue;

    public OfAKindScoreButton(Strategy strategyType) {
        super(strategyType);
        this.scoreValue = 0;
    }

    @Override
    public int calculateScore(Roll roll) {
        if (roll.doesContainMultipleOfAnyDieValue(getStrategyType().getValue())) {
            return roll.sumOfAllDiceValues();
        }
        return 0;
    }
}
