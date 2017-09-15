import java.util.ArrayList;

public class State {

    private int stateNumber = 0;
    //private ArrayList<String> massFlow = new ArrayList<>();
    //Double[][] properties;

    private Double temperature;
    private Double pressure;
    private Double volume;
    private Double quality;
    private Double massFlowRate;
    private Double volumetricFlowRate;
    private Double crosssectionalArea;
    private Double velocity;
    private Double specificVolume;
    private Double specificInternalEnergy;
    private Double specificEnthalpy;
    private Double specificEntropy;
    private Double specificEntropyNaught;
    private Double specificExergy;
    private Double humidityRatio;
    private Double relativeHumidity;
    private Double partialPressure;
    private Double molarRatio;

    //Class State constructor
    public State() {

    }
    /*public State(int num, String[] flows) {
        stateNumber = num;
        for(String material: flows) {
            massFlow.add(material);
        }
        //properties = new Double[massFlow.size()][1];
    }*/

    //Get and set values of the state
    public int getStateNumber() {
        return stateNumber;
    }

    public void setStateNumber(int stateNumber) {
        this.stateNumber = stateNumber;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getQuality() {
        return quality;
    }

    public void setQuality(Double quality) {
        this.quality = quality;
    }

    public Double getMassFlowRate() {
        return massFlowRate;
    }

    public void setMassFlowRate(Double massFlowRate) {
        this.massFlowRate = massFlowRate;
    }

    public Double getVolumetricFlowRate() {
        return volumetricFlowRate;
    }

    public void setVolumetricFlowRate(Double volumetricFlowRate) {
        this.volumetricFlowRate = volumetricFlowRate;
    }

    public Double getCrosssectionalArea() {
        return crosssectionalArea;
    }

    public void setCrosssectionalArea(Double crosssectionalArea) {
        this.crosssectionalArea = crosssectionalArea;
    }

    public Double getVelocity() {
        return velocity;
    }

    public void setVelocity(Double velocity) {
        this.velocity = velocity;
    }

    public Double getSpecificVolume() {
        return specificVolume;
    }

    public void setSpecificVolume(Double specificVolume) {
        this.specificVolume = specificVolume;
    }

    public Double getSpecificInternalEnergy() {
        return specificInternalEnergy;
    }

    public void setSpecificInternalEnergy(Double specificInternalEnergy) {
        this.specificInternalEnergy = specificInternalEnergy;
    }

    public Double getSpecificEnthalpy() {
        return specificEnthalpy;
    }

    public void setSpecificEnthalpy(Double specificEnthalpy) {
        this.specificEnthalpy = specificEnthalpy;
    }

    public Double getSpecificEntropy() {
        return specificEntropy;
    }

    public void setSpecificEntropy(Double specificEntropy) {
        this.specificEntropy = specificEntropy;
    }

    public Double getSpecificEntropyNaught() {
        return specificEntropyNaught;
    }

    public void setSpecificEntropyNaught(Double specificEntropyNaught) {
        this.specificEntropyNaught = specificEntropyNaught;
    }

    public Double getSpecificExergy() {
        return specificExergy;
    }

    public void setSpecificExergy(Double specificExergy) {
        this.specificExergy = specificExergy;
    }

    public Double getHumidityRatio() {
        return humidityRatio;
    }

    public void setHumidityRatio(Double humidityRatio) {
        this.humidityRatio = humidityRatio;
    }

    public Double getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(Double relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public Double getPartialPressure() {
        return partialPressure;
    }

    public void setPartialPressure(Double partialPressure) {
        this.partialPressure = partialPressure;
    }

    public Double getMolarRatio() {
        return molarRatio;
    }

    public void setMolarRatio(Double molarRatio) {
        this.molarRatio = molarRatio;
    }

    /*public static void main(String[] args) {
        String[] flow = {"water"};
        State asdf = new State(1, flow);
        asdf.seth(12.);
        asdf.seth(null);
        System.out.println(asdf.geth());

    }*/

}
