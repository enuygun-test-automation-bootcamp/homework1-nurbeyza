
// Sözel ödevler "resources" doyası altında bulunabilir.

public class AbstractClass {
    public static void main(String[] args){

        GTA gta= new GTA();
        gta.Information(3,24);
        System.out.println("Game Name:"+gta.Name2());
        System.out.println("Game Duration:"+gta.DurationCalculate());
        gta.Goodluck();

        System.out.println("***********");

        Sims Sims= new Sims();
        Sims.Information(4,24);
        System.out.println("Game Name:"+Sims.Name2());
        System.out.println("Game Duration:"+Sims.DurationCalculate());
        Sims.Goodluck();

    }
}
