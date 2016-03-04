package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img, background, torch, car, stop;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		background = new Texture("background.png");
		torch = new Texture("torch.png");
		car = new Texture("car.png");
		stop = new Texture("stop.png");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0,1,2,0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(background, 0, 0);
		batch.draw(torch, 900, 190);
		batch.draw(car, 1632, 0);
		batch.draw(stop, 1200, 100);
		batch.end();
	}
}


