1. Qual era o principal problema do código original?
   O principal problema era a falta de legibilidade e organização. As variáveis possuíam nomes genéricos e sem significado (n, a, b, c), o que dificultava o entendimento do propósito do sistema. Além disso, toda a lógica do programa (definição de dados, cálculos, regras de aprovação e impressão na tela) estava misturada e centralizada em um único lugar, o método main.

2. Quais melhorias você realizou?

Renomeação de Variáveis: Substituí letras soltas por nomes descritivos no padrão camelCase (como nomeAluno e primeiraNota).

Modularização: Removi a lógica do método main e criei métodos específicos para cada tarefa (calcularMedia, verificarSituacao, exibirResultados).

Código Limpo: Ajustei a indentação e os tipos de dados (usando o primitivo double), tornando o código autoexplicativo a ponto de não precisar de comentários para ser compreendido.

3. Como a modularização facilitou a organização do código?
   A modularização aplicou o princípio da responsabilidade única, onde cada bloco de código faz apenas uma coisa. Isso transformou o método main em um orquestrador limpo e fácil de ler. Na prática, facilita a manutenção futura: se a regra de aprovação mudar, basta alterar apenas o método verificarSituacao, sem o risco de quebrar a lógica de cálculo ou de exibição.

4. Como o Git ajudou a controlar as alterações realizadas no sistema?
   O Git forneceu um histórico completo das modificações através dos commits. Ao utilizar uma branch separada (melhoria-boas-praticas), foi possível criar um ambiente isolado e seguro para testar a refatoração sem risco de corromper o código original da branch main. Por fim, o processo de Pull Request e Merge garantiu que as alterações fossem organizadas e integradas de forma controlada.