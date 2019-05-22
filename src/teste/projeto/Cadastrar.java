package teste.projeto;
import java.util.ArrayList;


public class Cadastrar {

    public static void main(String[] args) {

        ArrayList<Produtos> listaDeProdutos = new ArrayList<>();

        Produtos notebook = new Produtos();
        Produtos monitor = new Produtos();

        notebook.setNome("Notebook Dell");
        notebook.setPreco(2.999);

        monitor.setNome("Monitor Benq");
        monitor.setPreco(899);

        listaDeProdutos.add(notebook);
        listaDeProdutos.add(monitor);

        for(int i = 0; i < listaDeProdutos.size(); i++) {
            System.out.println("Nome: " + listaDeProdutos.get(i).getNome());
            System.out.println("Preço: " + listaDeProdutos.get(i).getPreco());
            System.out.println("\n");
        }
    }
}



