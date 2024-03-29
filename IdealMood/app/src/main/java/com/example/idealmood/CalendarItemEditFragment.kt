package com.example.idealmood

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.core.os.bundleOf
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.fragment_calendar_item_edit.*



class CalendarItemEditFragment : AppCompatDialogFragment() {
    // TODO: Rename and change types of parameters

    interface OnStateSelectedListener{
        fun OnStateSelectedListener(stat: Int);
    }


    lateinit var mOnStateSelectedListener:OnStateSelectedListener;

    fun onAttachToParentFragment(fragment:Fragment){
         mOnStateSelectedListener = fragment as OnStateSelectedListener;
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        worst.setOnClickListener {
            //Toast.makeText(activity, "최악", Toast.LENGTH_SHORT).show()
            if(mOnStateSelectedListener != null)
                mOnStateSelectedListener.OnStateSelectedListener(1);
            this.dialog?.cancel()
        }
         bad.setOnClickListener {
             if(mOnStateSelectedListener != null)
                 mOnStateSelectedListener.OnStateSelectedListener(2);
             this.dialog?.cancel()
         }
         soso.setOnClickListener {
             if(mOnStateSelectedListener != null)
                 mOnStateSelectedListener.OnStateSelectedListener(3);
            this.dialog?.cancel()
         }
         good.setOnClickListener {
             if(mOnStateSelectedListener != null)
                 mOnStateSelectedListener.OnStateSelectedListener(4);
              this.dialog?.cancel()
         }
         best.setOnClickListener {
             if(mOnStateSelectedListener != null)
                 mOnStateSelectedListener.OnStateSelectedListener(5);
             this.dialog?.cancel()
         }

    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        onAttachToParentFragment(parentFragment!!);

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment



        return inflater.inflate(R.layout.fragment_calendar_item_edit, container, false)


    }


}
