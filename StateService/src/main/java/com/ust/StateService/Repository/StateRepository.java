package com.ust.StateService.Repository;


import com.ust.StateService.Model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
    State findByStateCode(String stateCode);
}
