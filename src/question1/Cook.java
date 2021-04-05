package question1;

public class Cook {

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public RiceCookingWays cookRice() {
        return this.strategy.cookRice();
    }
}
