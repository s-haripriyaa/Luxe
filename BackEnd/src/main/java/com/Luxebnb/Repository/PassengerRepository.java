package com.Luxebnb.Repository;

import com.Luxebnb.Model.PassengerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<PassengerModel,Integer> {
}
