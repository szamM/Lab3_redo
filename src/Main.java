
public class Main {
    public static void main(String[] args) {
        LittleBoy littleBoy = new LittleBoy("Малыш");
        Karlson karlson = new Karlson("Карлсон");
        FrekenBok frekenBok = new FrekenBok("фрекен Бок");

        littleBoy.NotThink();
        littleBoy.promise(karlson.getName());
        littleBoy.go();
        littleBoy.sit();
        littleBoy.open_book();
        littleBoy.heard();
        littleBoy.wated();
        frekenBok.turn();
        frekenBok.action();
        frekenBok.saw(littleBoy.getName());
        frekenBok.go();
        frekenBok.stay();
        frekenBok.checking();
    }
}