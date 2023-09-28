package MechanicalACalc;

public class Leverconstruct {
    double effortd;
    double resis;
    double mechanicalAdvantage;

    public Leverconstruct(double effortd, double resis){
        this.effortd = effortd;
        this.resis = resis;
        mechanicalAdvantage = this.effortd / this.resis;
        


    }
}
