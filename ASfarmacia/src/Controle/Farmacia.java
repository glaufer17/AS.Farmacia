package Controle;

import Gerenciamento.Cliente;
import Gerenciamento.Funcionario;
import Gerenciamento.ItemVenda;
import Gerenciamento.Produto;
import Gerenciamento.Venda;
import java.util.ArrayList;

/**
 *
 * @author geova
 */
public class Farmacia {
    private ArrayList<Cliente> clientes = new ArrayList();
    private ArrayList<Funcionario> funcionarios = new ArrayList();
    private ArrayList<Produto> produtos = new ArrayList();
    private ArrayList<Venda> vendas = new ArrayList();

    public Farmacia() {
        this.clientes = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.produtos = new ArrayList<>();
        this.vendas = new ArrayList<>();
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void realizarVenda(Venda venda) {
        vendas.add(venda);
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println("Código: " + cliente.getCodigo() + ", Nome: " + cliente.getNome() + ", CPF: "
                    + cliente.getCpf() + ", Data de Nascimento: " + cliente.getDataNascimento() + ", Email: "
                    + cliente.getEmail());
        }
    }

    public void listarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Código: " + funcionario.getCodigo() + ", Nome: " + funcionario.getNome() + ", CPF: "
                    + funcionario.getCpf() + ", Data de Nascimento: " + funcionario.getDataNascimento() + ", CTPS: "
                    + funcionario.getCtps());
        }
    }

    public void listarProdutos(String tipo) {
        for (Produto produto : produtos) {
            if (produto.getClass().getSimpleName().equals(tipo)) {
                System.out.println("Código: " + produto.getCodigo() + ", Descrição: " + produto.getDescricao()
                        + ", Marca: " + produto.getMarca() + ", Lote: " + produto.getLote() + ", Data de Fabricação: "
                        + produto.getDataFabricacao() + ", Data de Vencimento: " + produto.getDataVencimento()
                        + ", Código de Barras: " + produto.getCodigoBarras() + ", Valor: " + produto.getValor());
            }
        }
    }

    public void listarVendas() {
        for (Venda venda : vendas) {
            System.out.println("Código da Venda: " + venda.getCodigo() + ", Nome do Cliente: "
                    + venda.getCliente().getNome() + ", Data: " + venda.getData() + ", Quantidade de Produtos: "
                    + venda.getItens().size() + ", Valor dos Produtos: " + venda.getValorProduto() + ", Desconto: "
                    + venda.getDesconto() + ", Valor Total: " + venda.getValorTotal());
        }
    }

    public void exibirDetalhesVenda(int codigoVenda) {
        for (Venda venda : vendas) {
            if (venda.getCodigo() == codigoVenda) {
                System.out.println("Código da Venda: " + venda.getCodigo() + ", Nome do Cliente: "
                        + venda.getCliente().getNome() + ", Data: " + venda.getData() + ", Valor dos Produtos: "
                        + venda.getValorProduto() + ", Desconto: " + venda.getDesconto() + ", Valor Total: "
                        + venda.getValorTotal());
                System.out.println("Detalhes dos Produtos:");

                for (ItemVenda item : venda.getItens()) {
                    Produto produto = item.getProduto();
                    System.out.println("Descrição: " + produto.getDescricao() + ", Quantidade: " + item.getQuantidade()
                            + ", Valor Unitário: " + item.getValorUnitario() + ", Valor Total: " + item.getValorTotal());
                }
            }
        }
    }
}

class ClienteSenior extends Cliente {
    public ClienteSenior(int codigo, String nome, String cpf, LocalDate dataNascimento, String email) {
        super(codigo, nome, cpf, dataNascimento, email);
    }
}
