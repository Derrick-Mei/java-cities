// 3

package com.lambdaschool.javacities;

// JpaRepository is database stuff?
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcCityRepository extends JpaRepository<AbCity, Long>
{
}
