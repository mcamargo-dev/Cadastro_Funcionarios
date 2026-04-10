import java.util.ArrayList;
import java.util.List;

public class CadFuncionario {

   Funcionario[] funcionarios = new Funcionario[5];

   void criarFuncionario() {
       for (int i = 0; i < funcionarios.length; i++) {
           funcionarios[i] = new Funcionario();

           String nome = InputHelper.lerTexto("Digite o nome do funcionario: ");
           funcionarios[i].setNome(nome);
           String cargo = InputHelper.lerTexto("Digite o cargo do funcionario: ");
           funcionarios[i].setCargo(cargo);
           double salario = InputHelper.lerDouble("Digite o salario do funcionario: ");
           funcionarios[i].setSalario(salario);
       }
   }
       void mostrarFuncionario(){
           for (int i = 0; i < funcionarios.length; i++) {
               System.out.println("-----");
               System.out.println("NOME: " + funcionarios[i].getNome());
               System.out.println("CARGO: " + funcionarios[i].getCargo());
               System.out.println("SALARIO: R$" + funcionarios[i].getSalario());
               System.out.println("-----");
           }
       }
   }
