package com.basicgame.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.basicgame.Settings;
import com.basicgame.model.Player;
import com.basicgame.MechBattle;
import com.basicgame.controller.PlayerController;

public class GameScreen extends AbstractScreen {
    private Player player;
    
    private PlayerController controller;
    
    private SpriteBatch batch;
    private Texture redStandingSouth;
    
    public GameScreen(MechBattle app) {
        super(app);
        redStandingSouth = new Texture("res/robo_de_batalha.png");
        batch = new SpriteBatch();
        player = new Player(0, 0);
        controller = new PlayerController(player);
    }

    @Override
    public void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hide() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void resume() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pause() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void resize(int width, int height) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void render(float delta) {
        batch.begin();
        batch.draw(redStandingSouth, player.getX()*Settings.SCALED_TILE_SIZE, player.getY()*Settings.SCALED_TILE_SIZE, Settings.SCALED_TILE_SIZE, Settings.SCALED_TILE_SIZE*1.5f);
        batch.end();
    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(controller);
    }
    
}
