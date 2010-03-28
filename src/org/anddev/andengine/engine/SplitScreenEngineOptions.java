package org.anddev.andengine.engine;

import org.anddev.andengine.opengl.texture.source.ITextureSource;
import org.anddev.andengine.opengl.view.camera.Camera;

/**
 * @author Nicolas Gramlich
 * @since 22:33:05 - 27.03.2010
 */
public class SplitScreenEngineOptions extends EngineOptions {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	private final Camera mSecondCamera;

	// ===========================================================
	// Constructors
	// ===========================================================

	public SplitScreenEngineOptions(final boolean pFullscreen, final ScreenOrientation pScreenOrientation, final Camera pFirstCamera, final Camera pSecondCamera) {
		super(pFullscreen, pScreenOrientation, pFirstCamera);
		this.mSecondCamera = pSecondCamera;
	}

	public SplitScreenEngineOptions(final ITextureSource pLoadingScreenTextureSource, final boolean pFullscreen, final ScreenOrientation pScreenOrientation, final Camera pFirstCamera, final Camera pSecondCamera) {
		super(pLoadingScreenTextureSource, pFullscreen, pScreenOrientation, pFirstCamera);
		this.mSecondCamera = pSecondCamera;
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================
	
	@Deprecated
	@Override
	public Camera getCamera() {
		return super.getCamera();
	}
	
	public Camera getFirstCamera() {
		return super.getCamera();
	}
	
	public Camera getSecondCamera() {
		return this.mSecondCamera;
	}	

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
