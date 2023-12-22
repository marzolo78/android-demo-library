package com.example.demomodule;

import android.content.Context;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class Module {

   public static void toastMessage(Context context, String message) {
      Toast.makeText(context, message, Toast.LENGTH_LONG).show();
   }

   public static void logMessage(String message) {
      System.out.println(message);
   }

   public static void addImageToView(String url, ImageView imageView) {
      Picasso.get().load(url).into(imageView);
   }

}
