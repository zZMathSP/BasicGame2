/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basicgame.controller;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputAdapter;
import com.basicgame.model.Player;

/**
 *
 * @author mathe
 */
public class PlayerController extends InputAdapter {

    private  Player player;
    
    public PlayerController(Player p) {
        this.player = p;
    }
    
    @Override
    public boolean keyDown(int keycode) {
        if (keycode == Keys.UP) {
            player.move(0, 1);
        }
        
        if (keycode == Keys.LEFT) {
            player.move(-1, 0);
        }
        
        if (keycode == Keys.DOWN) {
            player.move(0, -1);
        }
        
        if (keycode == Keys.RIGHT) {
            player.move(1, 0);
        }
        return false; 
    }
    
    
}
