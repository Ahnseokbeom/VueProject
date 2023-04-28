package movie.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import movie.backend.entity.Detail;
@Repository
public interface DetailRepository extends JpaRepository<Detail, Integer>{

}
