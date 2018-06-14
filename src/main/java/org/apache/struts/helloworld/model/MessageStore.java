package org.apache.struts.helloworld.model;

/**
 * Classe responsável por armazenar a mensagem
 * 
 * @author Bruce Phillips
 *
 */
public class MessageStore {
    
    private String message;
    
    public MessageStore() {
        message = "Olá usuário do struts";
    }

    public String getMessage() {
        return message;
    }

}
