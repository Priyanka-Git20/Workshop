public class Penguin extends Bird implements Swimmable{

    public Penguin() {
        name = "Penguin";
        color = Color.BLACK_WHITE;
    }

    @Override
    public void swim() {
        System.out.println("Penguin can swim");
    }
}
