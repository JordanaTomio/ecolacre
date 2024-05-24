package br.com.trabalho.ecolacre.controllers;

import br.com.trabalho.ecolacre.domain.PontoColeta;
import br.com.trabalho.ecolacre.repositories.PontoColetaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional
@RequestMapping("/ponto-coleta")
public class PontoColetaController {

    @Autowired
    private PontoColetaRepository coletaRepository;

    @PostMapping("/criar")
    ResponseEntity<Long> saveUser(@RequestBody PontoColeta pontoColeta) {
        try {
            pontoColeta.setDataInscricao(java.time.LocalDateTime.now());
            pontoColeta.setAtivo(false);
            coletaRepository.save(pontoColeta);
            return ResponseEntity.ok(pontoColeta.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
