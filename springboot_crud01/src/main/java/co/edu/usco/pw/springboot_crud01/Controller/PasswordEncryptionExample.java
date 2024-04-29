package co.edu.usco.pw.springboot_crud01.Controller;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncryptionExample {

    public static void main(String[] args) {
        // Crear una instancia del BCryptPasswordEncoder
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        // Ejemplo de una contraseña sin encriptar
        String plainPassword = "1234";

        // Encriptar la contraseña
        String encryptedPassword = passwordEncoder.encode(plainPassword);

        // Imprimir la contraseña encriptada
        System.out.println("Contraseña encriptada: " + encryptedPassword);
    }
}
