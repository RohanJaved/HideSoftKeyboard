package com.example.hidesoftkeyboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.example.hidesoftkeyboard.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity(),View.OnClickListener {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

     override fun onClick(p0: View?) {
         when(p0?.id){
             R.id.btnHide->{
                 val view:View? = this.currentFocus
                 if(view!=null)
                 {
                     val inputMethodManager = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                     inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(),0)

                 }
             }

         }
     }
 }