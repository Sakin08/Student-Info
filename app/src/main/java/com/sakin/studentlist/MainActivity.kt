package com.sakin.studentlist

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var userArrayList: ArrayList<UserData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val name=arrayOf(
            "1. ALI ASHRAF TANVIR",
            "2. ZUBAYER HOSSAIN UDAY",
            "3. ARIF BEPARI",
            "4. MD. DELWAR JAHAN",
            "5. SAKIB AL HRIDOY",
            "6. TANZIM HASAN PRAPPO",
            "7. S.M. ASHIKUR RAHAMAN",
            "8. MD. SOHANOOR RAHAMAN SAKIN",
            "9. MD. ABU BAKAR SIDDIQUE",
            "10. MOST. KHADIZA AKTHER",
            "11. DIPU DEBNATH",
            "12. ABDULLAH AL MAHMUD",
            "13. ABID ABDULLAH",
            "14. MD. SAMINUL AMIN",
            "15. PARTHA PROTIM BISWAS",
            "16. JANNATUL FERDOUSE ESHA",
            "17. MAZHARUL ISLAM",
            "18. ANKON KUMAR SINGH",
            "19. MEHEDI HASAN MASUM",
            "20. MD. HASIN ANJUM"
        )
        val reg = arrayOf(
            "2021331001",
            "2021331002",
            "2021331003",
            "2021331004",
            "2021331005",
            "2021331006",
            "2021331007",
            "2021331008",
            "2021331009",
            "2021331010",
            "2021331011",
            "2021331012",
            "2021331013",
            "2021331014",
            "2021331015",
            "2021331016",
            "2021331017",
            "2021331018",
            "2021331019",
            "2021331020"
        )

        val phone = arrayOf(
            "8801706260318", // 1. ALI ASHRAF TANVIR
            "8801876375141", // 2. ZUBAYER HOSSAIN UDAY
            "8801832757649", // 3. ARIF BEPARI
            "8801619838404", // 4. MD. DELWAR JAHAN
            "8801767139718", // 5. SAKIB AL HRIDOY
            "8801762489345", // 6. TANZIM HASAN PRAPPO
            "8801616184870", // 7. S.M. ASHIKUR RAHAMAN
            "8801823024067", // 8. MD. SOHANOOR RAHAMAN SAKIN
            "8801886633907", // 9. MD. ABU BAKAR SIDDIQUE
            "8801877663882", // 10. MOST. KHADIZA AKTHER
            "8801767881443", // 11. DIPU DEBNATH
            "8801789816940", // 12. ABDULLAH AL MAHMUD
            "8801743332161", // 13. ABID ABDULLAH
            "8801326874247", // 14. MD. SAMINUL AMIN
            "8801959047750", // 15. PARTHA PROTIM BISWAS
            "8801626205221", // 16. JANNATUL FERDOUSE ESHA
            "8801996589892", // 17. MAZHARUL ISLAM
            "8801912455672", // 18. ANKON KUMAR SINGH
            "8801601496272", // 19. MEHEDI HASAN MASUM
            "8801743345806"  // 20. MD. HASIN ANJUM
        )


        val email = arrayOf(
            "aliashraftanvir410@gmail.com", // ALI ASHRAF TANVIR
            "zubayerhossain1009@gmail.com", // ZUBAYER HOSSAIN UDAY
            "mdarif5w@gmail.com",           // ARIF BEPARI
            "delwarjahan28@gmail.com",      // MD. DELWAR JAHAN
            "sakibalhridoy731@gmail.com",   // SAKIB AL HRIDOY
            "tanzimp6@gmail.com",           // TANZIM HASAN PRAPPO
            "rahamanashikur095@gmail.com",  // S.M. ASHIKUR RAHAMAN
            "tajmilanwartamim1452@gmail.com", // MD. SOHANOOR RAHAMAN SAKIN
            "limonhasan01886633907@gmail.com", // MD. ABU BAKAR SIDDIQUE
            "khadizaaktherrumi@gmail.com",  // MOST. KHADIZA AKTHER
            "dipudeb883@gmail.com",         // DIPU DEBNATH
            "abdullahalmahmud400@gmail.com", // ABDULLAH AL MAHMUD
            "abidevan12345@gmail.com",      // ABID ABDULLAH
            "demosaminulamin@gmail.com",                             // MD. SAMINUL AMIN (Email not provided)
            "parthaprotim583@gmail.com",    // PARTHA PROTIM BISWAS
            "jannatulesha33@gmail.com",     // JANNATUL FERDOUSE ESHA
            "mazharul3990@gmail.com",       // MAZHARUL ISLAM
            "joykumarsingh758@gmail.com",   // ANKON KUMAR SINGH
            "mahadihasankhan00@gmail.com",  // MEHEDI HASAN MASUM
            "pillowtalkerarian@gmail.com"   // MD. HASIN ANJUM
        )

        val image=intArrayOf(
            R.drawable.o1,
            R.drawable.o2,
            R.drawable.o3,
            R.drawable.o4,
            R.drawable.o5,
            R.drawable.o6,
            R.drawable.o7,
            R.drawable.o8,
            R.drawable.o9,
            R.drawable.o10,
            R.drawable.o11,
            R.drawable.o12,
            R.drawable.o13a,
            R.drawable.o14,
            R.drawable.o15,
            R.drawable.o16,
            R.drawable.o17,
            R.drawable.ic_launcher_foreground,
            R.drawable.o19,
            R.drawable.o20,
        )


        userArrayList= ArrayList()

        for(index in name.indices){
            val user= UserData(name[index],
                reg[index], phone[index],email[index],image[index])
            userArrayList.add(user)
        }
        val listView = findViewById<ListView>(R.id.listview)
        listView.isClickable = true
        listView.adapter = Myaddapter(this, userArrayList)

        listView.setOnItemClickListener{ parrent,view,position,id ->

            val userName=name[position]
            val userReg=reg[position]
            val userphone=phone[position]
            val useremail=email[position]
            val userimage=image[position]


            val i= Intent(this, UserActivity::class.java)

            i.putExtra("name",userName)
            i.putExtra("reg",userReg)
            i.putExtra("phone",userphone)
            i.putExtra("email",useremail)
            i.putExtra("image",userimage)
            startActivity(i)

        }



    }
}