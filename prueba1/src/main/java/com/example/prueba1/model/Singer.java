package com.example.prueba1.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table
public class Singer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String first_name;
  private String last_name;
  private LocalDate birth_date;

  public Singer() {
  }

  public Singer(int id, String first_name, String last_name, LocalDate birth_date) {
    this.id = id;
    this.first_name = first_name;
    this.last_name = last_name;
    this.birth_date = birth_date;
  }

  public Singer(String first_name, String last_name, LocalDate birth_date) {
    this.first_name = first_name;
    this.last_name = last_name;
    this.birth_date = birth_date;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirst_name() {
    return first_name;
  }

  public void setFirst_name(String first_name) {
    this.first_name = first_name;
  }

  public String getLast_name() {
    return last_name;
  }

  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }

  public LocalDate getBirth_date() {
    return birth_date;
  }

  public void setBirth_date(LocalDate birth_date) {
    this.birth_date = birth_date;
  }
}