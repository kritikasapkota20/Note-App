//package com.example.sqlliteapp;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.net.Uri;
//import android.os.Bundle;
//import android.view.View;
//import android.webkit.WebResourceRequest;
//import android.webkit.WebView;
//import android.webkit.WebViewClient;
//
//
//// To oepn github link on browser
//public class Main2Activity extends AppCompatActivity {
//    WebView webView;
//    String url;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//
//    }
//    private class mywbview extends WebViewClient{
//        @Override
//        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request){
//            if ("https://github.com/PrajwolChand/NotesAppAndroidJava.git".equals(Uri.parse(url).getHost())) {
//                view.loadUrl(url);
//                // This is my website, so do not override; let my WebView load the page
//                return true;
//            }
//            else {
//                // Otherwise, the link is not for a page on my site, so launch another Activity that handles URLs
//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//                startActivity(intent);
//                return true;
//            }
//
//
//        }
//
//    }
//}
