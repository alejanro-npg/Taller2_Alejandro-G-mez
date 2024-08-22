package edu.unisabana.dyas.patterns.util;

public class MessagingClientProxy implements MessageSender {
    private final MessagingClient originalClient;
    private final MessageValidator validator;

    public MessagingClientProxy(MessagingClient originalClient, MessageValidator validator) {
        this.originalClient = originalClient;
        this.validator = validator;
    }

    @Override
    public void sendMessage(String message) {
        if (validator.isValidMessage(message)) {
            originalClient.sendMessage(message);
        } else {
            System.out.println("Mensaje bloqueado debido a contenido peligrosos.");
        }
    }
}
