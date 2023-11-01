package io.github.lucascode.msclientes.application;

import io.github.lucascode.msclientes.domain.Cliente;
import io.github.lucascode.msclientes.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;

    @Transactional
    public Cliente save (Cliente cliente){
        return repository.save(cliente);
    }

    //Optional pq pode ser que exista ou não o cliente
    public Optional <Cliente> getByCPF(String cpf){
        return repository.findByCpf(cpf);
    }

}
