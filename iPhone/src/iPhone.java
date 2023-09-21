public class iPhone {
    private Reprodutor reprodutor;
    private Telefone telefone;
    private Navegador navegador;

    public iPhone() {
        reprodutor = new Reprodutor();
        telefone = new Telefone();
        navegador = new Navegador();
    }

    public void reproduzirMusica(String musica) {
        reprodutor.tocar(musica);
    }

    public void pausarMusica() {
        reprodutor.pausar();
    }

    public void selecionarMusica(String musica) {
        reprodutor.selecionarMusica(musica);
    }

    public void fazerLigacao(String numero) {
        telefone.ligar(numero);
    }

    public void atenderChamada() {
        telefone.atender();
    }

    public void acessarCorreioDeVoz() {
        telefone.correioDeVoz();
    }

    public void abrirPagina(String url) {
        navegador.exibirPagina(url);
    }

    public void adicionarAba(String aba) {
        navegador.adicionarAba(aba);
    }

    public void atualizarPagina() {
        navegador.atualizarPagina();
    }
}

