package sn.esmt.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Planete {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nom;
	private Double rayon;
	public Planete() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Planete(Long id, String nom, Double rayon) {
		super();
		this.id = id;
		this.nom = nom;
		this.rayon = rayon;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Double getRayon() {
		return rayon;
	}
	public void setRayon(Double rayon) {
		this.rayon = rayon;
	}  
	
	
}
