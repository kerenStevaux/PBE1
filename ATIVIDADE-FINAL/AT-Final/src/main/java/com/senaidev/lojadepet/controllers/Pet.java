import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.lojadepet.controllers.Pet;

@RestController
@RequestMapping("/cliente")
public class Pet {

	private Pet clienteService;
	
	public Pet(Pet petService) {
		this.Pet = petService;
	}
	
	@PostMapping
	public Cliente criar(@RequestBody Cliente cliente) {
		return Pet.salvar(cliente);
	}
	
	@GetMapping
	public List<Cliente> listar(){
		return Pet.listartodos();
	}
}