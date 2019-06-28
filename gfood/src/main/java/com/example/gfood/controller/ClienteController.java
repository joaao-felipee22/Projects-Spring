package com.example.gfood.controller;

import com.example.gfood.model.Cliente;
import com.example.gfood.model.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;


    @PostMapping("/clientes")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente save(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);

    }

    @GetMapping("/clientes")
    public List<Cliente> cliente(){
        return (List<Cliente>) clienteRepository.findAll();
    }

    @DeleteMapping("/cliente/{id}")
    public void Delete(@PathVariable Long id, @RequestBody Cliente cliente){
        clienteRepository.deleteById(id);
    }



}
