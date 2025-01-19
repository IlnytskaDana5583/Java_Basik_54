package consultation_16.bookstore.main.repository;

import consultation_16.bookstore.main.model.Beautysalon;

import java.util.ArrayList;


public class BeautyRepository {

   private ArrayList<Beautysalon> beautysalons = new ArrayList<>();

   // добавление услуги
    public void addBeautysalon(Beautysalon beautysalon) {beautysalons.add(beautysalon);}

    public ArrayList<Beautysalon> getAllBeautysalons() {return beautysalons;}

    //найти услугу по названию
    public Beautysalon findName(String servicename) {
        for (Beautysalon beautysalon : beautysalons) {
            if (beautysalon.getServicename() == servicename) {
                return beautysalon;
            }
        }
        return null;
    }
}
