package beans;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


@Named
@SessionScoped
public class UserLoginBean implements Serializable{

	private static final long serialVersionUID = 3849025983964184914L;

	private String naam ,pw;
	
	public String Login(String naam, String pw){
		return "response";
	}
	
	public String getNaam(){
		return naam;
	}

	public void setNaam(String naam){
		this.naam = naam;
	}
	
	public void setPw(String pw){
		this.pw = pw;
	}
	
	public String getPw(){
		return pw;
	}
	
	 public String getResponse() {
	     if(naam.equals("admin") && pw.equals("joris")){
	    	 return "succes!";
	     } else {
	    	 return "loser";
	     }
	 }
	
}
