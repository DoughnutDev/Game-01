package com.donutproductions.game_01;

import android.graphics.Canvas;
import android.view.MotionEvent;

/**
 * Created by Gunnar on 11/18/2016.
 */

public interface Scene {
    public void update();
    public void draw(Canvas canvas);
    public void terminate();
    public void recieveTouch(MotionEvent event);
}
