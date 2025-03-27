package pessoa;

/**
 * @author AUGUSTO ALEX CAIXETA SILVA
 * @author NATAN HENRIQUE PEREIRA
 */

public class Principal {
    public static void main(String[] args) {
        System.out.println("****************** PESSOAS ******************\n");
        // Teste 1
        Pessoa pessoaMaria = new Pessoa();
        pessoaMaria.setCodigo(1);
        pessoaMaria.setNome("Maria");
        pessoaMaria.setDataCadastro("24/03/2025");

        System.out.println("Pessoa: " + pessoaMaria.getNome() + "\n"
                + "Codigo: " + pessoaMaria.getCodigo() + "\n"
                + "Data de cadastro: " + pessoaMaria.getDataCadastro() + "\n");
        
        // Teste 2
        Pessoa pessaDiego = new Pessoa();
        pessaDiego.setCodigo(2);
        pessaDiego.setNome("Diego");
        pessaDiego.setDataCadastro("22/03/2025");

        System.out.println("Pessoa: " + pessaDiego.getNome() + "\n"
                + "Codigo: " + pessaDiego.getCodigo() + "\n"
                + "Data de cadastro: " + pessaDiego.getDataCadastro() + "\n");

        System.out.println("****************** CLIENTES ******************\n");
        // Teste 1
        Cliente clienteNatan = new Cliente();
        clienteNatan.setCodigo(4);
        clienteNatan.setNome("Natan");
        clienteNatan.setDataCadastro("20/03/2025");
        clienteNatan.setEmail("natan@gmail.com");
        clienteNatan.setEndereco("Rua Italia, Nacoes, 1171 CS");

        System.out.println("Cliente: " + clienteNatan.getNome() + "\n"
                + "Codigo: " + clienteNatan.getCodigo() + "\n"
                + "Data do cadastro: " + clienteNatan.getDataCadastro() + "\n"
                + "Email: " + clienteNatan.getEmail() + "\n"
                + "Endereco: " + clienteNatan.getEndereco() + "\n");
        
        // Teste 2
        Cliente clienteJulia = new Cliente();
        clienteJulia.setCodigo(5);
        clienteJulia.setNome("Julia");
        clienteJulia.setDataCadastro("18/03/2025");
        clienteJulia.setEmail("julia@gmail.com");
        clienteJulia.setEndereco("Rua Tres, Congonhas, 30");

        System.out.println("Cliente: " + clienteJulia.getNome() + "\n"
                + "Codigo: " + clienteJulia.getCodigo() + "\n"
                + "Data do cadastro: " + clienteJulia.getDataCadastro() + "\n"
                + "Email: " + clienteJulia.getEmail() + "\n"
                + "Endereco: " + clienteJulia.getEndereco() + "\n");

        System.out.println("****************** USUARIOS ******************\n");
        // Teste 1
        Usuario usuarioBruno = new Usuario();
        usuarioBruno.setNome("Bruno");
        usuarioBruno.setCodigo(7);
        usuarioBruno.setDataCadastro("01/02/2025");
        usuarioBruno.setLogin("Bruno");
        usuarioBruno.setSenha("Bruno</>2025");

        System.out.println("Usuario: " + usuarioBruno.getNome() + "\n"
                + "Codigo: " + usuarioBruno.getCodigo() + "\n"
                + "Login: " + usuarioBruno.getLogin() + "\n"
                + "Senha: " + usuarioBruno.getSenha() + "\n");
        
        Usuario usuarioFabio = new Usuario();
        usuarioFabio.setNome("Fabio");
        usuarioFabio.setCodigo(8);
        usuarioFabio.setDataCadastro("01/02/2025");
        usuarioFabio.setLogin("FabioSilva");
        usuarioFabio.setSenha("321oib@F");

        System.out.println("Usuario: " + usuarioFabio.getNome() + "\n"
                + "Codigo: " + usuarioFabio.getCodigo() + "\n"
                + "Login: " + usuarioFabio.getLogin() + "\n"
                + "Senha: " + usuarioFabio.getSenha() + "\n");
    }
}
