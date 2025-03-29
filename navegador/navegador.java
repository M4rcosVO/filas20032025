import java.util.Stack;

public class Navegador {

    private Stack<String> pilhaVoltar;
    private Stack<String> pilhaAvancar;
    private String paginaAtual;

    public Navegador() {
        this.pilhaVoltar = new Stack<>();
        this.pilhaAvancar = new Stack<>();
        this.paginaAtual = null;
    }

    public void visitarPagina(String endereco) {
        if (paginaAtual != null) {
            pilhaVoltar.push(paginaAtual);
        }
        paginaAtual = endereco;
        pilhaAvancar.clear();
        System.out.println("Visitando: " + paginaAtual);
        atualizarBotoes();
    }

    public void voltar() {
        if (!pilhaVoltar.isEmpty()) {
            pilhaAvancar.push(paginaAtual);
            paginaAtual = pilhaVoltar.pop();
            System.out.println("Voltando para: " + paginaAtual);
            atualizarBotoes();
        } else {
            System.out.println("Não há páginas anteriores.");
        }
    }

    public void avancar() {
        if (!pilhaAvancar.isEmpty()) {
            pilhaVoltar.push(paginaAtual);
            paginaAtual = pilhaAvancar.pop();
            System.out.println("Avançando para: " + paginaAtual);
            atualizarBotoes();
        } else {
            System.out.println("Não há páginas futuras.");
        }
    }

    private void atualizarBotoes() {
        System.out.println("Botão Voltar: " + (!pilhaVoltar.isEmpty() ? "Ativado" : "Desativado"));
        System.out.println("Botão Avançar: " + (!pilhaAvancar.isEmpty() ? "Ativado" : "Desativado"));
    }

    public static void main(String[] args) {
        Navegador navegador = new Navegador();
        navegador.visitarPagina("www.google.com");
        navegador.visitarPagina("www.youtube.com");
        navegador.visitarPagina("www.facebook.com");
        navegador.voltar();
        navegador.avancar();
        navegador.voltar();
        navegador.voltar();
        navegador.voltar();
        navegador.avancar();
        navegador.avancar();
    }
}