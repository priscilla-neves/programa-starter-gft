public class App {
    public static void main(String[] args) throws Exception {
        Ave aveA = new Ave();
        aveA.setAlimentacao("carnivoro");
        aveA.setHabitat("aéreos");
        aveA.locomover();
        aveA.alimentar(aveA.getAlimentacao());

        Ave aveB = new Ave();
        aveB.setAlimentacao("herbivoro");
        aveB.setHabitat("aéreos");
        aveB.locomover();
        aveB.alimentar(aveB.getAlimentacao());

        Mamifero mamiferoA = new Mamifero();
        mamiferoA.setAlimentacao("onivoro");
        mamiferoA.setHabitat("terrestres");
        mamiferoA.locomover();
        mamiferoA.alimentar(mamiferoA.getAlimentacao());

        Anfibio anfibioA = new Anfibio();
        anfibioA.setAlimentacao("onivoro");
        anfibioA.setHabitat("terrestres, aquáticos");	
        anfibioA.locomover();
        anfibioA.alimentar(anfibioA.getAlimentacao());

        Reptil reptilA = new Reptil();
        reptilA.setAlimentacao("onivoro");
        reptilA.setHabitat("terrestres");	
        reptilA.locomover();
        reptilA.alimentar(reptilA.getAlimentacao());
    }
}
