package com.example.prueba1.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Album {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private int singer_id;
  private String title;
  private LocalDate release_date;

  public Album() {
  }

  public Album(int id, int singer_id, String title, LocalDate release_date) {
    this.id = id;
    this.singer_id = singer_id;
    this.title = title;
    this.release_date = release_date;
  }

  public Album(int singer_id, String title, LocalDate release_date) {
    this.singer_id = singer_id;
    this.title = title;
    this.release_date = release_date;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getSinger_id() {
    return singer_id;
  }

  public void setSinger_id(int singer_id) {
    this.singer_id = singer_id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public LocalDate getRelease_date() {
    return release_date;
  }

  public void setRelease_date(LocalDate release_date) {
    this.release_date = release_date;
  }
}
