public class teste {
    private String nome;
    private int idade;
    private String dataNascimento;
    private String registroGeral;
    private String numeroCpf;
    private String nomeMae;
    private String dataMatricula;
    
    // Construtor padrão
    public teste() {
        this.nome = "";
        this.idade = 0;
        this.dataNascimento = "";
        this.registroGeral = "";
        this.numeroCpf = "";
        this.nomeMae = "";
        this.dataMatricula = "";
    }

    // Construtor com um parâmetro para nome
    public teste(String nome) {
        this.nome = nome;
    }

    // Construtor com dois parâmetros para nome e idade
    public teste(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    // Método main para exemplo de uso
    public static void main(String[] args) {
        // Exemplo de uso dos construtores
        teste teste1 = new teste(); // Chama o construtor padrão
        teste teste2 = new teste("João"); // Chama o construtor com um parâmetro para nome
        teste teste3 = new teste("Maria", 25); // Chama o construtor com dois parâmetros para nome e idade

        // Exemplo de uso dos métodos getters e setters
        teste1.setNome("Fernando");
        teste1.setIdade(30);
        System.out.println("Nome: " + teste1.getNome() + ", Idade: " + teste1.getIdade());
    }
}
