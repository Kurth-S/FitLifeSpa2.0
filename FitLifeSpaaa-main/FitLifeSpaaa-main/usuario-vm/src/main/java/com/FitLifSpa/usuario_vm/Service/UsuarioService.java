package com.FitLifSpa.usuario_vm.Service;
import com.FitLifSpa.usuario_vm.Model.UsuarioModel;
import com.FitLifSpa.usuario_vm.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional

public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    // Listar todos los usuarios
    public List<UsuarioModel> findAll() {
        return usuarioRepository.findAll();
    }

    // Buscar usuario por ID
    public UsuarioModel findById(Integer id) {
        Optional<UsuarioModel> usuarioOpt = usuarioRepository.findAll(id);
        if (usuarioOpt.isPresent()) {
            return usuarioOpt.get();
        }
        throw new RuntimeException("Usuario con ID " + id + " no encontrado.");
    }

    // Guardar un nuevo usuario
    public UsuarioModel save(UsuarioModel usuarioModel) {
        return usuarioRepository.save(usuarioModel);
    }

    // Eliminar usuario por ID
    public void deleteById(Integer id) {
        if (!usuarioRepository.existsById(id)) {
            throw new RuntimeException("Usuario con ID " + id + " no encontrado.");
        }
        usuarioRepository.deleteById(id);
    }

}
