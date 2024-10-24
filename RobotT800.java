public class RobotT800 extends Robot{

    public RobotT800 () {
        super("T800");
    }
    public void sayHello () {
        System.out.println("Привет, я робот " + getModel());
    }

}
