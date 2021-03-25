public class Word implements Editor {
    @Override
    public String sum(String word1, String word2) {
        System.out.println("Word sum:");
        return word1+word2;
    }
    @Override
    public String upper(String word1) {
        System.out.println("Word upper:");
        return word1.toUpperCase();
    }
    @Override
    public String lower(String word2) {
        System.out.println("Word lower:");
        return word2.toLowerCase();
    }
}
