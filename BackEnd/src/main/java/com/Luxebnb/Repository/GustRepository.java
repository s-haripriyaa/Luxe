package com.Luxebnb.Repository;

import com.Luxebnb.Model.GuestModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GustRepository extends JpaRepository<GuestModel,Integer> {
}