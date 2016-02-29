package br.com.caelum.jdbc.teste;

import java.util.Scanner;

import br.com.caelum.jdbc.dao.FuncionarioDAO;
import br.com.caelum.jdbc.modelo.Funcionario;

public class InsertFuncionario {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		Funcionario f = new Funcionario();
		
		System.out.println("Digite o nome do funcionario: ");
		String nome = dados.nextLine().toLowerCase();
		
		System.out.println("Digite o usuario: ");
		String usuario = dados.next().toLowerCase();
		
		System.out.println("Digite uma senha: ");
		String senha = dados.next().toLowerCase();
		
		f.setNome(nome);
		f.setUsuario(usuario);
		f.setSenha(senha);
		//teste
		
		FuncionarioDAO dao = new FuncionarioDAO();
		
		dao.adicionaFuncionario(f);
		
		System.out.println("Cadastro efetuado com sucesso!");

	}

}
