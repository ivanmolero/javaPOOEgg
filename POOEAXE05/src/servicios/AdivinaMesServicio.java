package servicios;

import entidades.AdivinaMes;

import java.util.Scanner;

public class AdivinaMesServicio {
    Scanner scan = new Scanner(System.in);
    public void adivinaMes(AdivinaMes adivinaMes) {
        String mes = "";
        do {
            System.out.println("ingrese un mes para adivinar: ");
            mes = scan.nextLine();
            if (!mes.equals(adivinaMes.getMesSecreto())) {
                System.out.println("no has acertado, intentalo de nuevo");
            } else {
                System.out.println("has acertado!!!");
            }
        } while(!mes.equals(adivinaMes.getMesSecreto()));
    }
}
