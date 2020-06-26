package br.ufc.quixada.exec;

import java.util.Scanner;

import br.ufc.quixada.poo.Banco;
import br.ufc.quixada.poo.ContaBancaria;
import br.ufc.quixada.poo.ContaCorrente;
import br.ufc.quixada.poo.ContaPoupanca;

public class Principal {
	
	
	static Scanner ler = new Scanner(System.in);
	public static void main(String[] args) {
		
		Banco Banco = new Banco();

		
		int numero;
		
		do {
		
		System.out.println("1- Criar Conta: ");
		System.out.println("2-Selecionar Conta: ");
		System.out.println("3-Remover conta: ");
		System.out.println("4-Gerar Relatorio: ");
		System.out.println("5-Finalizar: ");
		
		System.out.println("\n");
		System.out.println("Digite a op��o desejada:");
		
		
		numero = ler.nextInt();
		
		if(numero == 1) {
			
			
			
			
			
			
			
			int a;
			
			do {
				System.out.println("\n");
				System.out.println("1- Conta Corrente:");
				System.out.println("2- Conta Poupan�a:");
				System.out.println("3- Sair.");
				
			a = ler.nextInt();
			System.out.println("\n");
			
			//Cadastra uma conta poupan�a
			if(a == 1) {
				
				
				System.out.println("Digite o n�mero da conta:");
				
				int n = ler.nextInt();
				System.out.println("\n");
				
				System.out.println("Digite o saldo da conta: ");
				double s;
				s = ler.nextDouble();
				
				
			
				ContaBancaria c = new ContaCorrente(n,s,15.0);
				
				
				Banco.inserir(c);
				
				
			}
			
			//Cadastra uma conta corrente
			else if (a == 2) {
				System.out.println("Digite o n�mero da conta:");
				
				System.out.println("\n");
				
				int e = ler.nextInt();
				
				System.out.println("Digite o saldo da conta: ");
				double s = ler.nextDouble();
				
				
				ContaBancaria p = new ContaPoupanca(e,s,1000);
				
				Banco.inserir(p);
				
			}
			
			}while(a != 3);
			
		}
		
		if(numero == 2) {
			System.out.println("Digite o numero da conta: ");
			int q = ler.nextInt();
			
			if(Banco.procurarConta(q) != null) {
			
			int e;
			
			do {
			System.out.println("Escolha uma op��o:");
			
			System.out.println("\n");
			
			System.out.println("1-Depositar: ");
			System.out.println("2-Sacar: ");
			System.out.println("3-Transferir: ");
			System.out.println("4-Gerar relat�rio: ");
			System.out.println("5- Retornar ao menu anterior: ");
			
			e = ler.nextInt();
			//Depositar
			if(e == 1) {
				System.out.println("Digite o valor do deposito: ");
				double r;
				r = ler.nextDouble();
				
				Banco.procurarConta(q).depositar(r);
			}
			
			//Sacar
			else if(e == 2) {
			
				
				System.out.println("Digite o valor do Saque: ");
				int c = ler.nextInt();
				
				System.out.println(Banco.procurarConta(q).sacar(c));
			}
			
			//Transferir
			else if(e == 3) {
				
				System.out.println("Digite o n�mero da conta para onde vai transferir:");
				int s = ler.nextInt();
				if(Banco.procurarConta(s) != null) {
					System.out.println("Digite o valor da tranfer�ncia:");
					double o = ler.nextDouble();
					Banco.procurarConta(q).transferir(o,Banco.procurarConta(s));	
				}
				else {
					System.out.println("Conta inesistente!");
				}	
				}
				
				
			
			
			if(e == 4) {
				Banco.mostrarDados();
			}
			}while(e!=5);
			
			}
			
			else {
				System.out.println("Conta n�a existe.");
			}
		}
		
		else if(numero == 3) {
			System.out.println("Digite o n�mero da conta que deseja excluir: ");
			int b = ler.nextInt();
			
			if(Banco.procurarConta(b) != null) {
				Banco.remover(Banco.procurarConta(b));
			}
			else {
				System.out.println("Essa conta n�o existe!");
			}
		}
		
		else if(numero == 4) {
			Banco.mostrarDados();
			System.out.println("\n");
		}
		
		
		
		System.out.println("\n");
		
		
	
	
	}while(numero != 5);
		
		System.out.println("Opera��o finalizada!");
		
		
	}
}


