package hello;

public class AdditionJsonTwoNum {

    private int One;
    private int Two;
    private int three;
    private int four;
    private int five;

    //Getters Setters
    public void setOne(int one) {
        One = one;
    }

    public void setTwo(int two) {
        Two = two;
    }

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

    public int getFour() {
        return four;
    }

    public void setFour(int four) {
        this.four = four;
    }

    public int getFive() {
        return five;
    }

    public void setFive(int five) {
        this.five = five;
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

    public int addfour(int one, int two, int three, int four) {
        return (one + two + three + four);
    }

    public int addfive(int one, int two, int three, int four, int five) {
        return (one + two + three + four + five);
    }


}
