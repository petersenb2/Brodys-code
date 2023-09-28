package MechanicalACalc;
import java.util.Scanner;
public class Main {
        static final Scanner sc = new Scanner(System.in); 
    public static void main(String[]args){
        int idk = 0;
// Find what type of mechanical advantage we are working with initally
        System.out.println("What kind of Mechanical advantage are you dealing with? ");

        
// Behaviors
        while(idk == 0){
            System.out.println("Screw, Lever, InclinedPlane, WheelAxle");
            String type = sc.nextLine().toLowerCase();
            if(type.equals("screw")){
                System.out.println("what is your circumfrence and pitch? ");
                // define measurements
                double cir = getDouble("circumference: ");
                double pit = getDouble("Pitch ");
                Screwconstruct screwA = new Screwconstruct(pit, cir);
                double screwAMechanical = screwA.mechanicalAdvantage;

                System.out.println("Mechanical advantage: " + screwAMechanical);

                idk = 1;
            }
            else if(type.equals("lever")){
                System.out.println("What are your distances? ");
                double effort1 = getDouble("effort distance");
                double resis1 = getDouble("resistance distance "); 
                Leverconstruct leverA = new Leverconstruct(effort1, resis1);
                double leverMechanicalAdvantage = leverA.mechanicalAdvantage;
                System.out.println("Mechanical Advantage " + leverMechanicalAdvantage);
                idk = 1;
            }
            else if(type.equals("inclinedplane")){
                System.out.println("what is your length and height? ");
                double len = getDouble("length");
                double high = getDouble("height ");
                InclinedPlaneCon inclinedA = new InclinedPlaneCon(len, high);
                double ima = inclinedA.mechanicalAdvantage;
                System.out.println("Mechanical Advantage = " + ima);

                idk = 1;
            }
            else if(type.equals("wheelaxle")){
                System.out.println("What is the radius of your effort and output? ");
                double eff = getDouble("effort ");
                double resis = getDouble("output ");
                Leverconstruct wheelAxle = new Leverconstruct(eff, resis);
                double wama = wheelAxle.mechanicalAdvantage;
                System.out.println(wama);


                idk = 1;
             }
            else{
                System.out.println("Choose a valid system: ");
                idk = 0;           
        }
       

    } 

    }

    public static double getDouble(String prompt) {
        while(true){
            try {
                System.out.println(prompt);
                double cir = Double.parseDouble(sc.nextLine());
                return cir;
            }
            catch (Exception e){
                System.out.println("Try again");
            }
        }
    }

}
