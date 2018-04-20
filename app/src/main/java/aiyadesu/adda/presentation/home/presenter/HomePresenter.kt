package aiyadesu.adda.presentation.home.presenter

import aiyadesu.adda.application.Presenter
import android.util.Log

/**
 * Created by Richard Lai on 19/4/18.
 */
class HomePresenter(val display: Display, val router: Router) : Presenter {

    interface Display
    interface Router {
        fun navigateToRandomiserScreen()
    }

    // region Lifecycle
    override fun onStart() {
        Log.i("HomePresenter", "onStart")
    }

    override fun onStop() {
        Log.i("HomePresenter", "onStop")
    }

    override fun onPause() {
        Log.i("HomePresenter", "onPause")
    }

    override fun onResume() {
        Log.i("HomePresenter", "onResume")
    }
    // endregion

    fun onRandomiserButtonClicked() {
        router.navigateToRandomiserScreen()
    }
}