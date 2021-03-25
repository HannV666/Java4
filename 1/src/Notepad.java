public class Notepad implements Editor {
    @Override
    public String sum(String word1, String word2) {
        System.out.println("Notepsd sum:");
        return word1+word2;
    }
    @Override
    public String upper(String word1) {
        System.out.println("Notepsd upper:");
        return word1.toUpperCase();
    }
    @Override
    public String lower(String word2) {
        System.out.println("Notepsd lower:");
        return word2.toLowerCase();
    }
}
