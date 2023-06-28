package ru.castlesiege.game;

import ru.castlesiege.game.model.Team;

public interface GameManager {
    void addMember(Team team);
    void removeMember(Team team);
}

