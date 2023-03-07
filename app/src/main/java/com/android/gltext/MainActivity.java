package com.android.gltext;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity
{
   private GLSurfaceView glView;

   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate( savedInstanceState );
      requestWindowFeature(Window.FEATURE_NO_TITLE);
      getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

      // Create a GLSurfaceView instance and set it
      // as the ContentView for this Activity.
      glView = new GLSurfaceView( this );

      // Set to use OpenGL ES 2.0
      glView.setEGLContextClientVersion(2);
      glView.setRenderer(new TextRenderer(getApplicationContext()));
      setContentView( glView );
   }

   @Override
   protected void onPause() {
      super.onPause();
      glView.onPause();
   }

   @Override
   protected void onResume() {
      super.onResume();
      glView.onResume();
   }
}

