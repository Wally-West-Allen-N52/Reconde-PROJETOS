package br.com.rvrentagency.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rvrentagency.model.RentRV;

@Repository
public interface RentRVRepository extends JpaRepository<RentRV, Integer> {

}