public class App {
    public static void main(String[] args) throws Exception {
        Cpu cpu = new Cpu();
        cpu.setClock("clock");
        cpu.setModelo("modelo");
        cpu.setId("1");
        cpu.setDescricao("descricao");
        cpu.setValor("R$ 100,00");
        cpu.setFabricante("fabricante");
        cpu.getDetalhesHardware(cpu.getId(),cpu.getDescricao(), cpu.getValor(), cpu.getFabricante());

        DiscoRigido discoRigido = new DiscoRigido();
        discoRigido.setVelocidade("velocidade");
        discoRigido.setCapacidade("capacidade");
        discoRigido.setTipo("tipo");
        discoRigido.setId("2");
        discoRigido.setDescricao("descricao");
        discoRigido.setValor("R$ 200,00");
        discoRigido.setFabricante("fabricante");
        discoRigido.getDetalhesHardware(discoRigido.getId(),discoRigido.getDescricao(), discoRigido.getValor(), discoRigido.getFabricante());

        Memoria memoria = new Memoria();
        memoria.setFrequencia("120HZ");
        memoria.setCapacidade("1000");
        memoria.setId("3");
        memoria.setDescricao("descricao");
        memoria.setValor("R$ 300,00");
        memoria.setFabricante("fabricante");
        memoria.getDetalhesHardware(memoria.getId(),memoria.getDescricao(), memoria.getValor(), memoria.getFabricante());

    }
}
