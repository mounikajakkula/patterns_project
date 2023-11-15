/**
 * 
 */
package com.jakkulaClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jakkulaClasses.DMS.Models.Dog;

/**
 * @author Mounika Jakkula S560445
 * Nov 12, 2023
 */
public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);
}
