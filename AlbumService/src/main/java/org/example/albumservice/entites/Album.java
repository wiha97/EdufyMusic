package org.example.albumservice.entites;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Table;

@Entity
@Table(name = "albums")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "uuid", length = 36)
    private UUID uuid;

    @Column(name = "album_title")
    private String title;

    @Column(name = "release_date")
    private Long release;

    @ElementCollection
    @JoinTable(name = "album_songs", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "song_uuid", length = 36)
    private List<UUID> songs;

    public Album() {
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRelease() {
		return release;
	}

	public void setRelease(Long release) {
		this.release = release;
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

	public List<UUID> getSongs() {
		return songs;
	}

	public void setSongs(List<UUID> songs) {
		this.songs = songs;
	}
}
