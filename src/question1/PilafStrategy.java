package question1;

public class PilafStrategy implements Strategy {
    @Override
    public RiceCookingWays cookRice() {
        System.out.println("Heat oil in a skillet.");
        System.out.println("Add onions and other aromatics, like garlic.");
        System.out.println("Add rice.");
        System.out.println("Add liquid.");
        System.out.println("Cover and let cook.");

        return RiceCookingWays.PILAF;
    }
}
