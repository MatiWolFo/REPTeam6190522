package com.generationg6.services;

import com.generationg6.repositories.ConfiguracionJuegoRepository;
import com.generationg6.repositories.ContenidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfiguracionJuegoService {

    /* INYECCION DE DEPENDENCIA A REPOSITORIO */
    @Autowired
    ConfiguracionJuegoRepository configuracionJuegoRepository;
}
