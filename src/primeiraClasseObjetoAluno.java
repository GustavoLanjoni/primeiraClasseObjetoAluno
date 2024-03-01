public class primeiraClasseObjetoAluno {
    public static void main(String[] args) throws Exception {
        
        teste teste1; // Declaração do objeto, mas não inicializado

        teste teste2 = new teste(); // Inicialização de um objeto utilizando o construtor padrão

        teste teste3 = new teste(); // Inicialização de outro objeto utilizando o construtor padrão

        teste teste4 = new teste("Gustavo"); // Inicialização de um objeto utilizando um construtor com um parâmetro para nome
      
        teste teste5 = new teste("Jose", 50); // Inicialização de um objeto utilizando um construtor com dois parâmetros para nome e idade


        // Exemplo de uso dos objetos
        System.out.println("Nome de teste4: " + teste4.getNome());
        System.out.println("Nome de teste5: " + teste5.getNome() + ", Idade: " + teste5.getIdade());
    }
}

