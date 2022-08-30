package model.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString

@Builder

//부서 번호로 부서명 검색 / 부서 번호로 모든 부서 정보 검색 
//동적데이터 적용 기술 : binding 
// :변수명 - 값 대입하면 해당 표현 영역에 값이 대입 
@NamedQuery(name = "Dept.findDnameByDeptno", query = "select d.dname from Dept d where d.deptno = :deptno")
@NamedQuery(name = "Dept.findDept", query = "select d from Dept d")

@Entity
public class Dept {
	@Id
	@Column
	private Long deptno;
	
	@NonNull
	@Column
	private String dname;
	
	@NonNull
	@Column
	private String loc;

}
