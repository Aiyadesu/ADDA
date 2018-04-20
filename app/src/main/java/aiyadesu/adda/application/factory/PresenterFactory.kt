package aiyadesu.adda.application.factory

import aiyadesu.adda.application.BaseActivity
import aiyadesu.adda.application.Presenter
import aiyadesu.adda.application.enumeration.PresenterType
import aiyadesu.adda.presentation.home.presenter.HomePresenter
import aiyadesu.adda.presentation.randomiser.presenter.RandomiserPresenter

/**
 * Created by Richard Lai on 19/4/18.
 */
object PresenterFactory {

    fun getPresenter(type: PresenterType, activity: BaseActivity): Presenter {
        return when (type) {
            PresenterType.HOME -> {
                HomePresenter(activity as HomePresenter.Display, activity as HomePresenter.Router)
            }
            PresenterType.RANDOMISER -> RandomiserPresenter()
        }
    }
}