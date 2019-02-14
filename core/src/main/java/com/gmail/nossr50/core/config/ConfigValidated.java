package com.gmail.nossr50.core.config;

import com.gmail.nossr50.core.McmmoCore;

import java.io.File;
import java.util.List;

/**
 * This class is used for config files that validate their entries
 */
public abstract class ConfigValidated extends Config implements DefaultKeys {
    public ConfigValidated(String parentFolderPath, String relativePath)
    {
        super(parentFolderPath, relativePath);
        validateEntries();
    }

    public ConfigValidated(File parentFolderFile, String relativePath)
    {
        super(parentFolderFile, relativePath);
        validateEntries();
    }

    /**
     * Prints all errors found when validating the config
     */
    private void validateEntries()
    {
        /*
         * Print Errors about Keys
         */

        List<String> validKeyErrors = validateKeys(); // Validate Keys

        if(validKeyErrors != null && validKeyErrors.size() > 0)
        {
            for(String error : validKeyErrors)
            {
                McmmoCore.getLogger().severe(error);
            }
        }
    }

}
