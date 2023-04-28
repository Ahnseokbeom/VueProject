package movie.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import movie.backend.entity.Detail;
import movie.backend.repository.DetailRepository;

@RestController
public class DetailController {
	@Autowired
	DetailRepository detailRepository;
	
	@GetMapping("api/detail")
	public List<Detail> getDetail(){
		List<Detail> detail = detailRepository.findAll();
		return detail;
	}
}
