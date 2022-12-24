package compt;

import java.awt.List;
import java.util.ArrayList;

public class Compte {
	private int nb_compt;
	private String nom;
	private int num;
	private float solde;
	private float decouvert ; 
	private float decouvertmax ; 
	private float debitmax ; 
	static int cn=0;
		
	
	Compte(String nom,float solde){
		cn++;
		this.nom=nom;
		this.setDecouvertmax(800) ; 
		this.debitmax = 1000 ;
		this.num=cn;
		this.solde=solde;
	}
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public float getSolde() {
		return solde;
	}


	public void setSolde(float solde) {
		this.solde = solde;
	}


	public float getDecouvert() {
		if(solde >= 0 ){
			decouvert = 0  ; 
		}else{
		decouvert  =  solde * -1 ; }
		
		return decouvert ;
	}


	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}


	public float getDecouvertmax() {
		return decouvertmax;
	}


	public void setDecouvertmax(float decouvertmax) {
		this.decouvertmax = decouvertmax;
	}


	public float getDebitmax() {
		return debitmax;
	}


	public void setDebitmax(float debitmax) {
		this.debitmax = debitmax;
	}


	public static int getCn() {
		return cn;
	}


	public static void setCn(int cn) {
		Compte.cn = cn;
	}



	public void Crediter(float Montant){
		if(getSolde()+Montant > debitmax){
			System.out.println("vous pouvez pas Crediter le solde ");

		}else{
			this.solde += Montant ; 
			System.out.println(" le solde "+getNom()+" est Crediter par  "+Montant+"MRU  votre solde est :"+solde);
		}
	}
	

	public void Debiter(float Montant){
		
		
		if(getDecouvert()+Montant > getDecouvertmax()){
			System.out.println("vous pouvez pas debiter le solde ");
		}else{
			
		this.solde -= Montant ; 
		System.out.println(" le solde "+getNom()+" est debiter par  "+Montant+"MRU  votre solde est :"+solde);
		}
	
	}
	
	
	public void virerSolde(Compte c,float Montant){
		if(getDecouvert()+Montant > getDecouvertmax()){
			System.out.println("vous pouvez pas debiter le solde ");
		}else{
			
		if(getSolde() > Montant){
			this.solde -= Montant ; 
			c.Crediter(Montant);
			System.out.println(" Un verment de "+Montant+"MRU  votre solde est :"+solde);
			}else{
				System.out.println("votre solde  est n'est pas suffisant ");
			}
		}
		}
	

	protected static int listcomp(ArrayList<Compte> listcpt, String message){
				if(listcpt.size()>0){
					System.out.println(message);
					for(Compte c : listcpt){
						System.out.println(c.getNum()+" : nom est "+c.getNom());
					}
					return listcpt.size();
				}
				
				return 0;
			}
	
	void afficher(){
		{
			System.out.println("numer = " + this.num + " Nom = " + nom + " Solde = " + solde);
		}
		
	}

}
