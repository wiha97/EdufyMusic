package org.example.albumservice.services.apis;

import java.util.UUID;

import org.example.albumservice.dtos.SongInfoDTO;
import org.springframework.web.client.RestTemplate;

/**
 * SongApiClientServiceImpl
 */
public class SongApiClientServiceImpl implements SongApiClientService {

	@Override
	public SongInfoDTO getSongInfo(UUID uuid) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getSongInfo'");
	}
}
