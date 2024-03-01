public class primeiraClasseObjetoAluno {
    public static void main(String[] args) throws Exception {
       

        Aluno aluno1; // Declaração do objeto, mas não inicializado

        Aluno aluno2 = new Aluno(); // Inicialização de um objeto utilizando o construtor padrão

        Aluno aluno3 = new Aluno(); // Inicialização de outro objeto utilizando o construtor padrão

        Aluno aluno4 = new Aluno("Gustavo"); // Inicialização de um objeto utilizando um construtor com um parâmetro para nome
      
        Aluno aluno5 = new Aluno("Jose", 50); // Inicialização de um objeto utilizando um construtor com dois parâmetros para nome e idade

                

        // Exemplo de uso dos objetos
        System.out.println("Nome de aluno4: " + aluno4.getNome());
        System.out.println("Nome de aluno5: " + aluno5.getNome() + ", Idade: " + aluno5.getIdade());
    }
}
