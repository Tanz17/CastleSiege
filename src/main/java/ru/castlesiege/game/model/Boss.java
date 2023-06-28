package ru.castlesiege.game.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.bukkit.entity.EntityType;

@Data
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class Boss {
    String name;
    EntityType entityType;
    double health;

}
