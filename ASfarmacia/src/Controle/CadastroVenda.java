package Controle;

import Gerenciamento.Cliente;
import Gerenciamento.Funcionario;
import Gerenciamento.Venda;
import static controle.CadastroCliente.clientes;
import static controle.CadastroFuncionario.funcionarios;
import java.time.LocalDate;
import java.util.ArrayList;
import util.Input;

/**
 *
 * @author geova
 */
public class CadastroVenda {
   protected static ArrayList<Venda> vendas = new ArrayList(); 
   
   public static void setarDados(Venda venda){
       
        System.out.println("Informe o codigo da venda");
        venda.setCodigo(Input.nextInt());
       
        System.out.println("Informe o codigo do funcionario");
        int cod_func = Input.nextInt();
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCodigo() == (cod_func)){
                venda.setFuncionario(funcionario);
            }
        }
        
        System.out.println("Informe o codigo do cliente");
        int cod_cli = Input.nextInt();
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo() == (cod_cli)){
                venda.setCliente(cliente);
            }
        }
        
        venda.setData(LocalDate.now());
    }
}
