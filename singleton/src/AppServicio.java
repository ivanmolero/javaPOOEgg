public class AppServicio {
    public void iniciar() {
        System.out.println("desde appservicio");
        System.out.println("x : " + Singleton.getSingleton().getX() + ", y : " + Singleton.getSingleton().getY());
    }
}
