package org.example.servicios;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Crud {

    Scanner scan;

    public Crud() {
        scan = new Scanner(System.in);
    }

    public Object crearObjeto(Object objeto) {
        try {
            List<Method> metodosSet = obtieneMetodosPrefijo("set", Arrays.stream(objeto.getClass().getMethods()).toList());
            for (Method method : metodosSet) {
                System.out.println("ingrese el valor para el atributo " + method.getName().substring(3) + ": ");
                Class<?> tipoAtributo = method.getParameterTypes()[0];
                switch (tipoAtributo.toString()) {
                    case "class java.lang.Integer" -> method.invoke(objeto, Integer.parseInt(scan.nextLine()));
                    case "class java.lang.String" -> method.invoke(objeto, scan.nextLine());
                    case "class java.lang.Double" -> method.invoke(objeto, Double.parseDouble(scan.nextLine()));
                    case "class java.lang.Boolean" -> method.invoke(objeto, Boolean.parseBoolean(scan.nextLine()));
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // foreach sobre los metodos set de un objeto
        return objeto;
    }

    public Object editaObjeto(Object objeto) {
        // listar los atributos actuales (metodos get) y sus valores, numerarlos para seleccionar que modificar
        List<Method> metodos = null;
        List<Method> metodosGet = new ArrayList<>();
        try {
            metodosGet = obtieneMetodosPrefijo("get", Arrays.stream(objeto.getClass().getMethods()).toList());
            int op;
            do {
                op = seleccionaOpcion(metodosGet, objeto);
                if (op != metodosGet.size() + 1) editaOpcionAtributo(metodosGet, objeto, op);
            } while (op != metodosGet.size() + 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return objeto;
    }

    private List<Method> obtieneMetodosPrefijo(String prefijo, List<Method> metodos) {
        List salida = new ArrayList();
        for (Method method : metodos) {
            if (method.getName().startsWith(prefijo) && !method.getName().contains("Class")) salida.add(method);
        }
        return salida;
    }

    private void editaOpcionAtributo(List<Method> metodosGet, Object objeto, int op) throws Exception {
        System.out.printf(
                "el valor actual de %s es: %s\n",
                metodosGet.get(op - 1).getName().substring(3).toUpperCase(),
                metodosGet.get(op - 1).invoke(objeto)
        );
        System.out.printf(
                "ingrese el nuevo valor de %s:\n",
                metodosGet.get(op - 1).getName().substring(3).toUpperCase()
        );
        List<Method> metodosSet = obtieneMetodosPrefijo("set", Arrays.stream(objeto.getClass().getMethods()).toList());
        Method method = metodosSet.get(op - 1);
        Class<?> tipoAtributo = method.getParameterTypes()[0];
        switch (tipoAtributo.toString()) {
            case "class java.lang.Integer" -> method.invoke(objeto, Integer.parseInt(scan.nextLine()));
            case "class java.lang.String" -> method.invoke(objeto, scan.nextLine());
            case "class java.lang.Double" -> method.invoke(objeto, Double.parseDouble(scan.nextLine()));
            case "class java.lang.Boolean" -> method.invoke(objeto, Boolean.parseBoolean(scan.nextLine()));
        }
    }

    private int seleccionaOpcion(List<Method> metodosGet, Object objeto) {
        int opcion;
        do {
            mostrarAtributosValor(metodosGet, objeto);
            System.out.println("ingrese el valor a seleccionar: ");
            opcion = Integer.parseInt(scan.nextLine());
            if (opcion <= 0 || opcion > metodosGet.size() + 1) System.out.println("ingrese un valor válido");
        } while (opcion <= 0 || opcion >metodosGet.size() + 1);
        return opcion;
    }

    private void mostrarAtributosValor(List<Method> metodosGet, Object objeto) {
        try {
            int i = 1;
            for (Method method : metodosGet) {
                System.out.printf(
                        "%d - %s: %s\n",
                        i,
                        method.getName().substring(3).toUpperCase(),
                        method.invoke(objeto)
                );
                i++;
            }
            System.out.printf("%d - SALIR\n", i);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
