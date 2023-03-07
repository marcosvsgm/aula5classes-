package classes;

    public class departamento {
        private String nome;
    
        public departamento(String nome) {
            this.nome = nome;
        }
    
        public String getNome() {
            return nome;
        }
    
        public static void main(String[] args) {
            departamento departamento = new departamento("TI");
            System.out.println("Nome do departamento: " + departamento.getNome());
        }
    }
