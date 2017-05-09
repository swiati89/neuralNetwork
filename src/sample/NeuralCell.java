package sample;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by pswiatek on 2017-05-09.
 */

public class NeuralCell {

    private List<Synapse> inputs;
    private Double cellValue;
    private Double outputWeight = ThreadLocalRandom.current().nextDouble(1);



    public List<Synapse> getInputs() {
        return inputs;
    }

    public void setInputs(List<Synapse> inputs) {
        this.inputs = inputs;
    }

    public Double getCellValue() {
        return cellValue;
    }

    public void setCellValue(Double cellValue) {
        this.cellValue = cellValue;
    }

    public Double getOutputWeight() {
        return outputWeight;
    }

    public void setOutputWeight(Double outputWeight) {
        this.outputWeight = outputWeight;
    }

    @Override
    public String toString() {
        return "NeuralCell{" +
                "inputs=" + inputs +
                ", cellValue=" + cellValue +
                ", outputWeight=" + outputWeight +
                '}';
    }
}
