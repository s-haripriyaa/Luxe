package com.Luxebnb.Repository;

import com.Luxebnb.Model.HomeStayModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeStayRepository extends JpaRepository<HomeStayModel,Integer> {
}
