package com.kyoungho.app.repository;

import com.kyoungho.app.entity.Work;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkRepository extends JpaRepository<Work,Long> {
}
