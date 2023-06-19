package Menu;

/**
 *
 * @author geova
 */
public class FarmaciaMain {
    public static void main(String[] args) {
        Farmacia farmacia = new Farmacia();

        // Cadastrar clientes
        Cliente cliente1 = new Cliente(1, "João", "123456789", LocalDate.of(1980, 5, 10), "joao@example.com");
        Cliente cliente2 = new Cliente(2, "Maria", "987654321", LocalDate.of(1975, 9, 20), "maria@example.com");

        farmacia.cadastrarCliente(cliente1);
        farmacia.cadastrarCliente(cliente2);

        // Cadastrar funcionários
        Funcionario funcionario1 = new Funcionario(1, "Pedro", "456789123", LocalDate.of(1990, 3, 15), "12345");
        Funcionario funcionario2 = new Funcionario(2, "Ana", "789123456", LocalDate.of(1985, 7, 25), "54321");

        farmacia.cadastrarFuncionario(funcionario1);
        farmacia.cadastrarFuncionario(funcionario2);

        // Cadastrar produtos
        Produto produto1 = new Produto(1, "Produto 1", "Marca 1", "Lote 1", LocalDate.of(2022, 1, 1),
                LocalDate.of(2023, 1, 1), "123456789", 10.0);
        Produto produto2 = new Produto(2, "Produto 2", "Marca 2", "Lote 2", LocalDate.of(2022, 2, 1),
                LocalDate.of(2023, 2, 1), "987654321", 20.0);
        MedicamentoControlado produto3 = new MedicamentoControlado(3, "Produto 3", "Marca 3", "Lote 3",
                LocalDate.of(2022, 3, 1), LocalDate.of(2023, 3, 1), "456789123", 30.0, 12345, "Composição 3", 1.0);

        farmacia.cadastrarProduto(produto1);
        farmacia.cadastrarProduto(produto2);
        farmacia.cadastrarProduto(produto3);

        // Realizar vendas
        Venda venda1 = new Venda(1, funcionario1, cliente1, LocalDate.now(), 0.0);
        venda1.adicionarItem(new ItemVenda(produto1, 2));
        venda1.adicionarItem(new ItemVenda(produto2, 1));

        Venda venda2 = new Venda(2, funcionario2, cliente2, LocalDate.now(), 0.0);
        venda2.adicionarItem(new ItemVenda(produto3, 3));

        farmacia.realizarVenda(venda1);
        farmacia.realizarVenda(venda2);

        // Listar clientes
        farmacia.listarClientes();

        // Listar funcionários
        farmacia.listarFuncionarios();

        // Listar produtos
        farmacia.listarProdutos("MedicamentoControlado");

        // Listar vendas
        farmacia.listarVendas();

        // Exibir detalhes da venda
        farmacia.exibirDetalhesVenda(1);
    }
}
