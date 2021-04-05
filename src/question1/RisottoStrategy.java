package question1;

public class RisottoStrategy implements Strategy {
    @Override
    public RiceCookingWays cookRice() {
        System.out.println("Use Cold Stock. Adding chilly stock to a hot pan will cool everything down and mess up the cooking process.");
        System.out.println("Stir It Constantly (or Not at All)");
        System.out.println("Add Too Much Stock.");
        System.out.println("Cook the Rice Till It's Mushy.");

        return RiceCookingWays.RISOTTO;
    }
}
