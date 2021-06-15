package com.brunotarditi.api.instrumentos.controllers;

import com.brunotarditi.api.instrumentos.entities.Instrumento;
import com.brunotarditi.api.instrumentos.myexceptions.InstrumentoException;
import com.brunotarditi.api.instrumentos.services.InstrumentoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/instrumento")
@Slf4j
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8081", "http://localhost:3000"})
public class InstrumentoController {

    private final InstrumentoService instrumentoService;

    @Autowired
    public InstrumentoController(InstrumentoService instrumentoService) {
        this.instrumentoService = instrumentoService;
    }

    @GetMapping()
    public List<Instrumento> getAllInstrumentos() {
        return this.instrumentoService.findByAll();
    }

    @GetMapping(path = "/{id}")
    public Instrumento getOneInstrumento(@PathVariable("id") Long id) {
        return this.instrumentoService.findById(id).orElseThrow(() -> new InstrumentoException("No se encontró el id: " + id));
    }

    @GetMapping(path = "/filtro")
    public List<Instrumento> getIntrumentoOrMarcaOrModelo(@RequestParam("termino") String filtro) {
        return this.instrumentoService.findByInstrumentoOrMarcaOrModelo(filtro);
    }

    @PostMapping()
    public Instrumento saveInstrumento(@RequestBody Instrumento instrumento) {
        return this.instrumentoService.save(instrumento);
    }

    @PutMapping(path = "/{id}")
    public Instrumento updateInstrumento(@PathVariable("id") Long id, @RequestBody Instrumento instrumento) {
        return this.instrumentoService.findById(id)
                .map(i -> {
                    i.setInstrumento(instrumento.getInstrumento());
                    i.setMarca(instrumento.getMarca());
                    i.setModelo(instrumento.getModelo());
                    i.setImagen(instrumento.getImagen());
                    i.setPrecio(instrumento.getPrecio());
                    i.setCostoEnvio(instrumento.getCostoEnvio());
                    i.setCantidadVendida(instrumento.getCantidadVendida());
                    i.setDescripcion(instrumento.getDescripcion());
                    return this.instrumentoService.save(i);
                })
                .orElseGet(() -> {
                    instrumento.setId(id);
                    return this.instrumentoService.save(instrumento);
                });
    }
    @DeleteMapping(path = "/{id}")
    public void deleteInstrumento(@PathVariable("id") Long id) {
        this.instrumentoService.delete(id);
    }
}
