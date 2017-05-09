package sample;

import sample.NeuralCell;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pswiatek on 2017-05-09.
 */
public class NeuralNetwork {

    private List<Double> input_1;
    private List<Double> input_2;

    private NeuralCell cell_1 = new NeuralCell();
    private NeuralCell cell_2 = new NeuralCell();
    private NeuralCell cell_3 = new NeuralCell();

//    private Synapse synapse_1 = new Synapse(input_1);
//    private Synapse synapse_2 = new Synapse(input_2);
//    private Synapse synapse_3 = new Synapse(input_1);
//    private Synapse synapse_4 = new Synapse(input_2);
//    private Synapse synapse_5 = new Synapse(input_1);
//    private Synapse synapse_6 = new Synapse(input_2);

    private List<Synapse> inputsForCell_1 = new ArrayList<>();
    private List<Synapse> inputsForCell_2 = new ArrayList<>();
    private List<Synapse> inputsForCell_3 = new ArrayList<>();

    private Double finalValue;
    private Double expectedValue;

    private Double data_1;
    private Double data_2;

    public NeuralNetwork(List<Double> input_1, List<Double> input_2){
        this.input_1 = input_1;
        this.input_2 = input_2;
    }

    public Double getFinalValue() {
        return finalValue;
    }

    public void setFinalValue(Double finalValue) {
        this.finalValue = finalValue;
    }

    public Double getExpectedValue() {
        return expectedValue;
    }

    public void setExpectedValue(Double expectedValue) {
        this.expectedValue = expectedValue;
    }

    public void learn() {
        do {

            for (int i=0 ; i<input_1.size()-1 ; i++){
                inputsForCell_1.add(new Synapse(input_1.get(i)));
                inputsForCell_1.add(new Synapse(input_2.get(i)));
                inputsForCell_2.add(new Synapse(input_1.get(i)));
                inputsForCell_2.add(new Synapse(input_2.get(i)));
                inputsForCell_3.add(new Synapse(input_1.get(i)));
                inputsForCell_3.add(new Synapse(input_2.get(i)));


            }

        } while (-0.1 < expectedValue - finalValue);

    }


        inputsForCell_1.add(new Synapse(input_1));
        inputsForCell_1.add(new Synapse(input_2));
        inputsForCell_2.add(new Synapse(input_1));
        inputsForCell_2.add(new Synapse(input_2));
        inputsForCell_3.add(new Synapse(input_1));
        inputsForCell_3.add(new Synapse(input_2));

        cell_1 = new NeuralCell(inputsForCell_1);
        cell_2 = new NeuralCell(inputsForCell_2);
        cell_3 = new NeuralCell(inputsForCell_3);
    }

    public List<Synapse> getInputsForCell_1() {
        return inputsForCell_1;
    }

    public void setInputsForCell_1(List<Synapse> inputsForCell_1) {
        this.inputsForCell_1 = inputsForCell_1;
    }

    public List<Synapse> getInputsForCell_2() {
        return inputsForCell_2;
    }

    public void setInputsForCell_2(List<Synapse> inputsForCell_2) {
        this.inputsForCell_2 = inputsForCell_2;
    }

    public List<Synapse> getInputsForCell_3() {
        return inputsForCell_3;
    }

    public void setInputsForCell_3(List<Synapse> inputsForCell_3) {
        this.inputsForCell_3 = inputsForCell_3;
    }

    public NeuralCell getCell_1() {
        return cell_1;
    }

    public void setCell_1(NeuralCell cell_1) {
        this.cell_1 = cell_1;
    }

    public NeuralCell getCell_2() {
        return cell_2;
    }

    public void setCell_2(NeuralCell cell_2) {
        this.cell_2 = cell_2;
    }

    public NeuralCell getCell_3() {
        return cell_3;
    }

    public void setCell_3(NeuralCell cell_3) {
        this.cell_3 = cell_3;
    }

    @Override
    public String toString() {
        return "NeuralNetwork{" +
                "input_1=" + input_1 +
                ", input_2=" + input_2 +
                ", cell_1=" + cell_1 +
                ", cell_2=" + cell_2 +
                ", cell_3=" + cell_3 +
                ", inputsForCell_1=" + inputsForCell_1 +
                ", inputsForCell_2=" + inputsForCell_2 +
                ", inputsForCell_3=" + inputsForCell_3 +
                ", finalValue=" + finalValue +
                ", expectedValue=" + expectedValue +
                '}';
    }


    public Double activateSigmoid(Double cellValue) {
        return 1/(1+ Math.exp(-cellValue));
    }


    public Double calculateHiddenValue(Synapse synapse) {
        for(Double value : synapse.getValue()){

        }
    }


    public Double calculateOutputValue(Double cellValue, Double weightValue) {
        return cellValue * weightValue;
    }


    public Double calculateDelta(Double outputValue, Double marginOfError) {

        return activateSigmoid(outputValue) * marginOfError;
    }


    public Double calculateMarginOfError(Double expectedValue, Double calculatedValue) {
        return expectedValue - calculatedValue;
    }


    public void correctWeigths(NeuralNetwork neuralNetwork) {

    }

}
