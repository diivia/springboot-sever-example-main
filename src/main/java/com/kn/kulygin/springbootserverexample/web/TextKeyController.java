package com.kn.kulygin.springbootserverexample.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kn.kulygin.springbootserverexample.dto.TextKeyDto;
import com.kn.kulygin.springbootserverexample.dto.search.TextKeySearchDto;
import com.kn.kulygin.springbootserverexample.service.TextKeyService;

@RestController
public class TextKeyController {

    private final TextKeyService service;

    public TextKeyController(TextKeyService service) {
        this.service = service;
    }

    @PostMapping("/api/textkey/search")
    public ResponseEntity<?> find(@RequestBody TextKeySearchDto searchDto) {
        return new ResponseEntity<>(service.find(searchDto), HttpStatus.OK);
    }

    @DeleteMapping("api/textkey/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/api/textkey")
    public ResponseEntity<?> save(@RequestBody TextKeyDto textKeyDto) {
        return new ResponseEntity<>(service.save(textKeyDto), HttpStatus.OK);
    }
}
