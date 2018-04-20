package aiyadesu.adda.presentation.randomiser.presenter

import aiyadesu.adda.application.Presenter
import android.util.Log
import java.security.KeyStore

/**
 * Created by Richard Lai on 19/4/18.
 */
class RandomiserPresenter : Presenter {

    interface Display {}
    interface Router {}

    override fun onStart() {
        // TODO: Implement KeyStore so that we can store and retrieve the users Random.org API key later
        val keyStore: KeyStore = KeyStore.getInstance(KeyStore.getDefaultType())
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