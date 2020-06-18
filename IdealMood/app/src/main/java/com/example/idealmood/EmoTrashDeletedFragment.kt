package com.example.idealmood

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatDialogFragment
import kotlinx.android.synthetic.main.fragment_emo_trash_edit.*

/**
 * A simple [Fragment] subclass.
 */
class EmoTrashDeletedFragment : AppCompatDialogFragment() {

    lateinit var myView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_emo_trash_edit, container, false)
        return myView
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        myView = activity!!.layoutInflater.inflate(
            R.layout.fragment_emo_trash_deleted,
            LinearLayout(activity),
            false
        )
        //myView = context!!.layoutInflater.inflate(R.layout.fragment_emo_trash_edit, null)


        // dialog 빌드
        return AlertDialog.Builder(activity!!)
            .setView(myView)
            .setNegativeButton(
                "CANCEL",
                DialogInterface.OnClickListener { dialog, which -> dialog.dismiss() })
            .setPositiveButton("SUBMIT", DialogInterface.OnClickListener { dialog, which ->

                //writeFile(emoTrashEdit.text.toString())
            })
            .create()


    }
}