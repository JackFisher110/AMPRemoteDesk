package com.action.amp.ampremotedesk.app.main;

import com.action.amp.ampremotedesk.app.BasePresenter;
import com.action.amp.ampremotedesk.app.BaseView;

/**
 * Created by tianluhua on 2017/8/17 0017.
 */
public interface MainContract {

    interface  View extends BaseView<Present> {

    }

    interface Present extends BasePresenter {

    }
}
