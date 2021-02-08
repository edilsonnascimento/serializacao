import java.awt.*;
import java.io.*;

public class CachorroServico {

    private String pacote = "src/";
    private String nomeArquivo = "arquivo.dat";
    private Cachorro cachorro;

    public CachorroServico(Cachorro cachorro) {
        this.cachorro = cachorro;
    }

    public void gravarDisco() {
        try {
            FileOutputStream arquivo = new FileOutputStream(pacote + nomeArquivo);
            ObjectOutputStream objetoGravacao = new ObjectOutputStream(arquivo);

            objetoGravacao.writeObject(this.cachorro);
            objetoGravacao.flush();
            objetoGravacao.close();
            System.out.println("Cachorro cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao serializar objeto e gravar em disco...");
        }
    }

    public Cachorro recuperarDisco() {
        Cachorro cachorroRecuperado = null;

        try {
            FileInputStream arquivoLeitura = new FileInputStream(pacote + nomeArquivo);
            ObjectInputStream objetoLeitura = new ObjectInputStream(arquivoLeitura);
            cachorroRecuperado = (Cachorro) objetoLeitura.readObject();

        } catch (Exception e) {
            System.out.println("Erro ao recuperar dados de Cachorro..");
        }

        return cachorroRecuperado;

    }

}
