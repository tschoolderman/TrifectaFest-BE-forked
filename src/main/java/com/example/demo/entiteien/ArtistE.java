package com.example.demo.entiteien;

import javax.persistence.Entity;

@Entity
public class ArtistE extends Person {

	private ArtistType Type;
	private String Description;
	private String BgStory;
	private String Genre;
	private String RekeningNummer;
	
	public ArtistType getType() {
		return Type;
	}

	public void setType(ArtistType type) {
		Type = type;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getBgStory() {
		return BgStory;
	}

	public void setBgStory(String bgStory) {
		BgStory = bgStory;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public String getRekeningNummer() {
		return RekeningNummer;
	}

	public void setRekeningNummer(String rekeningNummer) {
		RekeningNummer = rekeningNummer;
	}

	@Override
	public PersonRole getRole() {
		// TODO Auto-generated method stub
		return PersonRole.Artist;
	}

}
