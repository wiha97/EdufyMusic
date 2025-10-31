package org.example.songservice.services.mappers;

import java.util.ArrayList;
import java.util.List;

import org.example.songservice.dtos.ShowSongDTO;
import org.example.songservice.entities.Song;
import org.springframework.stereotype.Service;

@Service
public class DTOMapperServiceImpl implements DTOMapperService {

	@Override
	public ShowSongDTO songToDTO(Song song) {
        ShowSongDTO dto = new ShowSongDTO();

        dto.setUuid(song.getUuid());
        dto.setTitle(song.getTitle());
        dto.setStreamUrl(song.getUrl());

        return dto;
	}

	@Override
	public List<ShowSongDTO> songsToDTOList(List<Song> songs) {
        List<ShowSongDTO> dtos = new ArrayList<>();
        for(Song song : songs){
            dtos.add(songToDTO(song));
        }
        return dtos;
	}
}
