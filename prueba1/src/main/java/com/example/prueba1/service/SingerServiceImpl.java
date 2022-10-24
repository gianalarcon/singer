package com.example.prueba1.service;

import com.example.prueba1.model.Singer;
import com.example.prueba1.repository.SingerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class SingerServiceImpl implements SingerService{
  @Autowired
  private SingerRepository singerRepository;

  @Override
  public Singer saveSinger(Singer singer) {
    return singerRepository.save(singer);
  }

  @Override
  public List<Singer> getAllSingers() {
    return singerRepository.findAll();
  }

  @Override
  public void deleteStudent(Integer singerId) {
    boolean exists = singerRepository.existsById(singerId);
    if (!exists) {
      throw new IllegalStateException(
          "Singer with id " + singerId + " does not exists"
      );
    }
    singerRepository.deleteById(singerId);
  }

  @Override
  public void updateSinger(Integer singerId, String first_name, String last_name, LocalDate birth_date) {
    Singer singer = singerRepository.findById(singerId).orElseThrow(() -> new IllegalStateException(
        "singer with id" + singerId + "does not exist"
    ));;
    singer.setFirst_name(first_name);
    singer.setLast_name(last_name);
    singer.setBirth_date(birth_date);
  }
}
