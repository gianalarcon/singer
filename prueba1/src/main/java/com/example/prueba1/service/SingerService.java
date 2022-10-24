package com.example.prueba1.service;

import com.example.prueba1.model.Singer;

import java.time.LocalDate;
import java.util.List;

public interface SingerService {
  public Singer saveSinger(Singer singer);
  public List<Singer> getAllSingers();

  public void deleteStudent(Integer id);

  public void updateSinger(Integer singerId, String first_name, String last_name, LocalDate birth_date);
}
