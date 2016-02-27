package br.com.caelum.jdbc.teste;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteGetContatosForName {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Digite um nome para pesquisar");
		nome = dados.next().toLowerCase();
		
		
		
		
		ContatoDAO dao = new ContatoDAO();
		
		List<Contato> contatos  = dao.GetContatosForName(nome);
		
		if(contatos.isEmpty()){
			System.out.println("Não foram encontrados contatos com nomes parecidos");
		}
		else{
		for (Contato contato : contatos){
			System.out.println("Id: " + contato.getId());
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereco: " + contato.getEndereco());
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			String dataFormatada = sdf.format(contato.getDataNascimento().getTime());
			System.out.println("Data de nascimento: " + dataFormatada + "\n");
			}
		}

	}

}
