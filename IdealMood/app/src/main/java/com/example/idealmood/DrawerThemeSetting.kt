package com.example.idealmood

import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.core.content.ContextCompat
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_drawer_theme_setting.*

class DrawerThemeSetting : AppCompatDialogFragment() {
    // TODO: Rename and change types of parameters

    lateinit var myView:View

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        myView = activity!!.layoutInflater.inflate(
            R.layout.fragment_drawer_theme_setting,
            LinearLayout(activity),
            false
        )



        //build dialog
        var builder:AlertDialog.Builder = AlertDialog.Builder(activity!!)

        builder.setView(myView)
        builder.setPositiveButton("OK", DialogInterface.OnClickListener { dialog, which -> dialog.dismiss() })


        return builder.create()

        /*
            .setPositiveButton("OK", DialogInterface.OnClickListener { dialog, which -> dialog.dismiss() })*/
    }



    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //닫기 버튼 클릭 -> 다이얼로그 종료
        themeSettingCloseBtn.setOnClickListener {
            this.dialog?.dismiss()
            //this.dialog?.cancel()
        }

        //버튼별 테마 적용
        defaultBtn.setOnClickListener {
            (context as MainActivity).setThemeColor(0)
        }
        coralBtn.setOnClickListener {
            (context as MainActivity).setThemeColor(1)
        }
        lightSkyBlueBtn.setOnClickListener {
            (context as MainActivity).setThemeColor(2)
        }
        grayBtn.setOnClickListener {
            (context as MainActivity).setThemeColor(3)
        }

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return myView
    }



}
