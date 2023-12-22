public class FrekenBok extends Chyvachki implements Actions, for_freken_bok{
    public FrekenBok(String name) {
        super(name);
    }

    @Override
    public void action() {
        System.out.println(getName() + " вынырнула из шкафа");
    }


    @Override
    public void go() {
        System.out.println(getName() + " попятилась назад");
    }
    @Override
    public void turn() {
        System.out.println(getName() + " обернеться.");
    }
    @Override
    public void saw(String obj_of_seeing) {
        System.out.println(getName() + " увидела " + obj_of_seeing + "а");
    }
    @Override
    public void stay() {
        System.out.println(getName() + " простояла долго");
    }
    @Override
    public void checking() {
        System.out.println(getName() + " только несколько раз опускала веки, словно проверяя себя, не обман ли это зрения.");
    }


}
