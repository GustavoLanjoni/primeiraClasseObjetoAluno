public class Aluno {
    private String nome;
    private int idade;
    private String dataNascimento;
    private String registroGeral;
    private String numeroCpf;
    private String nomeMae;
    private String dataMatricula;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;


    // Construtor padrão
    public double getNota1(){
        return nota1;
    }

    public void setNota1(double nota1){
        this.nota1 = nota1;
    }

    public double getNota2 (){
        return nota2;
    }

    public void setNota2(double nota2){
        this.nota2 = nota2;
    }

    public double getNota3(){
        return nota3;
    }

    public void setNota3(double nota3){
        this.nota3 = nota3;
    }

    public double getNota4(){
        return nota4;
    }

    public void setNota4(double nota4){
        this.nota4 = nota4;
    }


    public Aluno() {
        this.nome = "";
        this.idade = 0;
        this.dataNascimento = "";
        this.registroGeral = "";
        this.numeroCpf = "";
        this.nomeMae = "";
        this.dataMatricula = "";
    }

    // Construtor com um parâmetro para nome
    public Aluno(String nome) {
        this.nome = nome;
    }

    // Construtor com dois parâmetros para nome e idade
    public Aluno(String nome, int idade) {
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

    /*Calculo da media */

    public double getNota(){
        return (nota1 + nota2 + nota3 + nota4 ) / 4;
    }

  




    // Método main para exemplo de uso
    public static void main(String[] args) {
        // Exemplo de uso dos construtores
        Aluno aluno1 = new Aluno(); // Chama o construtor padrão
        Aluno aluno2 = new Aluno("João"); // Chama o construtor com um parâmetro para nome
        Aluno aluno3 = new Aluno("Maria", 25); // Chama o construtor com dois parâmetros para nome e idade

        // Exemplo de uso dos métodos getters e setters
        aluno1.setNome("Fernando");
        aluno1.setIdade(30);
        aluno1.setNota1(90);
        aluno1.setNota2(70);
        aluno1.setNota3(90);
        aluno1.setNota4(100);
        System.out.println("Nome: " + aluno1.getNome() + ", Idade: " + aluno1.getIdade());
        System.out.println("Media da nota e = " + aluno1.getNota());
    }
}