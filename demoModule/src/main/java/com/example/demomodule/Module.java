package com.example.demomodule;

import android.content.Context;
import android.widget.Toast;

public class Module {

   public static void toastMessage(Context context, String message) {
      Toast.makeText(context, message, Toast.LENGTH_LONG).show();
   }

}
