package com.copinha60.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer nip;
	private String name;
	private LocalDate createAt;
	private LocalDate updateAt;
	private Compras compras;
	public User(Integer nip, String name, LocalDate createAt) {
		super();
		this.nip = nip;
		this.name = name;
		this.createAt = createAt;
	}
	public User() {
		
	}
	private Boolean pagamento;
	@Override
	public int hashCode() {
		return Objects.hash(nip);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(nip, other.nip);
	}
	
	

}
