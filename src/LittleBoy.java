public class LittleBoy extends Chyvachki implements Actions, for_little_boy{
    public LittleBoy(String name) {
        super(name);
    }
    public void NotThink() {
        System.out.println(getName() + " не считал, что это лучший способ позабавиться.");
    }
    public void wated() {
        System.out.println(getName() + " ждал, что ");
    }

    @Override
    public void action() {
        System.out.println("pu pu pu");
    }

    @Override
    public void sit() {
        System.out.println("сел на стул");
    }
    @Override
    public void open_book() {
        System.out.println("открыл задачник");
    }
    @Override
    public void heard() {
        System.out.println(getName() + " слышал, как фрекен Бок обшаривает шкаф.");

    }
    @Override
    public void go() {
        System.out.println("Поэтому он тихонько подкрался к своему столу,");
    }

    @Override
    public void promise(String obj_of_promise) {
        System.out.println("Но ведь " + getName() +" обещал помогать " + obj_of_promise +"у чем сможет.");
    }
}
