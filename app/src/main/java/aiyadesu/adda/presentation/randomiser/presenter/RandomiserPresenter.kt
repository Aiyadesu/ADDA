package aiyadesu.adda.presentation.randomiser.presenter

import aiyadesu.adda.application.Presenter
import android.util.Log

/**
 * Created by Richard Lai on 19/4/18.
 */
class RandomiserPresenter : Presenter {

    override fun onStart() {
        Log.i("RandomiserPresenter", "onStart")
    }

    override fun onStop() {
        Log.i("RandomiserPresenter", "onStop")
    }

    override fun onPause() {
        Log.i("RandomiserPresenter", "onPause")
    }

    override fun onResume() {
        Log.i("RandomiserPresenter", "onResume")
    }
}