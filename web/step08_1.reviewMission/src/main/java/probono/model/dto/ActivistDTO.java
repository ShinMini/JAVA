﻿/**
CREATE TABLE activist (
       activist_id          	VARCHAR2(20)  PRIMARY KEY,
       name               	VARCHAR2(20) NOT NULL,
       password         	VARCHAR2(20) NOT NULL,
       major                	VARCHAR2(50) NOT NULL
); */
package probono.model.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "activist")
public class ActivistDTO extends People {
	@Column
	private String major;

	// people로 생성된 id, name, pw를 설정
	public ActivistDTO(int id, String name, String pw, String major) {
		People.builder().id(id).name(name).password(pw).build();
		this.major = major;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" 4. 재능 기부 분야 : ");
		builder.append(major);
		return builder.toString();
	}
}