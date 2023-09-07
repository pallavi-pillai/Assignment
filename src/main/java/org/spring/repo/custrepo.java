package org.spring.repo;

import org.spring.entity.customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface custrepo extends JpaRepository<customer,String>
{

}
