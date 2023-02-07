package algaworks.start.notifications;

import algaworks.start.model.ClienteModel;

public class EmailNotifications {

    public void notificar(ClienteModel cliente, String mensagem){
        System.out.printf("Notificando %s atráves do e-mail %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
