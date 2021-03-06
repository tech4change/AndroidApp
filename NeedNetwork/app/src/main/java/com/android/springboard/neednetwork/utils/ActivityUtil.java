package com.android.springboard.neednetwork.utils;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.mobsandgeeks.saripaar.ValidationError;

import java.util.List;

/**
 * Created by Shouib on 7/1/2017.
 */

public class ActivityUtil {

    public static void startActivity(Activity currentActivity, Class<?> klass) {
        Intent intent = new Intent();
        intent.setClass(currentActivity, klass);
        currentActivity.startActivity(intent);
    }

    public static void startActivity(Fragment currentFragment, Class<?> klass) {
        Intent intent = new Intent();
        intent.setClass(currentFragment.getActivity(), klass);
        currentFragment.startActivity(intent);
    }

    public static void startActivityForResult(Fragment currentFragment, Class<?> klass, int requestCode) {
        Intent intent = new Intent();
        intent.setClass(currentFragment.getActivity(), klass);
        currentFragment.startActivityForResult(intent, requestCode);
    }

    public static void startActivity(Activity currentActivity, Class<?> klass, String keyExtra, Object valueExtra) {
        Intent intent = new Intent();
        intent.setClass(currentActivity, klass);
        if (valueExtra instanceof String) {
            intent.putExtra(keyExtra, (String) valueExtra);
        } else if (valueExtra instanceof Integer) {
            intent.putExtra(keyExtra, (int) valueExtra);
        }
        currentActivity.startActivity(intent);
    }

    public static void startActivityForResult(Fragment currentFragment, Class<?> klass, int requestCode, String keyExtra, String valueExtra) {
        Intent intent = new Intent();
        intent.setClass(currentFragment.getActivity(), klass);
        intent.putExtra(keyExtra, valueExtra);
        currentFragment.startActivityForResult(intent, requestCode);
    }

    public static void handleEditTextValidationError(Context context, List<ValidationError> errors) {
        for (ValidationError error : errors) {
            View view = error.getView();
            String message = error.getCollatedErrorMessage(context);

            // Display error messages ;)
            if (view instanceof EditText) {
                ((EditText) view).setError(message);
            } else {
                Toast.makeText(context, message, Toast.LENGTH_LONG).show();
            }
        }
    }
}
