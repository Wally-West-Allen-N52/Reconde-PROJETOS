package br.com.rvrentagency.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rvrentagency.model.BuyRV;

@Repository
public interface BuyRVRepository extends JpaRepository<BuyRV, Integer> {

}
