package com.gmail.nossr50.core.skills.primary.repair;

import com.gmail.nossr50.core.config.AdvancedConfig;
import com.gmail.nossr50.core.config.MainConfig;
import org.bukkit.Material;

public class Repair {
    public static int repairMasteryMaxBonusLevel = AdvancedConfig.getInstance().getRepairMasteryMaxLevel();
    public static double repairMasteryMaxBonus = AdvancedConfig.getInstance().getRepairMasteryMaxBonus();

    public static Material anvilMaterial = MainConfig.getInstance().getRepairAnvilMaterial();
}
