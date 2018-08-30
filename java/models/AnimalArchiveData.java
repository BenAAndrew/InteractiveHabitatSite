package model;

public class AnimalArchiveData extends SmartSerializable
{
	private static final long serialVersionUID = 1L;

	public String uniqueid;
	public String image;
	public String animalName;
	public String animalKingdom;
	public String animalDescription;
	public String getUniqueid() {
		return uniqueid;
	}
	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	public String getAnimalKingdom() {
		return animalKingdom;
	}
	public void setAnimalKingdom(String animalKingdom) {
		this.animalKingdom = animalKingdom;
	}
	public String getAnimalDescription() {
		return animalDescription;
	}
	public void setAnimalDescription(String animalDescription) {
		this.animalDescription = animalDescription;
	}
	
}