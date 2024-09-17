public class Main{

    public static void main(String[] args){
        gerente gerente = new gerente();
        funcionario funcionario = new funcionario();
        diretor diretor = new diretor();
        
        
        funcionario.nome = "Henrique";
        funcionario.calcularSalario();

        
        gerente.nome = "Marcos";
        gerente.salarioBase();
        gerente.Bonus = "20%";
        gerente.calcularSalario();

    
        diretor.nome = "Vinicius";
        diretor.salarioBase();
        diretor.Bonus = "15%";
        diretor.auxilioMoradia();
        diretor.calcularSalario();

        System.out.println("Funcionario: " + funcionario.nome + " e salário base de " + funcionario.calcularSalario());
        System.out.println("Genrente: " + gerente.nome + ", salário base de " + gerente.salarioBase() + ", bônus de " + gerente.Bonus + " e um salário com bonus de " + gerente.calcularSalario());
        System.out.println("Diretor: " + diretor.nome + ", salário base de " + diretor.salarioBase() + ", bônus de " + diretor.Bonus + ", auxílio-moradia de " + diretor.auxilioMoradia +  " e um salário com bonus de " + diretor.calcularSalario());
    }



--------------------------------------------------------------------------------------------------------

public class gerente {
    String nome, Bonus;
    double salarioBase = 5000;
    double bonus = 0.2;
    double salarioComBonus = salarioBase * bonus + salarioBase;

    public double salarioBase(){
        return salarioBase;
    }
    
    public double calcularSalario(){
        return salarioComBonus;
    }
}

--------------------------------------------------------------------------------------------------------

public class funcionario {
    String nome;
    double salarioBase = 3000;

    public double calcularSalario(){
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }
}


--------------------------------------------------------------------------------------------------------


public class diretor {
    String nome, Bonus;
    double salarioBase = 10000;
    double bonus = 0.15;
    double salarioComBonus = salarioBase * bonus + salarioBase;
    double auxilioMoradia = 2000;

    public double salarioBase(){
        return salarioBase;
    }

    public double calcularSalario(){
        return salarioComBonus;
    }

    public double auxilioMoradia(){
        return auxilioMoradia;
    }
}



