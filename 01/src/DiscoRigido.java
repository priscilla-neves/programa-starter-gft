public class DiscoRigido extends Hardware {

    protected String velocidade;
    protected String capacidade;
    protected String tipo;

    @Override
    public void getDetalhesHardware(String id, String descricao, String valor, String fabricante) {
        System.out.println("id: " + id + " descricao: " + descricao +  " valor: " + valor + " fabricante: " + fabricante);
    }

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
