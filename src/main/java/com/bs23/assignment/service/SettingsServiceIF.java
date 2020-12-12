package com.bs23.assignment.service;

import com.bs23.assignment.model.Settings;

/**
 * Created by sabbir on 12/12/20.
 */
public interface SettingsServiceIF {

    Settings getSettings();

    void saveSettings(Settings settings);
}
