package com.squareup.timessquare;

import android.view.ContextThemeWrapper;
import android.widget.TextView;

public class DefaultDayViewAdapter implements DayViewAdapter {
  @Override
  public void makeCellView(CalendarCellView parent, int style) {

      TextView textView = new TextView(
              new ContextThemeWrapper(parent.getContext(), style));
      textView.setDuplicateParentStateEnabled(true);
      parent.addView(textView);
      parent.setDayOfMonthTextView(textView);
  }
}
