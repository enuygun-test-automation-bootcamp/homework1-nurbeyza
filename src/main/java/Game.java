public abstract class Game {
    private String name;

    public void Name (String name){
        this.name=name;
    }
    public abstract double DurationCalculate();

    public void Goodluck(){
        System.out.println("GOOD LUCK!!");
    }


    public String Name2(){
        return this.name;
    }


}
