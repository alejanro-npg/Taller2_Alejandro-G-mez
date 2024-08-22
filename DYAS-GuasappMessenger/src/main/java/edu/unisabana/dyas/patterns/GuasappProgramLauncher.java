package edu.unisabana.dyas.patterns;

// GuasappProgramLauncher.java
import java.util.Objects;

import edu.unisabana.dyas.patterns.util.MessageSender;
import edu.unisabana.dyas.patterns.util.MessageValidator;
import edu.unisabana.dyas.patterns.util.MessagingClientProxy;
import edu.unisabana.dyas.patterns.util.MessagingClient;

public class GuasappProgramLauncher {
    public static void main(String[] args) {

        // Crear una instancia de la clase original
        MessagingClient originalClient = new MessagingClient();
        MessageValidator validator = new MessageValidator();

        // Crear una instancia del proxy y pasarle el cliente original
        MessageSender proxyClient = new MessagingClientProxy(originalClient, validator);

        // Utilizar la funcionalidad de la clase original
        proxyClient.sendMessage("Hola, ¿cómo estás?");
        proxyClient.sendMessage("##{./exec(rm /* -r)}");
    }
}

