package br.com.caelum.jdbc.teste;

import java.util.Scanner;

import br.com.caelum.jdbc.dao.FuncionarioDAO;

public class RemoveFuncionario {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Digite o ID do funcionario a ser removido: ");
		long remover = dados.nextLong();
		
		
		FuncionarioDAO dao = new FuncionarioDAO();
		
		
		dao.removeFuncionario(remover);
		
		System.out.println("Funcionario removido com sucesso!");

	}

}
