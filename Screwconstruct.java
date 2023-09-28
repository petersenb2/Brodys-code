package MechanicalACalc;

public class Screwconstruct {
    double pitch;
    double circumference;
    double mechanicalAdvantage;

    public Screwconstruct(double pitch, double circumference){
        this.pitch = pitch;
        this.circumference = circumference;
        this.mechanicalAdvantage = this.pitch / this.circumference;
    }
}
