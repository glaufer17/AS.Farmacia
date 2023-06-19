
package controle;

import Gerenciamento.Cliente;
import Gerenciamento.Pessoa;
import java.util.ArrayList;
import util.Input;

public class CadastroCliente {
  
    public static ArrayList<Cliente> clientes = new ArrayList();
    
    public static void setarDados(Cliente cliente){
        CadastroPessoa.setarDados(cliente);       
        System.out.println("Informe o email");
        cliente.setEmail(Input.nextLine());
    }
    
    public static void cadastrar(){
        Cliente c = new Cliente();
        setarDados(c);
        clientes.add(c);
    }
    
    
    public void listar() {
        for (Cliente cliente : clientes) {
            System.out.println("Código: " + cliente.getCodigo() + ", Nome: " + cliente.getNome() + ", CPF: " + cliente.getCpf() + ", Data de Nascimento: " + cliente.getDataNascimento() + ", Email: " + cliente.getEmail());
        }
    }
}
