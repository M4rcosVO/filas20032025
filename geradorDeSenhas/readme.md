A classe GeradorSenhas possui três atributos: filaPacientes, historicoChamadas e proximaSenha.
O método gerarSenha adiciona a próxima senha à fila de pacientes e incrementa o contador.
O método chamarProximo remove o primeiro paciente da fila, adiciona a senha ao histórico e retorna a senha chamada.
O método getHistoricoChamadas retorna o histórico de chamadas.
O método main demonstra o uso da classe GeradorSenhas.

A classe GeradorSenhas encapsula a lógica de geração de senhas e controle da fila de pacientes.
A fila filaPacientes armazena as senhas dos pacientes em ordem de chegada.
A lista historicoChamadas armazena as senhas dos pacientes que já foram chamados.
O atributo proximaSenha controla a sequência de senhas geradas.
Os métodos gerarSenha, chamarProximo e getHistoricoChamadas implementam a lógica do sistema.
O método main demonstra o uso da classe GeradorSenhas.
