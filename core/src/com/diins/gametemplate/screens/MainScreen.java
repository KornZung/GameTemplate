package com.diins.gametemplate.screens;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.diins.gametemplate.assets.Assets;
import com.diins.gametemplate.mtx.game.AbstractGame;
import com.diins.gametemplate.mtx.input.InputIntent;
import com.diins.gametemplate.mtx.interfaces.IScreen;
import com.diins.gametemplate.mtx.scene2d.models.SmartActor;
import com.diins.gametemplate.mtx.scene2d.ui.TableModel;
import com.diins.gametemplate.mtx.screen.AbstractScreen;
import com.diins.gametemplate.mtx.settings.AppSettings;

/**
 * Created by VM Win10 on 7/5/2559.
 */
public class MainScreen  extends AbstractScreen implements IScreen {
    public Label lblText;

    // Manage Buttons

    // Swipe controls
    InputIntent inputIntent;
    float touchDragInterval;

    public MainScreen(AbstractGame game, String screenName) {
        super(game, screenName);

        setUpScreenElements();
        setUpMenu();
    }
    @Override
    public void setUpScreenElements() {

        // Reset system
        // #################################################################
        setSecondsTime(0);

        //
        // Set background image
        // #################################################################
        setBackgroundTexture(Assets.imgBG);

        // Screen time / Fps
        // Update by overriding render
        // #########################################################
        lblText = new Label("", getGame().getAssets().getSkin());
        lblText.setPosition((AppSettings.WORLD_WIDTH) - 200, (AppSettings.WORLD_HEIGHT) - 10);
        getStage().addActor(lblText);

        //
        // InputIntent for swipes/drags
        // #################################################################
        inputIntent = new InputIntent();
        touchDragInterval = AppSettings.SCREEN_H / 3.0f;
        inputIntent.setTouchDragIntervalRange(touchDragInterval);
    }

    @Override
    public void setUpMenu() {
//        gameScreenMenu = new MainMenuScreenMenu();
//        gameScreenMenu.setUpMainMenuButtons(this);

        //resetMenuElementsActions();
//        gameScreenMenu.sendInMainMenuButtons(this);
    }

    @Override
    public void render(float delta) {
        super.render(delta);

        lblText.setText("Hello World : " + getScreenTime());

    }

}
