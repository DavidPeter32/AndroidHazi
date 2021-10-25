import java.io.File

class QuizController
{

    val questions = mutableListOf<Question>()

    init
    {
        val lines = File("Questions.txt").readLines()
        for(i in 0..lines.size-1 step 5)
        {
            val question = Question(lines[i],listOf(lines[i+1], lines[i+2], lines[i+3], lines[i+4]))
            questions.add(question)
        }
    }
    fun randomizeQuestions()
    {

        questions.shuffle()

    }

    fun doQuiz(numberOfQuestions : Int)
    {
        var numOfCorrectAns=0
        randomizeQuestions()
        for (i in 0..numberOfQuestions-1 )
        {
            val questionHold=questions[i]
            val answerhold=questionHold.answers
            println(questionHold.text)
            val correctAns= questionHold.answers[0]
            println(answerhold.shuffled())

            print("Write down the correct answer  :")
            val yourAnswer= readLine()
            if(yourAnswer == correctAns)
            {
                numOfCorrectAns++
            }

        }
        println("$numOfCorrectAns / $numberOfQuestions ")

    }

}
