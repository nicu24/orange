package orange.controller;

import lombok.RequiredArgsConstructor;
import orange.domain.Orange;
import orange.service.OrangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/orange")
@RequiredArgsConstructor
public class OrangeController {
   private final OrangeService orangeService;

    @GetMapping(value = "/getAll")
    public Flux<Orange> getAllOranges(){
        return orangeService.getAllOranges();
    }

    @PostMapping(value="/add")
    public Mono<Orange> saveOrange(@RequestBody Orange orange){
        return orangeService.addOrange(orange);
    }

    @DeleteMapping(value="/delete/{id}")
    public void deleteOrange(@PathVariable(name = "id") Long id){
        orangeService.deleteById(id);
    }
}
