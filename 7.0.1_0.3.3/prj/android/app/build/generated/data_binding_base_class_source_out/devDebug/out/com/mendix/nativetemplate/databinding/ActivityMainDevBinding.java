// Generated by view binder compiler. Do not edit!
package com.mendix.nativetemplate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.mendix.nativetemplate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainDevBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText appUrlInputField;

  @NonNull
  public final RelativeLayout barcodeScannerContainer;

  @NonNull
  public final CheckBox checkboxClearData;

  @NonNull
  public final CheckBox checkboxDevMode;

  @NonNull
  public final LinearLayout devMenuContainer;

  @NonNull
  public final TextView inputLabel;

  @NonNull
  public final Button launchAppButton;

  @NonNull
  public final RelativeLayout loader;

  @NonNull
  public final ConstraintLayout root;

  private ActivityMainDevBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText appUrlInputField, @NonNull RelativeLayout barcodeScannerContainer,
      @NonNull CheckBox checkboxClearData, @NonNull CheckBox checkboxDevMode,
      @NonNull LinearLayout devMenuContainer, @NonNull TextView inputLabel,
      @NonNull Button launchAppButton, @NonNull RelativeLayout loader,
      @NonNull ConstraintLayout root) {
    this.rootView = rootView;
    this.appUrlInputField = appUrlInputField;
    this.barcodeScannerContainer = barcodeScannerContainer;
    this.checkboxClearData = checkboxClearData;
    this.checkboxDevMode = checkboxDevMode;
    this.devMenuContainer = devMenuContainer;
    this.inputLabel = inputLabel;
    this.launchAppButton = launchAppButton;
    this.loader = loader;
    this.root = root;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainDevBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainDevBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main_dev, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainDevBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.app_url_input_field;
      EditText appUrlInputField = ViewBindings.findChildViewById(rootView, id);
      if (appUrlInputField == null) {
        break missingId;
      }

      id = R.id.barcode_scanner_container;
      RelativeLayout barcodeScannerContainer = ViewBindings.findChildViewById(rootView, id);
      if (barcodeScannerContainer == null) {
        break missingId;
      }

      id = R.id.checkbox_clear_data;
      CheckBox checkboxClearData = ViewBindings.findChildViewById(rootView, id);
      if (checkboxClearData == null) {
        break missingId;
      }

      id = R.id.checkbox_dev_mode;
      CheckBox checkboxDevMode = ViewBindings.findChildViewById(rootView, id);
      if (checkboxDevMode == null) {
        break missingId;
      }

      id = R.id.dev_menu_container;
      LinearLayout devMenuContainer = ViewBindings.findChildViewById(rootView, id);
      if (devMenuContainer == null) {
        break missingId;
      }

      id = R.id.input_label;
      TextView inputLabel = ViewBindings.findChildViewById(rootView, id);
      if (inputLabel == null) {
        break missingId;
      }

      id = R.id.launch_app_button;
      Button launchAppButton = ViewBindings.findChildViewById(rootView, id);
      if (launchAppButton == null) {
        break missingId;
      }

      id = R.id.loader;
      RelativeLayout loader = ViewBindings.findChildViewById(rootView, id);
      if (loader == null) {
        break missingId;
      }

      ConstraintLayout root = (ConstraintLayout) rootView;

      return new ActivityMainDevBinding((ConstraintLayout) rootView, appUrlInputField,
          barcodeScannerContainer, checkboxClearData, checkboxDevMode, devMenuContainer, inputLabel,
          launchAppButton, loader, root);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}