package algaworks.start.model;

import lombok.Data;

@Data
public class ClienteModel {

    private String nome;
    private String email;
    private String telefone;
    private boolean ativo;
}
