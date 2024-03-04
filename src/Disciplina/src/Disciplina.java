package Disciplina.src;

public class Disciplina {

    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    private double disciplina1;
    private double disciplina2;
    private double disciplina3;
    private double disciplina4;

    // Métodos getters e setters

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        
        Disciplina other = (Disciplina) obj;
        
        // Compare os campos de disciplinas aqui
        if (Double.compare(this.disciplina1, other.disciplina1) != 0)
            return false;
        
        if (Double.compare(this.disciplina2, other.disciplina2) != 0)
            return false;
        
        if (Double.compare(this.disciplina3,other.disciplina3) != 0)
        
        if (Double.compare(this.disciplina4, other.disciplina4) != 0) {
            
        }

        // Adicione as comparações para disciplina3 e disciplina4 da mesma forma

        return true; // Retorne true se todas as comparações passarem
    }

    public static void main(String[] args) {
        
    }
}
