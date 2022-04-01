public class Cpu extends Hardware {

    protected String clock;
    protected String modelo;

    @Override
    public void getDetalhesHardware(String id, String descricao, String valor, String fabricante) {
        System.out.println("id: " + id + " descricao: " + descricao +  " valor: " + valor + " fabricante: " + fabricante);
    }

    public String getClock() {
        return clock;
    }
    
    public void setClock(String clock) {
        this.clock = clock;
    }

    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
