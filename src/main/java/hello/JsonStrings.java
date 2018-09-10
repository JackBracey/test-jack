package hello;

public class JsonStrings {

    private String One;
    private String Two;

    public String getOne() {
        return One;
    }

    public void setOne(String one) {
        One = one;
    }

    public String getTwo() {
        return Two;
    }

    public void setTwo(String two) {
        Two = two;
    }

    public String combine(String wordOne, String wordTwo) {
        return (wordOne + wordTwo);
    }

}
