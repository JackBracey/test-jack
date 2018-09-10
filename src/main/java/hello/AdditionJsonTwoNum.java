package hello;

public class AdditionJsonTwoNum {

    private int One;
    private int Two;
    private int three;


    public void setOne(int one) {
        One = one;
    }

    public void setTwo(int two) {
        Two = two;
    }


    //Getters / Setters

    public int getOne() {
        return One;
    }

    public int getTwo() {
        return Two;
    }

    public int getThree() {
        return three;
    }

    public void setThree(int three) {
        this.three = three;
    }


    //Functions


    public int add(int one, int two) {
        return (one + two);
    }

    public int mult(int one, int two) {
        return (one * two);
    }

    public int addthree(int one, int two, int three) {
        return (one + two + three);
    }


}
