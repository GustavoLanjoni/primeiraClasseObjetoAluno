import javax.swing.JOptionPane;

import Disciplina.src.Disciplina;

public class Aluno {
    private String nome;
    private int idade;
    private String dataNascimento;
    private String registroGeral;
    private String numeroCpf;
    private String nomeMae;
    private String dataMatricula;
    private String escola;
    private String nomePai;
    private String cidade;
    private String bairro;
    
    
     
    public Aluno() {
        this.nome = "";
        this.idade = 0;
        this.dataNascimento = "";
        this.registroGeral = "";
        this.numeroCpf = "";
        this.nomeMae = "";
        this.dataMatricula = "";
        this.nomePai = "";
        this.cidade = "";
        this.bairro = "";
        this.escola = "";
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

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    // Método para calcular a média das notas
    public double getMediaNotas() {
        return (disciplina.getNota1() + disciplina.getNota2() + disciplina.getNota3() + disciplina.getNota4()) / 4.0;
    }

    // Método para verificar se o aluno está aprovado
    public boolean isAprovado() {
        return getMediaNotas() >= 70;
    }

    // Método para obter o status de aprovação como texto
    public String getStatusAprovacao() {
        return isAprovado() ? "Aprovado" : "Reprovado";
    }

    // Método main para exemplo de uso
    public static void main(String[] args) {
        // Exemplo de uso dos construtores
        Aluno aluno1 = new Aluno(); // Chama o construtor padrão

        Aluno aluno2 = new Aluno("João"); // Chama o construtor com um parâmetro para nome
        Aluno aluno3 = new Aluno("Maria", 25); // Chama o construtor com dois parâmetros para nome e idade

        // Exemplo de uso dos métodos getters e setters
        String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
        String idade = JOptionPane.showInputDialog("Qual sua idade?");
        String dataNascimento = JOptionPane.showInputDialog("Qual sua data de nascimento?");
        String dataMatricula = JOptionPane.showInputDialog("Qual o dia da sua matricula?");
        String nomeMae = JOptionPane.showInputDialog("Qual nome da sua mae?");
        String nomePai = JOptionPane.showInputDialog("Qual nome do seu pai?");
        String escola = JOptionPane.showInputDialog("Qual nome da sua escola?");
        String cidade = JOptionPane.showInputDialog("Qual nome da sua cidade ou CP?");
        String bairro = JOptionPane.showInputDialog("Qual nome do seu bairro?");

        aluno1.setNome(nome);
        aluno1.setIdade(Integer.valueOf(idade));
        aluno1.setDataMatricula(dataMatricula);
        aluno1.setDataNascimento(dataNascimento);
        aluno1.setNomeMae(nomeMae);
        aluno1.setNomePai(nomePai);
        aluno1.setEscola(escola);
        aluno1.setCidade(cidade);
        aluno1.setBairro(bairro);

        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota1"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota2"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Nota3"));
        double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Nota4"));

        // Configurando as notas da disciplina do aluno
        aluno1.getDisciplina().setNota1(nota1);
        aluno1.getDisciplina().setNota2(nota2);
        aluno1.getDisciplina().setNota3(nota3);
        aluno1.getDisciplina().setNota4(nota4);

        System.out.println("Nome: " + aluno1.getNome() + ", Idade: " + aluno1.getIdade());
        System.out.println("Média das notas: " + aluno1.getMediaNotas());
        System.out.println("Status de aprovação: " + aluno1.getStatusAprovacao());
    }
}
