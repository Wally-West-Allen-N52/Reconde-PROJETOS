package br.com.rvrentagency.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rvrentagency.model.PlanTrip;

@Repository
public interface PlanTripRepository extends JpaRepository<PlanTrip, Integer> {

}
