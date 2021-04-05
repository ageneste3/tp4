package question2;

public class Cooking {
    private RiceType riceType;

    Cooking(RiceType riceType) {
        this.riceType = riceType;
    }

    public String prepareDinner() {
        String sentence = "I am done cooking ";
        if (this.riceType == RiceType.BASMATI) {
            return sentence + RiceType.BASMATI.toString();
        } else if (this.riceType == RiceType.JAPONICA) {
            return sentence + RiceType.JAPONICA.toString();
        } else {
            return sentence + RiceType.CAMARGUE.toString();
        }
    }
}
