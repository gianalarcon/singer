package com.example.prueba1.controller;

import com.example.prueba1.model.Singer;
import com.example.prueba1.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/singer")
@CrossOrigin
public class SingerController {
  @Autowired
  private SingerService singerService;

  @PostMapping("/add")
  public String add(@RequestBody Singer student){
    singerService.saveSinger(student);
    return "New singer added";
  }

  @GetMapping("/getAll")
  public List<Singer> getAllStudents(){
    return singerService.getAllSingers();
  }

  @DeleteMapping(path="{singerId}")
  public void deleteSinger(@PathVariable("singerId") Integer id){
    singerService.deleteStudent(id);
  }

  @PutMapping(path = "{singerId}")
  public void updateSinger(
      @PathVariable("singerId") Integer singerId,
      @RequestParam(required = false) String first_name,
      @RequestParam(required = false) String last_name,
      @RequestParam(required = false) LocalDate birth_date
      ){
    singerService.updateSinger(singerId,first_name,last_name, birth_date);
  }
}
