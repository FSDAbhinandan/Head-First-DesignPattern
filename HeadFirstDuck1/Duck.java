package GitHub.Duck1.HeadFirstDuck1;

public abstract class Duck {
FlyBehavior flyBehavior;
QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

     public  void performQuack(){
    quackBehavior.quack();
}

   public  void performFly(){ flyBehavior.fly(); }

public void swim(){
    System.out.println("All Ducks Float");
}
}
