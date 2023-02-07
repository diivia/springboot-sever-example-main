package com.kn.kulygin.springbootserverexample.web;

import com.kn.kulygin.springbootserverexample.service.DocumentsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentsController {

    private final DocumentsService service;

    public DocumentsController(DocumentsService service) {
        this.service = service;
    }

//    @PostMapping("/api/document/search")
//    public ResponseEntity<?> find() {
//        return new ResponseEntity<>(service.find(), HttpStatus.OK);
//    }

    @GetMapping("/api/documents")
    public ResponseEntity<?> findAllCodes() {
        return new ResponseEntity<>(service.findAllCodes(), HttpStatus.OK);
    }

}
