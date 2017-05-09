package sample;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by pswiatek on 2017-05-09.
 */
public class Synapse {

    private Double value;
    private Double weight = ThreadLocalRandom.current().nextDouble(1);



    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Synapse{" +
                "value=" + value +
                ", weight=" + weight +
                '}';
    }
}
