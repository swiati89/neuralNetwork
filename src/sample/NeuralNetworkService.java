package sample;

/**
 * Created by pswiatek on 2017-05-09.
 */
public interface NeuralNetworkService {

    Double activateSigmoid(Double cellValue);

    Double calculateHiddenValue (Synapse synapse);

    Double calculateOutputValue(Double cellValue, Double weightValue);

    Double calculateDelta(Double outputValue, Double marginOfError);

    Double calculateMarginOfError (Double expectedValue, Double calculatedValue);

    void correctWeigths(NeuralNetwork neuralNetwork);

}
