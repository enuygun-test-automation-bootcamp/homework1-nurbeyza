public class GTA extends Game{
    private double duration;
    private double day;

    public void Information(double duration, double day){
        Name("GTA");
        this.duration=duration;
        this.day=day;

    }



    @Override
    public double DurationCalculate(){
        return (day/duration);
    }
}
