package br.com.damageinc.titanic_api.service;

import org.springframework.stereotype.Service;
import br.com.damageinc.titanic_api.repository.PassengerRepository;

@Service
public class PassengerService {

    private final PassengerRepository repository;

    public PassengerService(PassengerRepository repository) {
        this.repository = repository;
    }
}