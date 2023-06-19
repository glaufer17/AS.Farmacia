
package controle;

import Gerenciamento.Funcionario;
import java.util.ArrayList;
import util.Input;

public class CadastroFuncionario {
    
    public static ArrayList<Funcionario> funcionarios = new ArrayList();
    
    public static void setarDados(Funcionario funcionario){
        CadastroPessoa.setarDados(funcionario);
        System.out.println("Informe o ctps");
        funcionario.setCtps(Input.nextLine());
    }
    
    public static void cadastrar(){
        Funcionario f = new Funcionario();
        setarDados(f);
        funcionarios.add(f);
    }
}
