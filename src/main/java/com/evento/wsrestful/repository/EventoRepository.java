package com.evento.wsrestful.repository;

import com.evento.wsrestful.models.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, String> {
}
