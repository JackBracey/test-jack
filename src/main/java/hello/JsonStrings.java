package hello;

public class JsonStrings {

    private String Wordone;
    private String Wordtwo;

    public String getWordone() {
        return Wordone;
    }

    public void setWordone(String wordone) {
        Wordone = wordone;
    }

    public String getWordtwo() {
        return Wordtwo;
    }

    public void setWordtwo(String wordtwo) {
        Wordtwo = wordtwo;
    }

    public String calc(String one, String two) {
        return one + " " + two;
    }

}
