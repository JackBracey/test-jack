package hello;

public class AdditionJsonTwoNum {

    private int one;
    private int two;
    private int three;
    private int four;
    private int five;

    //Getters Setters
    public void setOne(int one) {
        this.one = one;
    }

    public void setTwo(int two) {
        this.two = two;
    }

    public int getOne() {
        return one;
    }

    public int getTwo() {
        return two;
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
    public int add() {
        return (one + two);
    }

    public int mult() {
        return (one * two);
    }

    public int addthree() {
        return (one + two + three);
    }

    public int addfour() {
        return (one + two + three + four);
    }

    public int addfive() {
        return (one + two + three + four + five);
    }


}
