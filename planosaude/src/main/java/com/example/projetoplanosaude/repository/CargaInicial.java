package com.example.projetoplanosaude.repository;




import com.example.projetoplanosaude.planosaude.domain.PlanoSaude;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CargaInicial {

    private static final Logger log = LoggerFactory.getLogger(CargaInicial.class);

    @Bean CommandLineRunner
    iniciarDb(PlanoSaudeRepository repository){
        return args -> {
            
            log.info("Carregando..." + repository.save(new PlanoSaude("Amil")));
            log.info("Carregando..." + repository.save(new PlanoSaude("Unimed")));
        };
    }
    
}
