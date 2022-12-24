package compt;

import java.util.ArrayList;
import java.util.Scanner;
import compt.Compte;

public class Main {
	


	public static void main(String[] args) {
		
		ArrayList<Compte> listcpt = new ArrayList<Compte>();
		listcpt.add(new Compte("cheikh", 1000));
		listcpt.add(new Compte("ahmed", 2000));

		
		Scanner sc = new Scanner(System.in);
		int choix=0;
		do{
		System.out.println("**************************** Menu**************************");
		System.out.println(" 1 Crée un Compte");
		System.out.println(" 2 Débiter un Compte");
		System.out.println(" 3 Créditer un Compte");
		System.out.println(" 4 Virement entre Comptes");
		System.out.println(" 5 Afficher Compte");
		System.out.println(" 6 Afficher solde Compte");
		
	
		System.out.println("\n Entrer votre choix ! \n");
		choix = sc.nextInt();
		
		if(choix==1){
		
			System.out.println("1 : Crée Compte \n entrer votre nom");
			String nom = sc.next();
			System.out.println(" \n entrer votre solde");
			int Montant = sc.nextInt();
			listcpt.add(new Compte(nom, Montant));
			System.out.println(listcpt.get(choix+1).getNom()+"est crée avec succée votre solde est "+listcpt.get(choix+1).getSolde());
			
		}else if(choix==2){
			
			Compte.listcomp(listcpt, "La liste des comptes que pouvez vous crediter");
			System.out.println("Entrer votre choix");
			 choix = sc.nextInt();
			 System.out.println("Entrer le montant");
			 int Montant = sc.nextInt();
			 listcpt.get(choix).Crediter(Montant);
			
		}else if(choix==3){
			Compte.listcomp(listcpt, "La liste des comptes que pouvez vous debiter");
			System.out.println("Entrer votre choix");
			 choix = sc.nextInt();
			 System.out.println("Entrer le montant");
			 int Montant = sc.nextInt();
			 listcpt.get(choix).Debiter(Montant);
			
		}else if(choix==4){
			Compte.listcomp(listcpt, "La liste des comptes que pouvez vous virer");
			System.out.println("saiasie le compte emetteur");
			 int choix1 = sc.nextInt();
			 System.out.println("saiasie le compte bénéficier");
			 int choix2 = sc.nextInt();
			 System.out.println("Entrer le montant");
			 int Montant = sc.nextInt();
			 listcpt.get(choix1-1).virerSolde(listcpt.get(choix2-1), Montant);
		}else if(choix==5){
			Compte.listcomp(listcpt, "La liste des comptes pouvez vous afficher ");
			System.out.println("saiasie Numéro du compte");
			 int choix1 = sc.nextInt();
			 listcpt.get(choix1-1).afficher();
			
		}else if(choix==6){
			Compte.listcomp(listcpt, "La liste des comptes pouvez vous afficher leur solde ");
			System.out.println("saiasie Numéro du compte");
			 int choix1 = sc.nextInt();
			 System.out.println("le solde de " +listcpt.get(choix1-1).getNom()+ " est :"+listcpt.get(choix1-1).getSolde());
			
		}
		
	}while(choix != 0);
		

	
	}

}
