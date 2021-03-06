package com.brunotarditi.api.instrumentos.services;

import com.brunotarditi.api.instrumentos.entities.Instrumento;
import com.brunotarditi.api.instrumentos.repositories.InstrumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class InstrumentoService {

    private final InstrumentoRepository instrumentoRepository;

    @Autowired
    public InstrumentoService(InstrumentoRepository instrumentoRepository) {
        this.instrumentoRepository = instrumentoRepository;
    }

    @Transactional(readOnly = true)
    public List<Instrumento> findByAll() {
        return this.instrumentoRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Instrumento> findById(Long id) {
        return this.instrumentoRepository.findById(id);
    }

    @Transactional
    public Instrumento save(Instrumento instrumento) {
        return this.instrumentoRepository.save(instrumento);
    }

    @Transactional(readOnly = true)
    public List<Instrumento> findByInstrumentoOrMarcaOrModelo(String filtro) {
        return this.instrumentoRepository.findByInstrumentoContainingOrMarcaContainingOrModeloContaining(filtro, filtro, filtro);
    }

    @Transactional
    public void delete(Long id) {
        this.instrumentoRepository.deleteById(id);
    }

}
