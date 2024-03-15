package com.trabalho.controllers;

import com.trabalho.domain.Usuario;
import com.trabalho.repositories.UsuarioRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.net.URLDecoder;

@RestController
@Transactional
public class UsuarioController {

    @Autowired
    private final UsuarioRepository repository;

    public UsuarioController(UsuarioRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/usuarios/inserir")
    Integer saveUser(@RequestBody Usuario usuarioParaInserir) {
        try {
            repository.save(usuarioParaInserir);
            return HttpStatus.OK.value();
        } catch (Exception e) {
            return HttpStatus.UNPROCESSABLE_ENTITY.value();
        }
    }

    @PostMapping("/usuarios/login")
    Integer login(@RequestBody Usuario usuarioParaLogar) {
        Usuario usuarioEncontrado = repository.findByEmail(usuarioParaLogar.getEmail());
        if (!usuarioParaLogar.getSenha().equals(usuarioEncontrado.getSenha())) {
            HttpStatus.FORBIDDEN.value();
        }
        return HttpStatus.OK.value();
    }

    @PostMapping("/usuarios/editar")
    Integer perfil(@RequestBody Usuario usuarioParaProcurar) {
        Usuario usuarioEncontrado = repository.findByEmail(usuarioParaProcurar.getEmail());
        if (!usuarioParaProcurar.getSenha().equals(usuarioEncontrado.getSenha())) {
            HttpStatus.FORBIDDEN.value();
        }
        return HttpStatus.OK.value();
    }

    @PostMapping("/usuarios/edit")
    Integer updateUser(@RequestBody Usuario usuarioParaEditar) {

        Usuario usuarioEncontrado = repository.findByEmail(usuarioParaEditar.getEmail());

        if (usuarioEncontrado == null) {
            return HttpStatus.UNPROCESSABLE_ENTITY.value();
        }

        usuarioEncontrado.setNome(usuarioParaEditar.getNome());
        usuarioEncontrado.setSenha(usuarioParaEditar.getSenha());

        try {

            repository.save(usuarioEncontrado);
            return HttpStatus.OK.value();

        } catch (Exception e) {
            return HttpStatus.UNPROCESSABLE_ENTITY.value();
        }
    }

    @PostMapping("/usuario/excluir")
    Integer deleteUser(@RequestBody String usuarioParaEditar) {

        try {
            Usuario usuarioEncontrado = repository.findByEmail(StringUtils.chop(URLDecoder.decode(usuarioParaEditar)));
            repository.deleteById(usuarioEncontrado.getId());
            return HttpStatus.OK.value();
        } catch (Exception e) {
            return HttpStatus.UNPROCESSABLE_ENTITY.value();
        }
    }

    @PostMapping("/usuario/find")
    Usuario findByEmail(@RequestBody String email) {
        Usuario usuarioEncontrado = repository.findByEmail(StringUtils.chop(URLDecoder.decode(email)));
        return usuarioEncontrado;
    }
}
