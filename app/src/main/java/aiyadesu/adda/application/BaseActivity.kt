package aiyadesu.adda.application

import android.app.Activity
import android.os.Bundle

/**
 * Created by Richard Lai on 19/4/18.
 */
abstract class BaseActivity : Activity() {

    protected abstract val presenter: Presenter

    // region Lifecycle
    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)

        presenter.onStart()
    }

    override fun onPause() {
        super.onPause()

        presenter.onPause()
    }

    override fun onResume() {
        super.onResume()

        presenter.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()

        presenter.onStop()
    }
    // endregion
}