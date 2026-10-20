package br.com.damageinc.titanic_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.damageinc.titanic_api.model.Passenger;    
        
public interface PassengerRepository
        extends JpaRepository<Passenger, Long> {

}