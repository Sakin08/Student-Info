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
            "20. MD. HASIN ANJUM",

                    "21. FAIYAZ ISMAIL",
                    "22. AMINUL AHSAN ADIL",
                    "23. JAFIR MIA TASIN",
                    "24. SUKHENDRA NATH DHAR",
                    "25. MD. RAKIBUL ISLAM",
                    "26. SADIA JAMAN",
                    "27. RAFID BIN NASIM",
                    "28. MD. TAJMIL ANWAR TAMIM",
                    "29. SUSMITA RANI GOSH",
                    "30. MD. AZIZUL HAKIM",
                    "31. EBRATUL SHAHARIER",
                    "32. GIDNE HUDA",
                    "33. MD RAKIB AHMED AKASH",
                    "34. SHAFIUZZAMAN AKASH",
                    "35. MEHRAB HOSSAIN SIDDIQUE",
                    "36. JUYENA AKTER",
                    "37. MD. SHAHRIAR GALIB",
                    "38. JOY KUMAR MOHONTO",
                    "39. PRITOM DAS",
                    "40. KAMRUL HASAN",
                    "41. MD. THOWFIQUR BARI CHOWDHURY",
                    "42. UMME ZOAYRIA ABEDIN",
                    "43. PRANTA DAS",
                    "44. SAYEED HASSAN",
                    "45. SAIFUR RAHMAN KHAN",
                    "46. MD. SEYAM HOSSEN",
                    "47. SANJANA YESMIN",
                    "48. MOST. MAYISHA TAJNIM",
                    "49. FARDIN HASAN SAMY",
                    "50. ZIHAN LOBIB CHOWDHURY",
                    "51. NAYEM",
                    "52. MD. MASUM RABBY",
                    "53. HASAN MAHMUD",
                    "54. MST. FATEMA KHATUN",
                    "55. MD. HASHEM ALI SARDER",
                    "56. MALIHA NUSRAT",
                    "57. MAIDUL ISLAM",
                    "58. TASNIM HASAN SHIMANTO",
                    "59. MD. ABDUL SAMAD",
                    "60. MD. MASRUK RAHMAN",
                    "61. MD. MAHMUD HASAN OMI",
                    "62. SUMAIYA AKTER",
                    "63. NEHAL HASNAIN ALVE",
                    "64. UMMAY FARHANA MARIUM",
                    "65. MST. SHIMU KHATUN",
                    "66. MD. FORHAD HASAN JEWEL",
                    "69. MD. SHUVO KHAN",
                    "70. TABASSUM HUDA OYSHI",
                    "71. SHAMIM HOSSAIN",
                    "72. RAHAT AZMAIN RUPAK",
                    "73. MD. FAHIMOR RAHMAN",
                    "74. TAYABA KABIR RICHEE",
                    "75. HARUN OR RASHID RASEL",
                    "76. REJVI AHMED",
                    "77. MOHAMMAD AIAS RAHMAN",
                    "78. MST. NUZHAT-E-RAHMAN",
                    "79. FAHMID HASAN",
                    "80. SHARIF UDDIN",
                    "81. MD. SAYEM ISLAM",
                    "82. MD. KAMRUL HASAN",
                    "83. NILOY CHANDRA DEB",
                    "84. MST. FAHMIDA HAQUE MIM",
                    "85. SHOUROV ROY",
                    "86. ABDULLAH AL MAMUN",
                    "87. MD. ISHMAM IFTI NOOR",
                    "88. A. B. M. MOSTAKIM NILOY",
                    "89. TOWHEDUZZAMAN",
                    "90. MAHDI HASAN QURISHI",
                    "91. SANTOSH SAHA",
                    "92. MD IFTEKHER HAIDER RAKIB",
                    "93. MD. SHAMSHUDDOHA SOUROV",
                    "94. AJOY CHAKRABARTHY",
                    "95. MD. ATAUR RAHMAN",
                    "96. JAWAD AZIZ CHOWDHURY",
                    "97. HRIDOY KUMAR BISWAS",
                    "98. MD. MILON MIA",
                    "99. DHANONJOY KUMAR BARMAN",
                    "100. SAGOR CHANDRA PAUL",
                    "101. MAHIR MOHTASIM AKIF KHAN",
                    "103. SUMAIYA MAMUN",
                    "104. S.K TAWKIR AHMED",
                    "105. RANA SINGHO"




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

            "2021331020",
            "2021331021",
            "2021331022",
            "2021331023",
            "2021331024",
            "2021331025",
            "2021331026",
            "2021331027",
            "2021331028",
            "2021331029",
            "2021331030",
            "2021331031",
            "2021331032",
            "2021331033",
            "2021331034",
            "2021331035",
            "2021331036",
            "2021331037",
            "2021331038",
            "2021331039",
            "2021331040",
            "2021331041",
            "2021331042",
            "2021331043",
            "2021331044",
            "2021331045",
            "2021331046",
            "2021331047",
            "2021331048",
            "2021331049",
            "2021331050",
            "2021331051",
            "2021331052",
            "2021331053",
            "2021331054",
            "2021331055",
            "2021331056",
            "2021331057",
            "2021331058",
            "2021331059",
            "2021331060",
            "2021331061",
            "2021331062",
            "2021331063",
            "2021331064",
            "2021331065",
            "2021331066",
