package game.backend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;

@Entity
@Table(name="Game")
@Getter
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ranking;
	
	private String name;
	private String type;
	private String image;
	private int heart;
	private String url;
	private String en;
}
