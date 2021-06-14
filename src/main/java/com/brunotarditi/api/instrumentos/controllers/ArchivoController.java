package com.brunotarditi.api.instrumentos.controllers;

import com.brunotarditi.api.instrumentos.entities.Archivo;
import com.brunotarditi.api.instrumentos.services.ArchivoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/upload")
@Slf4j
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8081", "http://localhost:3000"})
public class ArchivoController {

    private final ArchivoService archivoService;

    @Autowired
    public ArchivoController(ArchivoService archivoService) {
        this.archivoService = archivoService;
    }

    @PostMapping()
    public ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            archivoService.save(file);
            return new ResponseEntity<>("El archivo " + file.getOriginalFilename() + " ha sido subido con éxito", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("No se pudo subir el archivo", HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/files")
    public ResponseEntity<List<Archivo>> getListFiles() {
        List<Archivo> archivos = archivoService.loadAll().map(path -> {
            String filename = path.getFileName().toString();
            String url = MvcUriComponentsBuilder
                    .fromMethodName(ArchivoController.class, "getFile", path.getFileName().toString()).build().toString();

            return new Archivo(filename, url);
        }).collect(Collectors.toList());

        return ResponseEntity.status(HttpStatus.OK).body(archivos);
    }
    @GetMapping("/files/{filename:.+}")
    @ResponseBody
    public ResponseEntity<Resource> getFile(@PathVariable String filename) {
        Resource file = archivoService.load(filename);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"").body(file);
    }
}
