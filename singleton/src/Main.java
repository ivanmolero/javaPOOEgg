public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        singleton.setX(10);
        singleton.setY(20);
        System.out.println("x : " + singleton.getX() + ", y : " + singleton.getY());
        AppServicio app = new AppServicio();
        app.iniciar();
    }
}