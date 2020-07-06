package novi.spring.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping(value = "/api/player")
    public Player getPlayer() {
        Optional<Player> _player1 = playerRepository.findById(1);
        if(_player1.isPresent()) {
            return _player1.get();
        } else {
            return null;
        }
    }

    @GetMapping(value = "/api/player/{id}")
    public Player getPlayerById(@PathVariable int id) {
        Optional<Player> _player = playerRepository.findById(id);
        if(_player.isPresent()) {
            return _player.get();
        } else {
            return null;
        }
    }
}
