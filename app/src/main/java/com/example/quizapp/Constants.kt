package com.example.quizapp

object Constants {
    val USER_NAME: String = "user_name"
    val TOTAL_QUESTIONS: String = "total_questions"
    val SCORE: String = "score"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val questionOne = Question(
            1,
            "Melyik országhoz tartozik ez a zászló?",
            R.drawable.ic_flag_of_argentina,
            arrayListOf("Argentína", "Ausztrália", "Örményország", "Ausztria"),
            0,
        )
        questionsList.add(questionOne)

        // 2
        val questionTwo = Question(
            2,
            "Melyik országhoz tartozik ez a zászló?",
            R.drawable.ic_flag_of_australia,
            arrayListOf("Japán", "Ausztria",
            "Ausztrália", "Kanada"),
            2
        )
        questionsList.add(questionTwo)

        // 3
        val questionThree = Question(
            3,
            "Melyik országhoz tartozik ez a zászló?",
            R.drawable.ic_flag_of_brazil,
            arrayListOf("Fehéroroszország", "Mexikó",
            "Kenya", "Brazília"),
            3
        )
        questionsList.add(questionThree)

        // 4
        val questionFour = Question(
            4,
            "Melyik országhoz tartozik ez a zászló?",
            R.drawable.ic_flag_of_belgium,
            arrayListOf("Románia", "Belgium",
            "Németország", "Luxemburg"),
            1
        )
        questionsList.add(questionFour)

        // 5
        val questionFive = Question(
            5,
            "Melyik országhoz tartozik ez a zászló?",
            R.drawable.ic_flag_of_fiji,
            arrayListOf("Szamoa", "Franciaország",
            "Fidzsi-szigetek", "Új-Zéland"),
            2
        )
        questionsList.add(questionFive)

        // 6
        val questionSix = Question(
            6,
            "Melyik országhoz tartozik ez a zászló?",
            R.drawable.ic_flag_of_germany,
            arrayListOf("Németország", "Hollandia",
            "Görögország", "Bulgária"),
            0
        )

        questionsList.add(questionSix)

        // 7
        val questionSeven = Question(
            7,
            "Melyik országhoz tartozik ez a zászló?",
            R.drawable.ic_flag_of_denmark,
            arrayListOf("Norvégia", "Egyiptom",
            "Dánia", "Svédország"),
            2
        )
        questionsList.add(questionSeven)

        // 8
        val questionEight = Question(
            8,
            "Melyik országhoz tartozik ez a zászló?",
            R.drawable.ic_flag_of_india,
            arrayListOf("Írország", "Irán",
            "Magyarország", "India"),
            3
        )
        questionsList.add(questionEight)

        // 9
        val questionNine = Question(
            9,
            "Melyik országhoz tartozik ez a zászló?",
            R.drawable.ic_flag_of_new_zealand,
            arrayListOf("Ausztrália", "Új-Zéland",
            "Finnország", "Észtország"),
            1
        )
        questionsList.add(questionNine)

        // 10
        val questionTen = Question(
            10,
            "Melyik országhoz tartozik ez a zászló?",
            R.drawable.ic_flag_of_kuwait,
            arrayListOf("Kuvait", "Jordánia",
            "Szaúd-Arábia", "Szíria"),
            0
        )
        questionsList.add(questionTen)

        return questionsList
    }
}