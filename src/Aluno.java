import java.lang.classfile.Interfaces;

import javax.swing.JOptionPane;

public class Aluno {
    private String nome;
    private int idade;
    private String dataNascimento;
    private String registroGeral;
    private String numeroCpf;
    private String nomeMae;
    private String dataMatricula;
    private String  escola;
    private String nomePai;
    private String cidade;
    private String bairro;

    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    
    private double disciplina1;
    private double disciplina2;
    private double disciplina3;
    private double disciplina4;
    
        // Construtores, métodos getters e setters para outras variáveis omitidos para brevidade...
    
    public double getDisciplina1() {
            return disciplina1;
        }
    
        public void setDisciplina1(double disciplina1) {
            this.disciplina1 = disciplina1;
        }
    
        public double getDisciplina2() {
            return disciplina2;
        }
    
        public void setDisciplina2(double disciplina2) {
            this.disciplina2 = disciplina2;
        }
    
        public double getDisciplina3() {
            return disciplina3;
        }
    
        public void setDisciplina3(double disciplina3) {
            this.disciplina3 = disciplina3;
        }
    
        public double getDisciplina4() {
            return disciplina4;
        }
    
        public void setDisciplina4(double disciplina4) {
            this.disciplina4 = disciplina4;
        }
    
        // Outros membros da classe...
    
    

    // Construtor padrão
    /*Calculo */
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
    /*Fim dos calculo */

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

    public String getNascimento() {
        return dataNascimento;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setCidade (String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
     }

     public void setEscola(String escola) {
        this.escola = escola;
     }

     public String getEscola() {
        return escola;
     }

     public void setBairro(String bairro) {
        this.bairro = bairro;
     }
     

     public String getBairro() {
        return bairro;
     }

    /*Calculo da media */

    public double getNota(){
        return (nota1 + nota2 + nota3 + nota4 ) / 4;
    }


    /*Em boolean que retorna em numeros */
    public boolean getAlunoAprovado(){
        double media = this.getNota();
        if(media >= 70) {
            return true;
        } else {
            return false;
        }

    }


    /*Em String que retornara o texto */
    public String getAlunoAprovado2(){
        double media = this.getNota();
        if(media >= 70) {
            return "Aluno esta aprovado";
        } else {
            return "Aluno reprovado";
        }

    }

    
    
    public String getAlunoAprovado3(){
        double media = this.getNota();
        if(media >= 70) {
            return "Aluno esta aprovado";
        } else {
            return "Aluno reprovado";
        }

    }

    public String toString() {
        return "Aluno nome =" + " " + getNome() + " , idade =" + " " + getIdade() + ", dataNascimento =" + " " + getDataNascimento() + ", numeroCpf=" + " " + getNumeroCpf() + ", nomeMae =" + " " + getNomeMae() + ", nomePai =" + " " + getNomePai() + ", bairro =" + " " + getBairro() + ", cidade =" + " " + getCidade() + ", dataMatricula =" + " " + getDataMatricula() + ", escola =" + " " + getEscola() + ", nota1 =" + " " + nota1 + ", nota2 =" + " " + nota2 + ", nota3 =" + "" + nota3 + ", nota4 =" + " " + nota4; /*Adicionar a disciplna !*/
    }

    @Override
    public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null || getClass() != obj.getClass())
        return false;
    Aluno other = (Aluno) obj;
    if (nome == null) {
        return other.nome == null;
    } else {
        return nome.equals(other.nome);
    }
}

    @Override
    public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    return result;
}


    

    // Método main para exemplo de uso
    public static void main(String[] args) {
        // Exemplo de uso dos construtores
        Aluno aluno1 = new Aluno(); // Chama o construtor padrão

        Aluno aluno2 = new Aluno("João"); // Chama o construtor com um parâmetro para nome
        Aluno aluno3 = new Aluno("Maria", 25); // Chama o construtor com dois parâmetros para nome e idade

        

        


        // Exemplo de uso dos métodos getters e setters
        /*Aluno 01 
        /*Aluno aluno = new Aluno(); */
        String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
        String idade = JOptionPane.showInputDialog("Qual sua idade?");
        String Nascimento = JOptionPane.showInputDialog("Qual sua data de nascimento?");
        String Matricula = JOptionPane.showInputDialog("Qual o dia da sua matricula?");
        String nomeMae = JOptionPane.showInputDialog("Qual nome da sua mae?");
        String nomePai = JOptionPane.showInputDialog("Qual  nome do seu pai?");
        String escola = JOptionPane.showInputDialog("Qual nome da sua escola?");
        String cidade = JOptionPane.showInputDialog("Qual nome da sua cidade ou CP?");
        String nomeBairro = JOptionPane.showInputDialog("Qual nome do seu bairro?");

            String disciplina1 = JOptionPane.showInputDialog("Disciplina 1");
        String nota1 = JOptionPane.showInputDialog("Nota1");
            
            String disciplina2 = JOptionPane.showInputDialog("Disciplina 2");
        String nota2 = JOptionPane.showInputDialog("Nota2");

            String disciplina3 = JOptionPane.showInputDialog("Disciplina 3");          
        String nota3 = JOptionPane.showInputDialog("Nota3");
 
            String disciplina4 = JOptionPane.showInputDialog("Disciplina4");
        String nota4 = JOptionPane.showInputDialog("Nota4");
        
        
        

        aluno1.setNome(nome);
        aluno1.setIdade(Integer.valueOf(idade));
        aluno1.setDataMatricula(Matricula);
        aluno1.setDataNascimento(Nascimento);
        aluno1.setNomeMae(nomeMae);
        aluno1.setNomePai(nomePai);
        aluno1.setEscola(escola);
        aluno1.setCidade(cidade);
        aluno1.setBairro(nomeBairro);


        aluno1.setNota1(90);    
        aluno1.setNota2(70);
        aluno1.setNota3(90);
        aluno1.setNota4(100);

        

        System.out.println("Nome: " + aluno1.getNome() + ", Idade: " + aluno1.getIdade());
        System.out.println("Media da nota e = " + aluno1.getNota());
        System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));

        System.out.println("----------------------------------------------------------------------------------------");
        
         


        
        System.out.println(aluno1.toString()); /*Descroição do objeto na memoria */
        System.out.println("Media do aluno = " + aluno1.getNota());
        System.out.println("Resultado = " + aluno1.getAlunoAprovado2());


        
      

}
}