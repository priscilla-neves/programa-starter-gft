public class App {
    public static void main(String[] args) throws Exception {
        Pessoa homem = new Pessoa();
        homem.setDataNascimento(1992);
        homem.setSexo("M");
        homem.setNome("João");
        homem.imprimeTempoVidaRestante(homem.getSexo(), homem.getDataNascimento());

        Pessoa mulher = new Pessoa();
        mulher.setDataNascimento(1991);
        mulher.setSexo("F");
        mulher.setNome("Priscilla");
        mulher.imprimeTempoVidaRestante(mulher.getSexo(), mulher.getDataNascimento());
    }
}
