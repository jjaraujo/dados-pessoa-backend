# Dados mapeados
Além dos dados sugeridos, adicionei alguns detalhes às dividas, o que facilitaria analisar se a dívida causa um risco muito alto para uma possível transação financeira.

DadosPessoa {
   String id;
	 long cpf;
	 String nome;
	 String dtNascimento;
	 Endereco endereco; 
	 List<Divida> dividas{
       String tipo;
       double valor;
       long cnpjInstituicao;
       boolean atrasada;
  }
}
