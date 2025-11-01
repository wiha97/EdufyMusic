package org.example.albumservice.dtos;

import java.util.List;
import java.util.UUID;

public class ShowAlbumDTO {
    private UUID uuid;
    private String title;
    private String release;
    private List<UUID> songs;

    public ShowAlbumDTO() {
    }

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

	public List<UUID> getSongs() {
		return songs;
	}

	public void setSongs(List<UUID> songs) {
		this.songs = songs;
	}
}
