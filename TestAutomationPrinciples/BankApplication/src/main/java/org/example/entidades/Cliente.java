package org.example.entidades;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    private String nombre;
    private String dni;
    private String password;
    private Cuenta cuenta;
}
