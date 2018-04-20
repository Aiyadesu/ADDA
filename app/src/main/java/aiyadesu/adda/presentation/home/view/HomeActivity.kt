package aiyadesu.adda.presentation.home.view

import aiyadesu.adda.R
import aiyadesu.adda.application.BaseActivity
import aiyadesu.adda.application.enumeration.PresenterType
import aiyadesu.adda.application.factory.PresenterFactory
import aiyadesu.adda.presentation.home.presenter.HomePresenter
import aiyadesu.adda.presentation.randomiser.view.RandomiserActivity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : BaseActivity(),
        HomePresenter.Display,
        HomePresenter.Router {

    override val presenter: HomePresenter
        get() = PresenterFactory.getPresenter(PresenterType.HOME, this) as HomePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        homeRandomiserButton.setOnClickListener {
            presenter.onRandomiserButtonClicked()
        }
    }

    override fun navigateToRandomiserScreen() {
        startActivity(Intent(this, RandomiserActivity::class.java))
    }
    // endregion
}
