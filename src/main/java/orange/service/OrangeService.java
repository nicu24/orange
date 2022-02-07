package orange.service;

import lombok.RequiredArgsConstructor;
import orange.domain.Orange;
import orange.repo.OrangeRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class OrangeService {
    private final OrangeRepository orangeRepository;

    public Flux<Orange> getAllOranges(){
        Flux<Orange> fOranges=  orangeRepository.findAll();
      //  fOranges.subscribe(this::displayInsideFlux);
        return  fOranges;
    }

    public Mono<Orange> addOrange(Orange orange){
        return  orangeRepository.save(orange);
    }

    public void deleteById(Long id){
        orangeRepository.deleteById(id);
    }

    public void displayInsideFlux(Orange orange){
        System.out.println(orange.toString());
    }
}
