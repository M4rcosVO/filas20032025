import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.ArrayList;

public class GeradorSenhas {

    private Queue<Integer> filaPacientes;
    private List<Integer> historicoChamadas;
    private int proximaSenha;

    public GeradorSenhas() {
        this.filaPacientes = new LinkedList<>();
        this.historicoChamadas = new ArrayList<>();
        this.proximaSenha = 1;
    }

    public int gerarSenha() {
        filaPacientes.add(proximaSenha);
        return proximaSenha++;
    }

    public Integer chamarProximo() {
        if (!filaPacientes.isEmpty()) {
            int senhaChamada = filaPacientes.poll();
            historicoChamadas.add(senhaChamada);
            return senhaChamada;
        } else {
            return null; // Indica que não há pacientes na fila
        }
    }

    public List<Integer> getHistoricoChamadas() {
        return historicoChamadas;
    }

    public static void main(String[] args) {
        GeradorSenhas gerador = new GeradorSenhas();

        int senha1 = gerador.gerarSenha();
        int senha2 = gerador.gerarSenha();
        int senha3 = gerador.gerarSenha();

        System.out.println("Senha gerada: " + senha1);
        System.out.println("Senha gerada: " + senha2);
        System.out.println("Senha gerada: " + senha3);

        Integer proximo1 = gerador.chamarProximo();
        Integer proximo2 = gerador.chamarProximo();

        System.out.println("Próximo paciente: " + proximo1);
        System.out.println("Próximo paciente: " + proximo2);

        System.out.println("Histórico de chamadas: " + gerador.getHistoricoChamadas());
    }
}