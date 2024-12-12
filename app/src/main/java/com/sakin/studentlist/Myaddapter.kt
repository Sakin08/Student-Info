package com.sakin.studentlist

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class Myaddapter (val context: Activity, val arrayList: ArrayList<UserData>):
    ArrayAdapter<UserData>(context,R.layout.eachrow,arrayList) {




    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater= LayoutInflater.from(context)
        val view=inflater.inflate(R.layout.eachrow,null)

        val images=view.findViewById<CircleImageView>(R.id.profile_image)
        val name=view.findViewById<TextView>(R.id.textView1)
        val registrationNumbers=view.findViewById<TextView>(R.id.textView2)

        name.text=arrayList[position].name
        registrationNumbers.text=arrayList[position].reg
        images.setImageResource(arrayList[position].image)

        return view
    }
}