package Aula36;

public class Teste {

	public static void main(String[] args) {


		Contato contato= new Contato();
		contato.setNome("Tyrion");
		//contato.setEndereco("kings Landing");
		//contato.setTelefone("11 9999-9999");
		
		// Criar objeto endereco
		
		Endereco end= new Endereco();
		end.setnomeRua("Rua Game Of Thrones");
		end.setNumero(125);
		end.setComplemnento("_");
		end.setCidade("kings Landing");
		end.setEstado("Westeros");
		end.setCep("58845-555");
		
		contato.setEndereco(end);
		
		// Relacionamento tem um telefone		
		Telefone telefone= new Telefone();
		telefone.setTipo("celular");
		telefone.setDDD("83");
		telefone.setNumero("99999-999");
		
		Telefone telefone2= new Telefone();
		telefone2.setTipo("residencial");
		telefone2.setDDD("83");
		telefone2.setNumero("2547-2569");
		
		Telefone[] telefones= new Telefone[2];
		telefones[0]=telefone;
		telefones[1]=telefone2;
		
		contato.setTelefones(telefones);
		
		//contato.setTelefone(telefone);
		//Teste saída no console
		System.out.println(contato.getNome());
		if (contato != null && contato.getEndereco()!= null) 
		{
			System.out.println(contato.getEndereco().getCidade());
		}
		
		/*if (contato !=null && contato.getTelefone()!=null) 
		{
			System.out.println("(" +contato.getTelefone().getDDD()+ ") " + contato.getTelefone().getNumero());
		}*/
		
		if (contato !=null && contato.getTelefones()!=null) 
		{
			for(Telefone t:contato.getTelefones()) 
			{
				System.out.println("(" +t.getDDD()+") "+ t.getNumero());
			}
		}
		
		

	}

}
