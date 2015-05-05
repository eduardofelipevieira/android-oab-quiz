// Generated code from Butter Knife. Do not modify!
package oab.questions.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class QuestionActivity$$ViewInjector<T extends oab.questions.activity.QuestionActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131165188, "field 'btnExpand' and method 'onClickBtnExpand'");
    target.btnExpand = finder.castView(view, 2131165188, "field 'btnExpand'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickBtnExpand();
        }
      });
    view = finder.findRequiredView(source, 2131165191, "field 'txtQuestion'");
    target.txtQuestion = finder.castView(view, 2131165191, "field 'txtQuestion'");
    view = finder.findRequiredView(source, 2131165190, "field 'question'");
    target.question = finder.castView(view, 2131165190, "field 'question'");
    view = finder.findRequiredView(source, 2131165186, "field 'containerMain'");
    target.containerMain = finder.castView(view, 2131165186, "field 'containerMain'");
    view = finder.findRequiredView(source, 2131165192, "field 'containerAnswers'");
    target.containerAnswers = finder.castView(view, 2131165192, "field 'containerAnswers'");
    view = finder.findRequiredView(source, 2131165200, "method 'onClickBtnExpandAnswerC'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickBtnExpandAnswerC();
        }
      });
    view = finder.findRequiredView(source, 2131165201, "method 'onClickAnswerC'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickAnswerC();
        }
      });
    view = finder.findRequiredView(source, 2131165198, "method 'onClickAnswerB'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickAnswerB();
        }
      });
    view = finder.findRequiredView(source, 2131165195, "method 'onClickAnswerA'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickAnswerA();
        }
      });
    view = finder.findRequiredView(source, 2131165204, "method 'onClickAnswerD'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickAnswerD();
        }
      });
    view = finder.findRequiredView(source, 2131165197, "method 'onClickBtnExpandAnswerB'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickBtnExpandAnswerB();
        }
      });
    view = finder.findRequiredView(source, 2131165194, "method 'onClickBtnExpandAnswerA'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickBtnExpandAnswerA();
        }
      });
    view = finder.findRequiredView(source, 2131165203, "method 'onClickBtnExpandAnswerD'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickBtnExpandAnswerD();
        }
      });
    target.containersAnswers = Finder.listOf(
        finder.<android.widget.RelativeLayout>findRequiredView(source, 2131165193, "field 'containersAnswers'"),
        finder.<android.widget.RelativeLayout>findRequiredView(source, 2131165196, "field 'containersAnswers'"),
        finder.<android.widget.RelativeLayout>findRequiredView(source, 2131165199, "field 'containersAnswers'"),
        finder.<android.widget.RelativeLayout>findRequiredView(source, 2131165202, "field 'containersAnswers'")
    );
    target.expandAnswers = Finder.listOf(
        finder.<android.widget.ImageButton>findRequiredView(source, 2131165194, "field 'expandAnswers'"),
        finder.<android.widget.ImageButton>findRequiredView(source, 2131165197, "field 'expandAnswers'"),
        finder.<android.widget.ImageButton>findRequiredView(source, 2131165200, "field 'expandAnswers'"),
        finder.<android.widget.ImageButton>findRequiredView(source, 2131165203, "field 'expandAnswers'")
    );
    target.answers = Finder.listOf(
        finder.<android.widget.Button>findRequiredView(source, 2131165195, "field 'answers'"),
        finder.<android.widget.Button>findRequiredView(source, 2131165198, "field 'answers'"),
        finder.<android.widget.Button>findRequiredView(source, 2131165201, "field 'answers'"),
        finder.<android.widget.Button>findRequiredView(source, 2131165204, "field 'answers'")
    );
  }

  @Override public void reset(T target) {
    target.btnExpand = null;
    target.txtQuestion = null;
    target.question = null;
    target.containerMain = null;
    target.containerAnswers = null;
    target.containersAnswers = null;
    target.expandAnswers = null;
    target.answers = null;
  }
}
