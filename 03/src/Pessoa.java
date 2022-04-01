public class Pessoa {

    protected String nome;
    protected String sexo;
    protected int dataNascimento;
    protected int dataAtual = 2022;
    int expectativaHomem = 73;
    int expectativaMulher = 80; 

    public void imprimeTempoVidaRestante(String sexo, int dataNascimento) {
        if (sexo == "M") {
            int anos = (dataAtual - dataNascimento);
            int tempoRestante = expectativaHomem - anos;
            System.out.println(tempoRestante);
        } else {
            int anos = (dataAtual - dataNascimento);
            int tempoRestante = expectativaMulher - anos;
            System.out.println(tempoRestante);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}