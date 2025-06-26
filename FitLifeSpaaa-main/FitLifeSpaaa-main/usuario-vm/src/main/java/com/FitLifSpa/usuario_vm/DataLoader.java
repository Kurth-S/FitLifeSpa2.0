package com.FitLifSpa.usuario_vm;
import com.FitLifSpa.usuario_vm.Model.Usuario;
import com.FitLifSpa.usuario_vm.Repository.UsuarioRepository;
import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void run(String... args) {
        Faker faker = new Faker();

        for (int i = 1; i <= 25; i++) {
            Usuario usuario = new Usuario();
            usuario.setNombre(faker.name().firstName());
            usuario.setRun(faker.idNumber().valid());
            usuario.setPassword("password" + i);  // Contraseña simple, puedes encriptarla si deseas

            usuarioRepository.save(usuario);
        }

        System.out.println("✅ Usuarios generados en entorno dev .");
    }
}
