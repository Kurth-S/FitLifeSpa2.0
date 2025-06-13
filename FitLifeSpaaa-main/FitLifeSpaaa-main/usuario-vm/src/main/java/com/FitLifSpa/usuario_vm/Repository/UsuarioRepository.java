package com.FitLifSpa.usuario_vm.Repository;
import com.FitLifSpa.usuario_vm.Model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
}
