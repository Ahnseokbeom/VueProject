package game.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name="Board")
@Getter
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idx;
	
	@Column(length=45, nullable=false)
	private String title;
	
	@Column(length=45, nullable=false)
	private String genre;
	
	@Column(length=200, nullable=false)
	private String contents;
	
	@Column(length=45, nullable=false)
	private String author;
	
	Date now;
}
