package ru.castlesiege;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public final class CastleSiege extends JavaPlugin {

    @Getter
    private static CastleSiege instance;

    @Override
    public void onEnable() {
        instance = this;

    }


    @Override
    public void onDisable() {
    }
}
