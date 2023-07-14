package game.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name="Game")
@Getter
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ranking;
	
	@Column(length=45, nullable=false)
	private String name;
	
	@Column(length=45, nullable=false)
	private String type;
	
	@Column(length=200, nullable=false)
	private String image;
	
	@Column
	private int heart;
	
	@Column(length=200, nullable=false)
	private String url;
	
	@Column(length=45, nullable=false)
	private String en;
}

