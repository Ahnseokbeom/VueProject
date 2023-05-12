package movie.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import movie.backend.entity.Movie;
@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{
}
