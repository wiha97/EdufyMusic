package org.example.songservice.dtos;

import java.util.UUID;

public class ShowSongDTO {
    private UUID uuid;
    private String title;
    private String streamUrl;

    public ShowSongDTO() {
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

	public String getStreamUrl() {
		return streamUrl;
	}

	public void setStreamUrl(String streamUrl) {
		this.streamUrl = streamUrl;
	}
}