//            "2021331067",
//            "2021331068",
            "2021331069",
            "2021331070",
            "2021331071",
            "2021331072",
            "2021331073",
            "2021331074",
            "2021331075",
            "2021331076",
            "2021331077",
            "2021331078",
            "2021331079",
            "2021331080",
            "2021331081",
            "2021331082",
            "2021331083",
            "2021331084",
            "2021331085",
            "2021331086",
            "2021331087",
            "2021331088",
            "2021331089",
            "2021331090",
            "2021331091",
            "2021331092",
            "2021331093",
            "2021331094",
            "2021331095",
            "2021331096",
            "2021331097",
            "2021331098",
            "2021331099",
            "2021331100",
            "2021331101",

            "2021331103",
            "2021331104",
            "2021331105"

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
            "8801743345806",  // 20. MD. HASIN ANJUM
            "8801767665556", // 21. FAIYAZ ISMAIL
            "8801404729993", // 22. AMINUL AHSAN ADIL
            "8801754051960", // 23. JAFIR MIA TASIN
            "8801714201966", // 24. SUKHENDRA NATH DHAR
            "8801753952830", // 25. MD. RAKIBUL ISLAM
            "8801773060784", // 26. SADIA JAMAN
            "8801517120997", // 27. RAFID BIN NASIM
            "8801558957372", // 28. MD. TAJMIL ANWAR TAMIM
            "8801776977003", // 29. SUSMITA RANI GOSH
            "8801305801465", // 30. MD. AZIZUL HAKIM
            "8801703135897", // 31. EBRATUL SHAHARIER
            "8801701713892", // 32. GIDNE HUDA
            "8801759174736", // 33. MD RAKIB AHMED AKASH
            "8801787028090", // 34. SHAFIUZZAMAN AKASH
            "8801886541130", // 35. MEHRAB HOSSAIN SIDDIQUE
            "8801890302904", // 36. JUYENA AKTER
            "8801781539239", // 37. MD. SHAHRIAR GALIB
            "01888888888", // 38. JOY KUMAR MOHONTO
            "8801771856400", // 39. PRITOM DAS
            "8801842781526", // 40. KAMRUL HASAN
            "8801305065824", // 41. MD. THOWFIQUR BARI CHOWDHURY
            "8801934347283", // 42. UMME ZOAYRIA ABEDIN
            "8801995891166", // 43. PRANTA DAS
            "8801943358887", // 44. SAYEED HASSAN
            "8801632738025", // 45. SAIFUR RAHMAN KHAN
            "8801709056950", // 46. MD. SEYAM HOSSEN
            "8801797747489", // 47. SANJANA YESMIN
            "8801912326574", // 48. MOST. MAYISHA TAJNIM
            "8801843017401", // 49. FARDIN HASAN SAMY
            "8801301976857", // 50. ZIHAN LOBIB CHOWDHURY
            "8801617002978", // 51. NAYEM
            "8801737025967", // 52. MD. MASUM RABBY
            "8801603222859", // 53. HASAN MAHMUD
            "8801796292100", // 54. MST.FATEMA KHATUN
            "8801819998439", // 55. MD. HASHEM ALI SARDER
            "8801935555421", // 56. MALIHA NUSRAT
            "8801772959594", // 57. MAIDUL ISLAM
            "8801701338559", // 58. TASNIM HASAN SHIMANTO
            "8801701778222", // 59. MD. ABDUL SAMAD
            "8801842803191", // 60. MD. MASRUK RAHMAN
            "8801886600047", // 61. MD. MAHMUD HASAN OMI
            "8801647140174", // 62. SUMAIYA AKTER
            "8801947071158", // 63. NEHAL HASNAIN ALVE
            "8801872152448", // 64. UMMAY FARHANA MARIUM
            "8801310606195", // 65. MST. SHIMU KHATUN
            "0177777777777", // 66. MD. FORHAD HASAN JEWEL
            "8801603160577", // 1069. MD. SHUVO KHAN
            "8801834093856", // 1070. TABASSUM HUDA OYSHI
            "8801301924956", // 1071. SHAMIM HOSSAIN
            "8801777020195", // 1072. RAHAT AZMAIN RUPAK
            "8801773106879", // 1073. MD. FAHIMOR RAHMAN
            "8801986098422", // 1074. TAYABA KABIR RICHEE
            "8801871414831", // 1075. HARUN OR RASHID RASEL
            "8801793183707", // 1076. REJVI AHMED
            "8801714328693", // 1077. MOHAMMAD AIAS RAHMAN
            "8801771248929", // 1078. MST. NUZHAT-E-RAHMAN
            "8801586313185", // 1079. FAHMID HASAN
            "8801932573172", // 1080. SHARIF UDDIN
            "8801714677847", // 1081. MD. SAYEM ISLAM
            "8801308447510", // 1082. MD. KAMRUL HASAN
            "8801746978549", // 1083. NILOY CHANDRA DEB
            "8801781642855", // 1084. MST. FAHMIDA HAQUE MIM
            "8801792841660", // 1085. SHOUROV ROY
            "8801622534500", // 1086. ABDULLAH AL MAMUN
            "8801880053025", // 1087. MD. ISHMAM IFTI NOOR
            "8801751907010", // 1088. A. B. M. MOSTAKIM NILOY
            "8801936043645", // 1089. TOWHEDUZZAMAN
            "8801964281241", // 1090. MAHDI HASAN QURISHI
            "8801825216534", // 1091. SANTOSH SAHA
            "8801610051532", // 1092. MD IFTEKHER HAIDER RAKIB
            "8801786708462", // 1093. MD. SHAMSHUDDOHA SOUROV
            "8801707515085", // 1094. AJOY CHAKRABARTHY
            "8801319133660", // 1095. MD. ATAUR RAHMAN
            "8801711968254", // 1096. JAWAD AZIZ CHOWDHURY
            "8801968365618", // 1097. HRIDOY KUMAR BISWAS
            "8801516509402", // 1098. MD. MILON MIA
            "8801783062908", // 1099. DHANONJOY KUMAR BARMAN
            "8801315839205", // 1100. SAGOR CHANDRA PAUL
            "8801313922345", // 1101. MAHIR MOHTASIM AKIF KHAN
            "8801408571069", // 1103. SUMAIYA MAMUN
            "8801778520511", // 1104. S.K TAWKIR AHMED
            "8801779952572", // 1105. RANA SINGHO


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
                "pillowtalkerarian@gmail.com",  // MD. HASIN ANJUM

                "faiyazismail111@gmail.com", // 21
                "adilahsan558@gmail.com", // 22
                "jmtjm45@gmail.com", // 23
                "ssukhendhar@gmail.com", // 24
                "rakibhasan83012@gmail.com", // 25
                "sadiasust21@gmail.com", // 26
                "soccho66@gmail.com", // 27
                "tajmilanwartamim1452@gmail.com", // 28
                "susmitagosh001@gmail.com", // 29
                "ahazizulhakimsumon@gmail.com", // 30
                "ebratulshaharier@gmail.com", // 31
                "gidnehuda04@gmail.com", // 32
                "mdakashahmed121212@gmail.com", // 33
                "zamanakashds696@gmail.com", // 34
                "Shantoamishanto@gmail.com", // 35
                "jujujuyena@gmail.com", // 36
                "shahriarsowmik474@gmail.com", // 37
                "",
                "pritomd678@gmail.com", // 39
                "kamrulhasan35728@gmail.com", // 40
                "thowfiqurbarrychowdhury@gmail.com", // 41
                "zoayriaabedin@gmail.com", // 42
                "pranta.cse.sust@gmail.com", // 43
                "sayeedhassanove@gmail.com", // 44
                "saifkhanwitty@gmail.com", // 45
                "mdseyam6950@gmail.com", // 46
                "sanjanayesmin217@gmail.com", // 47
                "mayishatajnim999@gmail.com", // 48
                "fardinhasansamy@gmail.com", // 49
                "chyzihan13@gmail.com", // 50
                "nayem20talukdar@gmail.com", // 51
                "",// 52 (no email)
                "hasannm82@gmail.com", // 53
                "fatema2021331054@gmail.com", // 54
                "hashemalisarder39@gmail.com", // 55
                "maliha.v0@gmail.com", // 56
                "maidulislamzishan@gmail.com", // 57
                "shimantochampion2017@gmail.com", // 58
                "samshanto2002@gmail.com", // 59
                "masruk2025@gmail.com", // 60
                "omimahmud8@gmail.com", // 61
                "pusposumaiya2002@gmail.com", // 62
                "nehalhasnain452@gmail.com", // 63
                "ummayfarhana1316@gmail.com", // 64
                "shimukhatun08@gmail.com", // 65
                "forhadhasan1007@gmail.com", // 66

                "mdshuvokhan243@gmail.com", // 68
                "oishihuda@gmail.com", // 69
                "shamimhossain20011999@gmail.com", // 70
                "rahatazmain@gmail.com", // 71
                "mdf578860@gmail.com", // 72
                "tayabarichee2214@gmail.com", // 73
                "sustianrasel@gmail.com", // 74
                "rejviahmedraz574@gmail.com", // 75
                "mdaiasrahaman2016@gmail.com", // 76
                "nuzhaterahman92@gmail.com", // 77
                "fahmidtuhin.79@gmail.com", // 78
                "sharifuddin331080@gmail.com", // 79
                "sayem.shuvo999@gmail.com", // 80
                "kamrulhasan145623@gmail.com", // 81
                "niloydeb48@gmail.com", // 82
                "fahmidahaque617@gmail.com", // 83
                "royshourov71@gmail.com", // 84
                "am2003mamun@gmail.com", // 85
                "ishmamiftinoor3@gmail.com", // 86
                "niloy200119@yahoo.com", // 87
                "towheduzzaman@gmail.com", // 88
                "mahdiqureshi9@gmail.com", // 89
                "santoshsaha2003@gmail.com", // 90
                "ihrakib0707@gmail.com", // 91
                "sourovrgc@gmail.com", // 92
                "ajoychakraborty2072@gmail.com", // 93
                "ataur.rahman.33660@gmail.com", // 94
                "jawadaz155@gmail.com", // 95
                "hridoybiswass233@gmail.com", // 96
                "mmilon82814@gmail.com", // 97
                "zibonkumar@gmail.com", // 98
                "sagorpaul300450@gmail.com", // 99
                "mohtasimakif@gmail.com", // 00
                "sumaiyamamun838@gmail.com", // 01
                "tawkirahmed120@gmail.com", // 02
                "singharana311@gmail.com" // 03

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

            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground

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