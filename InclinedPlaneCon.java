package MechanicalACalc;

public class InclinedPlaneCon {
    double length;
    double height;
    double mechanicalAdvantage;
    public InclinedPlaneCon(double length, double height){
        this.length = length;
        this.height = height;
        this.mechanicalAdvantage = length / height;
    }
}
