package com.imie.count.domain;


//@Entity
public class Counter {

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
