package ru.castlesiege.game;

import ru.castlesiege.game.model.Boss;

public interface BossManager {
    void spawnBoss(Boss boss);
    void killBoss(Boss boss);
}
