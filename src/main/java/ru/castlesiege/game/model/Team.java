package ru.castlesiege.game.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.bukkit.Location;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Data
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class Team {
    String name;
    int maxMembers;
    Location location;
    boolean winner;
    List<String> commands;
    Set<UUID> members;
}
