package game.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import game.backend.entity.Login;

public interface LoginRepository extends JpaRepository<Login, String>{

}
