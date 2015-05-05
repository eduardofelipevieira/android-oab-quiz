// Generated code from Butter Knife. Do not modify!
package oab.questions.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class MainActivity$$ViewInjector<T extends oab.questions.activity.MainActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131165185, "method 'onClickBtnEthics'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickBtnEthics();
        }
      });
    view = finder.findRequiredView(source, 2131165184, "method 'onClickBtn2014_3_T1'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickBtn2014_3_T1();
        }
      });
  }

  @Override public void reset(T target) {
  }
}
