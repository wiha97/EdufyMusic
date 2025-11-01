package org.example.albumservice.dtos;

import java.util.List;

/**
 * SongInfoDTO
 */
public class SongInfoDTO {

    private String title;
    private List<String> genres;

    public SongInfoDTO() {
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getGenres() {
		return genres;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}
}
