package sample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pswiatek on 2017-05-09.
 */
public class Mind {
    public static void main(String[] args) {

        List<Double> input_1 = new ArrayList<>();
        List<Double> input_2 = new ArrayList<>();

        input_1.add(0d);
        input_1.add(0d);
        input_1.add(1d);
        input_1.add(1d);
        input_2.add(0d);
        input_2.add(1d);
        input_2.add(0d);
        input_2.add(1d);


        NeuralNetwork mind = new NeuralNetwork(input_1,input_2);
        mind.createNetwork();
        System.out.println(mind);


    }
}
