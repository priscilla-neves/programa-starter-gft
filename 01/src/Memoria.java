public class Memoria extends Hardware {

    protected String frequencia;
    protected String capacidade;

    @Override
    public void getDetalhesHardware(String id, String descricao, String valor, String fabricante) {
        System.out.println("id: " + id + " descricao: " + descricao +  " valor: " + valor + " fabricante: " + fabricante);
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }
}
