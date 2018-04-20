package aiyadesu.adda.presentation.randomiser.view

import aiyadesu.adda.R
import aiyadesu.adda.application.BaseActivity
import aiyadesu.adda.application.BaseWebViewActivity
import aiyadesu.adda.application.Presenter
import aiyadesu.adda.application.enumeration.PresenterType
import aiyadesu.adda.application.factory.PresenterFactory
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_webview.*

/**
 * Created by Richard Lai on 19/4/18.
 */
class RandomiserActivity : BaseWebViewActivity() {

    override val presenter: Presenter
        get() = PresenterFactory.getPresenter(PresenterType.RANDOMISER, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_randomiser)

        Log.i("RandomiserActivity", "onCreate")
    }
}