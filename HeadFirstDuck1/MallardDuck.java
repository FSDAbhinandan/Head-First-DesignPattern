package GitHub.Duck1.HeadFirstDuck1;

public class MallardDuck extends Duck{

    public MallardDuck() {
         quackBehavior = new Quack();
         flyBehavior = new FlyWithWings();
    }



    @Override
    public void display() {
        System.out.println("I Am A Real Mallard GitHub.Duck1.HeadFirstDuck1.Duck");
    }
}
