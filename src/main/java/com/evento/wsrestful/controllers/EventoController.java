package com.evento.wsrestful.controllers;

import com.evento.wsrestful.models.Evento;
import com.evento.wsrestful.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/evento")
public class EventoController {

    @Autowired
    private EventoRepository eventoRepository;

    @GetMapping(produces = "application/json")
    public @ResponseBody Iterable<Evento> listaEventos(){
        Iterable<Evento> listaEventos = eventoRepository.findAll();
        return listaEventos;
    }

    @PostMapping()
    public Evento cadastrarEvento(@RequestBody @Validated Evento evento){
        return eventoRepository.save(evento);
    }

    @DeleteMapping()
    public Evento deletarEvento(@RequestBody Evento evento){
        eventoRepository.delete(evento);
        return evento;
    }
}
