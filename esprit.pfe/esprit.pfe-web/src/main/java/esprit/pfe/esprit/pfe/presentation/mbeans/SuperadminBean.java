package esprit.pfe.esprit.pfe.presentation.mbeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.commons.lang3.RandomStringUtils;

import esprit.pfe.esprit.pfe.persistence.Employe;
import esprit.pfe.esprit.pfe.services.SuperAdmin;

@ManagedBean
@SessionScoped
public class SuperadminBean {
	 
		
	   
	    private String nomEmploye;
	    
	  
		 
	    private String prenomEmploye;
	    
	   
	    private String ecoleEmploye;
	    
	    
	    private String emailEmploye;
	    
	    
	  
		   
	    private String userNameEmploye;
	    
	    @EJB
	    SuperAdmin sa;
	    
	    public void addadmin(){
	    	String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijkl"
					+ "mnopqrstuvwxyz0123456789!@#$%&*()-_=+;:\'\",<.>/?";
			String pwd = RandomStringUtils.random( 15, characters );
	    	sa.ajouteradminecole(new Employe(nomEmploye,prenomEmploye,ecoleEmploye,emailEmploye,pwd,userNameEmploye,"Admin"));
	    }

		public String getNomEmploye() {
			return nomEmploye;
		}

		public void setNomEmploye(String nomEmploye) {
			this.nomEmploye = nomEmploye;
		}

		public String getPrenomEmploye() {
			return prenomEmploye;
		}

		public void setPrenomEmploye(String prenomEmploye) {
			this.prenomEmploye = prenomEmploye;
		}

		public String getEcoleEmploye() {
			return ecoleEmploye;
		}

		public void setEcoleEmploye(String ecoleEmploye) {
			this.ecoleEmploye = ecoleEmploye;
		}

		public String getEmailEmploye() {
			return emailEmploye;
		}

		public void setEmailEmploye(String emailEmploye) {
			this.emailEmploye = emailEmploye;
		}

		public String getUserNameEmploye() {
			return userNameEmploye;
		}

		public void setUserNameEmploye(String userNameEmploye) {
			this.userNameEmploye = userNameEmploye;
		}

		public SuperAdmin getSa() {
			return sa;
		}

		public void setSa(SuperAdmin sa) {
			this.sa = sa;
		}
	    
	    
	    
}
