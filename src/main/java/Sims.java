public class Sims extends Game{
    private double duration;
    private double day;

    public void Information(double duration, double day){
        Name("Sims");
        this.duration=duration;
        this.day=day;

    }
    @Override
    public double DurationCalculate(){
        return (day/duration);
    }
}
