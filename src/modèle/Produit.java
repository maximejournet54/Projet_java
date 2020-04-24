package modèle;

import java.io.Serializable;
import java.util.UUID;

public interface Produit extends Serializable{

	UUID getId();
	String getTitre();
	double getPrix();
	
	

}
