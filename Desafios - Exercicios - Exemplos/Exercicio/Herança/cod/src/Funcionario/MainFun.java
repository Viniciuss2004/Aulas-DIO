package cod.src.Funcionario;

public class MainFun {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Funcionario();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Gerente gerente_ = new Funcionario();
        Vendedor vendedor_ = (Vendedor) new Funcionario();

    }
}
