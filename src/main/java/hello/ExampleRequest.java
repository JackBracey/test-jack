package hello;

import java.util.ArrayList;

public class ExampleRequest {

    private ArrayList<String> examples = new ArrayList<String>();

    public ArrayList<String> getExamples() {
        return examples;
    }

    public void setExamples(ArrayList<String> examples) {
        this.examples = examples;
    }

    public String getExample(int pos) {

        this.examples = examples;

        for (int i = 0; i < 1500; i++) {

            examples.add("String " + i);

        }

        return examples.get(pos);
    }

}
