public class Principal {

    public static void main(String[] args) {
        CachorroServico cachorroServico = new CachorroServico(new Cachorro(12, 45.5, "Miguelito"));

        cachorroServico.gravarDisco();
        System.out.println(cachorroServico.recuperarDisco());
    }
}
