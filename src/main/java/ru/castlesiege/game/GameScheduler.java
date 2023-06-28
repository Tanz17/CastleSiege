package ru.castlesiege.game;

import ru.castlesiege.game.model.Game;

public interface GameScheduler {
    void startWait(Game game);
    void startGame(Game game);
    void stopGame(Game game);
}
