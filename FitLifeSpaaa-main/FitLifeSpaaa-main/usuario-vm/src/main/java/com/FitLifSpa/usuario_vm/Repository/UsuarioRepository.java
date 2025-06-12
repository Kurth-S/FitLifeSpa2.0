package com.FitLifSpa.usuario_vm.Repository;
import com.FitLifSpa.usuario_vm.Model.UsuarioModel;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long>{

    Optional<UsuarioModel> findAll(Integer id);

    boolean existsById(Integer id);

    void deleteById(Integer id);

}
