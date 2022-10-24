package com.example.prueba1.service;

import com.example.prueba1.model.Album;
import com.example.prueba1.model.Singer;

import java.util.List;

public interface AlbumService {
  public Album saveAlbum(Album album);
  public List<Album> getAllAlbums();
}
