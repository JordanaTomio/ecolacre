# EcoLacre
## ENTREGAS ##
Primeira versão - 11/04


## CONTRATOS ##

### SolicitacaoFisica
Post - "/solicitacoes/fisica"

    String nome;
    String cpf;
    String endereco;
    String cidade;
    String telefone;
    Date dataNascimento;
    String rg;
    String uf;
    String email;
    String rendaFamiliarMedia;
    boolean estuda;
    boolean trabalha;

    boolean concordaComTermosDoProjeto;
    String razaoCadeiraDeRodas;

    int larguraCostasCm;
    int pesoKg;
    int quadrilCm;
    int alturaCm;
    int menorLarguraPortaCasaCm;
    int larguraAssentoCm;

    string responsavelNome;
    string responsavelTelefone;
    string responsavelEmail;

### SolicitacaoJuridica
Post - "/solicitacoes/juridica"

    String razaoSocial;
    String nomeFantasia;
    String cnpj;
    String endereco;
    String cidade;
    String telefone;
    String uf;
    String cep;
    String email;
    String atividadesDesempenhadas;
    String incentivoFinanceiro;
    String mediaPessoasBeneficiadasMensalmente;

    int qtdCadeiraRodasInstituicao;
    boolean cadeiraRodasSaoEmprestadas;
    String descricaoModeloCadeiraRodas;

    int responsavelNome;
    int responsavelTelefone;
    int responsavelEmail;

    boolean concordaComTermosDoProjeto;
    String razaoCadeiraDeRodas;
