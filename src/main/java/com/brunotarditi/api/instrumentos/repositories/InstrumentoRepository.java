package com.brunotarditi.api.instrumentos.repositories;

import com.brunotarditi.api.instrumentos.entities.Instrumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstrumentoRepository extends JpaRepository<Instrumento, Long> {

    List<Instrumento> findByInstrumentoContainingOrMarcaContainingOrModeloContaining(String instrumento, String marca, String modelo);
}
