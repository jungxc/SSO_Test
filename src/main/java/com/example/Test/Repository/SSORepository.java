package com.example.Test.Repository;

import java.sql.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Test.Model.SSOModel;

public interface SSORepository extends JpaRepository<SSOModel, Date> {

}


