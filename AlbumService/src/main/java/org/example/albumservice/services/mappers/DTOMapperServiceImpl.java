package org.example.albumservice.services.mappers;

import java.util.ArrayList;
import java.util.List;

import org.example.albumservice.dtos.ShowAlbumDTO;
import org.example.albumservice.entites.Album;
import org.springframework.stereotype.Service;

/**
 * DTOMapperServiceImpl
 */
@Service
public class DTOMapperServiceImpl implements DTOMapperService {

	@Override
	public ShowAlbumDTO toShowAlbumDTO(Album album) {
        ShowAlbumDTO dto = new ShowAlbumDTO();

        dto.setTitle(album.getTitle());
        dto.setUuid(album.getUuid());
        dto.setRelease(""+album.getRelease());
        dto.setSongs(album.getSongs());

        return dto;
	}

	@Override
	public List<ShowAlbumDTO> toShowAlbumListDTO(List<Album> albums) {
        List<ShowAlbumDTO> dtos = new ArrayList<>();

        for(Album album : albums){
            dtos.add(toShowAlbumDTO(album));
        }

        return dtos;
	}
}
