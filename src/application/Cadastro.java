package application;

import java.text.ParseException;
import java.util.Scanner;

import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

import model.entities.Cadastrar;
import model.exceptions.DomainException;

public class Cadastro {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		do {
			try {
				
				System.out.print("Nome: ");
				String nomeCompleto = sc.nextLine();
				System.out.print("DDD: ");
				String ddd = sc.nextLine();
				System.out.print("Telefone: ");
				String telefone = sc.nextLine();
				
				Cadastrar c1 = new Cadastrar(nomeCompleto, ddd, telefone);
				
				MaskFormatter formatDDD = new MaskFormatter("(##)");
				JFormattedTextField txtDDD = new JFormattedTextField(formatDDD);
				MaskFormatter formatPhone = new MaskFormatter("####-####");
				JFormattedTextField txtPhone = new JFormattedTextField(formatPhone);
				txtPhone.setText(telefone);
				txtDDD.setText(ddd);
				
				System.out.println(Cadastrar.Cadastro(nomeCompleto, ddd, telefone));
				System.out.println(c1.getNomeCompleto());
				System.out.println(txtDDD.getText()+txtPhone.getText());
				n++;
		
			}
			catch(ParseException e) {
			e.printStackTrace();
			}catch(DomainException e) { 
				System.out.println("Error: " + e.getMessage());
			}
		}while(n!=1);
		
		sc.close();
		
	}
}
