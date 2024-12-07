package com.Luxebnb.Repository;

import com.Luxebnb.Model.PackageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageRepository extends JpaRepository<PackageModel,Integer> {



}