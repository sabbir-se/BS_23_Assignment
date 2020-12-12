package com.bs23.assignment.service.impl;

import com.bs23.assignment.model.Settings;
import com.bs23.assignment.repository.SettingsRepository;
import com.bs23.assignment.service.SettingsServiceIF;
import com.bs23.assignment.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sabbir on 12/12/20.
 */
@Service
public class SettingsServiceImpl implements SettingsServiceIF {

    @Autowired
    SettingsRepository settingsRepository;


    @Override
    public Settings getSettings() {
        if (!Constants.isNullOrEmpty(settingsRepository.findAll())) {
            return settingsRepository.findAll().get(0);
        }
        return new Settings();
    }

    @Override
    public void saveSettings(Settings settings) {
        settingsRepository.save(settings);
    }
}
