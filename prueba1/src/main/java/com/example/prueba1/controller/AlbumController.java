package com.example.prueba1.controller;

import com.example.prueba1.model.Album;
import com.example.prueba1.model.Singer;
import com.example.prueba1.service.AlbumService;
import com.example.prueba1.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/album")
public class AlbumController {
  @Autowired
  private AlbumService albumService;

  @PostMapping("/add")
  public String add(@RequestBody Album album) {
    albumService.saveAlbum(album);
    return "New album added";
  }

  @GetMapping("/getAll")
  public List<Album> getAllAlbums() {
    return albumService.getAllAlbums();
  }
}

