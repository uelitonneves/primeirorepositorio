
package projetojavs;


public class abstrata {

    /**
     * @param args the command line arguments
     */
    
       public abstract class Pessoa implements IPessoa {
    private String nome, rg, cpf;

        public String getNome() {
            return nome;
        }

        public String getRg() {
            return rg;
        }

        public String getCpf() {
            return cpf;
        }
    
    Pessoa(String nome, String rg, String cpf){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setRg(rg);
    }

        private void setNome(String nome) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setCpf(String cpf) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setRg(String rg) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
