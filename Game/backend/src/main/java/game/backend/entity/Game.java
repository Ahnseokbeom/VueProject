package game.backend.entity;

import javax.persistence.Column;
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
