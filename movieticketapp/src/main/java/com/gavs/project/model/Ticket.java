package com.gavs.project.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Ticket {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="name")
	private String movieName;
	@Column(name="duration")
	private String duration;
	@Column(name="date")
	private Date date;
	public Ticket() {
		super();
	}
	public Ticket(int id, String movieName, String duration, Date date) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.duration = duration;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", movieName=" + movieName + ", duration=" + duration + ", date=" + date + "]";
	}
	
	
	
	
	
	
	
}
