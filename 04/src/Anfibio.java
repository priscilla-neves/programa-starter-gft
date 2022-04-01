public class Anfibio extends Animal{

    @Override
    public void locomover() {
        System.out.println("Andar ou Nadar");
    }

    @Override
    public void alimentar(String tipoAlimentacao) {
        switch (tipoAlimentacao){
            case "carnivoro":
                System.out.println("Alimentar com carne");
                break;
            case "onivoro":
                System.out.println("Alimentar com mix de Carne e Vegetais");
                break;
            case "herbivoro":
                System.out.println("Alimentar com Vegetais");
                break;
        }
    }
}
