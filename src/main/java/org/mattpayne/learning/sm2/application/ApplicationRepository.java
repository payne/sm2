package org.mattpayne.learning.sm2.application;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ApplicationRepository extends JpaRepository<Application, Long> {

    boolean existsByEmailIgnoreCase(String email);

}
