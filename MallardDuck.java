package HeadFirstDuck.Duck1;

public class MallardDuck extends Duck{

    public MallardDuck() {
         quackBehavior = new Quack();
         flyBehavior = new FlyWithWings();
    }



    @Override
    public void display() {
        System.out.println("I Am A Real Mallard HeadFirstDuck.Duck1.Duck");
    }
}
