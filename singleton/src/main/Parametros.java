package main;

public class Parametros {

    private Parametros() {};
    private static Parametros instance = new Parametros();

    public static Parametros getInstance() {
        return instance;
    }

    private String usuario;
    private String conta;

    public String getConta () {
        return conta;
    }

    public void setConta (String conta) {
        this.conta = conta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario (String usuario) {
        this.usuario = usuario;
    }
}
