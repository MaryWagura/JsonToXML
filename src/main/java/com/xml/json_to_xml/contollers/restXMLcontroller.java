package com.xml.json_to_xml.contollers;

// Importing required classes
import com.xml.json_to_xml.db.entitymodel;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/xml-out",
        produces = "application/xml")

public class restXMLcontroller {
    @GetMapping("/get")
    public ResponseEntity<entitymodel> get()
    {
        entitymodel model = new entitymodel();
      model.setId("1");
      model.setName("Poxxie");

        HttpHeaders headers = new HttpHeaders();
        ResponseEntity<entitymodel> entityModel= new ResponseEntity<> (model,headers, HttpStatus.CREATED);
        return entityModel;
    }

    //annotation
    @GetMapping("/get/{id}")
    // Class
    public ResponseEntity<entitymodel>
    getById(@PathVariable("id") String id)
    {

        entitymodel model = new entitymodel();
        model.setId(id);
        model.setName("Poxxie");


       HttpHeaders headers =new HttpHeaders();
       ResponseEntity<entitymodel> entityModel = new ResponseEntity<>(model, headers, HttpStatus.CREATED);
       return entityModel;

    }




}
