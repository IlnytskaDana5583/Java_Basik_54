package consultation_16.bookstore.main.service;

import consultation_16.bookstore.main.model.Beautysalon;
import consultation_16.bookstore.main.repository.BeautyRepository;

public class BeautyService {
    private BeautyRepository beautyRepository;

    public BeautyService(BeautyRepository beautyRepository) {
        this.beautyRepository = beautyRepository;
    }

    public void addServicename(Beautysalon beautysalon) {
        beautyRepository.addBeautysalon(beautysalon);


    }
}
