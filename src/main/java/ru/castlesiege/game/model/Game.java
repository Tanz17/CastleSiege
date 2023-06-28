package ru.castlesiege.game.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class Game {
    Team attacker;
    Team defender;

    Boss king;

    boolean active;

}
