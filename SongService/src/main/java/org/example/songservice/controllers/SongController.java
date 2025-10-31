package org.example.songservice.controllers;

import java.util.List;
import java.util.UUID;

import org.example.songservice.dtos.ShowSongDTO;
import org.example.songservice.services.songs.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/music")
public class SongController {

    private final SongService songService;

    @Autowired
    public SongController(SongService songService) {
        this.songService = songService;
    }

    @GetMapping("/songs")
    public ResponseEntity<List<ShowSongDTO>> getSongs(){
        return ResponseEntity.ok(songService.getAllSongs());
    }

    @GetMapping("/songbyid/{uuid}")
    public ResponseEntity<ShowSongDTO> getSongByUuid(@PathVariable UUID uuid){
        return ResponseEntity.ok(songService.getSongByUUID(uuid));
    }
}
