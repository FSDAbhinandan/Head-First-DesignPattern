package GitHub.Duck1.HeadFirstDuck1;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
