package sample;

import java.math.*;

/**
 * Created by pswiatek on 2017-05-09.
 */
public class NeuralNetworkServiceImpl implements NeuralNetworkService {

    @Override
    public Double activateSigmoid(Double cellValue) {
        return 1/(1+ Math.exp(-cellValue));
    }

    @Override
    public Double calculateHiddenValue(Synapse synapse) {
        return null;
    }

    @Override
    public Double calculateOutputValue(Double cellValue, Double weightValue) {
        return cellValue * weightValue;
    }

    @Override
    public Double calculateDelta(Double outputValue, Double marginOfError) {

        return activateSigmoid(outputValue) * marginOfError;
    }

    @Override
    public Double calculateMarginOfError(Double expectedValue, Double calculatedValue) {
        return expectedValue - calculatedValue;
    }

    @Override
    public void correctWeigths(NeuralNetwork neuralNetwork) {

    }
}
