package com.kn.kulygin.springbootserverexample.web;

import javassist.NotFoundException;
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

import java.util.Optional;

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
        if (service.findById(id) != null && service.findById(id).isImported()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/api/textkey")
    public ResponseEntity<?> save(@RequestBody TextKeyDto textKeyDto) {
        TextKeySearchDto searchDto = new TextKeySearchDto();
        searchDto.setCode(textKeyDto.getCode());
        searchDto.setCompany(textKeyDto.getCompanyCode());
        if (!service.findUnique(searchDto).getTextKeys().isEmpty()
                && service.findUnique(searchDto).getTextKeys().get(0).getId() != null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(service.save(textKeyDto), HttpStatus.OK);
    }
}
