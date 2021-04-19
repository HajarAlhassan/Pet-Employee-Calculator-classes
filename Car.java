package com.tts;

public class Car {
    enum Color{Red,Yellow,Green,Blue,Silver,White,Black};
    private int door;
    private Color color;
    private static double weight;
    public static double calcweight(double lbs){
        double kg=lbs/100+weight;
        return kg;
    }
    public Car(){
        this.door=4;
        this.color=Color.White;
    }
    public Car(int door,Color color){
        this.door=door;
        this.color=color;
    }
    public Color getColor(){
        return  this.color;
    }
    public  int getDoor(){
        return this.door;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public void setDoor(int door){
      this.door=door;
    }
    public void start(){
        System.out.println("The car is starting now");
    }

    public static void main(String[] args) {
        Car car=new Car(4,Color.Red);
        System.out.println(car.getColor());
        System.out.println(car.getDoor());
        Honda civic=new Honda();
        civic.setColor(Color.White);
        civic.setModel(Honda.Model.Civic);
        civic.start();
        civic.carDesc();
        System.out.println(car.color);
    }
}

 class Honda extends Car{
    final static String BRAND="HONDA";
    enum Model{Oddesy,Civic,Pilot};
    private Model model;
    public Honda(){
        super();
        this.model=Model.Civic;
    }
    public Honda(Model model){
        super();
        this.model=model;
    }

     public Model getModel() {
         return model;
     }
     public void setModel(Model model){
        this.model=model;
     }
     public void carDesc(){
         System.out.println("You Have a "+this.BRAND+" "+ this.model+" Car, Which color is "+this.getColor()+" and has "+this.getDoor()+" door");
     }
 }