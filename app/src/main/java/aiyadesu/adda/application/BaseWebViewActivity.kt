package aiyadesu.adda.application

import aiyadesu.adda.R
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_webview.*

/**
 * Created by Richard Lai on 20/4/18.
 */
abstract class BaseWebViewActivity : BaseActivity() {

    lateinit var baseWebViewPresenter: BaseWebViewPresenter

    // region Lifecycle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)
    }
    // endregion
}