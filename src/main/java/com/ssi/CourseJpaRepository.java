package com.ssi;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path="technologies")//optional to change end point otherwise courses
public interface CourseJpaRepository extends PagingAndSortingRepository<Course, String> {
	//http://localhost:8080/myapi/technologies/search/findByCname?name=java default
	public List<Course> findByCname(@Param("name") String cname);
	//http://localhost:8080/myapi/technologies/search/findByFeesLessThan?fees=25000
	public List<Course> findByFeesLessThan(@Param("fees") int amount);
	//@RestResource(path="expensive")
	//http://localhost:8080/myapi/technologies/search/expensive?amt=15000
	public List<Course> findByFeesGreaterThan(@Param("amt") int amount);	
	

}
/*
 * http://localhost:8080/myapi/technologies?page=1&size=2&sort=fees
 *http://localhost:8080/myapi/technologies?page=2&size=2&sort=fees,desc
 *http://localhost:8080/myapi/technologies/search	to expose endpoints
*/	