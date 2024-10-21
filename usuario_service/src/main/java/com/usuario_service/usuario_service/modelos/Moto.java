package com.usuario_service.usuario_service.modelos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Moto {
    
    private String marca;
    private String modelo;
    private int usuarioId;
}
