# Dados mapeados
Além dos dados sugeridos, adicionei alguns detalhes às dividas, o que facilitaria analisar se a dívida causa um risco muito alto para uma possível transação financeira.

DadosPessoa {

<br>   String id;
<br>   long cpf;
<br>   String nome;
<br>   String dtNascimento;
<br>   Endereco endereco; 
<br>   List<< Divida >> dividas{
<br>       String tipo;
<br>       double valor;
<br>      long cnpjInstituicao;
<br>       boolean atrasada;
  }
}
