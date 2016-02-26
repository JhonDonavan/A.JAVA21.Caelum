package br.com.caelum.jdbc.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContatoDAO dao = new ContatoDAO();
		List<Contato> contatos = dao.getLista();
		
		/*String nascimento;
		
		SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
		sfd.format(contato.getDataNascimento().getTime())
		Date data;
		try{
			data = format.parse(nascimento);
		}catch(ParseException e){
				data = null;
			}*/
		
		for (Contato  contato  : contatos){
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail()); 
			System.out.println("Endereço: "+ contato.getEndereco());
			SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
			String dataformatada = sfd.format(contato.getDataNascimento().getTime());
			System.out.println("Data de nascimento: " + dataformatada + "\n");
			}  
			
			
		}
	}


