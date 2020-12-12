package com.bs23.assignment.repository;

import com.bs23.assignment.model.Settings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sabbir on 12/12/20.
 */
@Transactional
public interface SettingsRepository extends JpaRepository<Settings, Long> {

    @Override
    List<Settings> findAll();
}
