package com.basicgame.screen;

import com.badlogic.gdx.Screen;
import com.basicgame.MechBattle;

public abstract class AbstractScreen implements Screen {
    
    private MechBattle app;
    
    
    public AbstractScreen(MechBattle app) {
        this.app = app;
    }

    @Override
    public abstract void dispose();

    @Override
    public abstract void hide();

    @Override
    public abstract void resume();

    @Override
    public abstract void pause();

    @Override
    public abstract void resize(int width, int height);

    @Override
    public abstract void render(float delta);

    @Override
    public abstract void show();
    
    public MechBattle getApp() {
        return app;
    }
    
}
