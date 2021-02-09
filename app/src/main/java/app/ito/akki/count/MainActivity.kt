package app.ito.akki.count

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var number: Int = Random.nextInt(35)
    var number2: Int = Random.nextInt(55)
    var number3: Int = Random.nextInt(75)
    var number4: Int = Random.nextInt(55)
    var number5: Int = Random.nextInt(55)
    var number6: Int = Random.nextInt(55)
    var number7: Int = Random.nextInt(55)
    var number8: Int = Random.nextInt(55)
    var number9: Int = Random.nextInt(55)
    var count: Int = Random.nextInt(65)

    //お題の数字の乱数作成
    var randomInt = Random.nextInt(1000)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //レイアウト処理
        randomTextView.text = randomInt.toString()
        button.text = number.toString()
        button2.text = number2.toString()
        button3.text = number3.toString()
        button4.text = number4.toString()
        button5.text = number5.toString()
        button6.text = number6.toString()
        button7.text = number7.toString()
        button8.text = number8.toString()
        button9.text = number9.toString()


        button.setOnClickListener {
            plusMethod(number)

            //ボタンの更新処理
            number = Random.nextInt(5)
            button.text = number.toString()
        }

        button2.setOnClickListener {
            plusMethod(number2)

            //ボタンの更新処理
            number2 = Random.nextInt(45)
            button2.text = number2.toString()
        }

        button3.setOnClickListener {
            plusMethod(number3)

            //ボタンの更新処理
            number3 = Random.nextInt(40)
            button3.text = number3.toString()
        }

        button4.setOnClickListener {
            plusMethod(number4)
            number4 = Random.nextInt(40)
            button4.text  = number4.toString()
        }

        button5.setOnClickListener {
            plusMethod(number5)
            number5 = Random.nextInt(45)
            button5.text = number5.toString()
        }

        button6.setOnClickListener {
            plusMethod(number6)
            number6 = Random.nextInt(45)
            button6.text = number6.toString()
        }

        button7.setOnClickListener {
            minusMethod(number7)
            number7 = Random.nextInt(15)
            button7.text = number7.toString()
        }

        button8.setOnClickListener {
            minusMethod(number8)
            number8 = Random.nextInt(15)
            button8.text = number8.toString()
        }

        button9.setOnClickListener {
            minusMethod(number9)
            number9 = Random.nextInt(15)
            button9.text = number9.toString()
        }
    }


    fun plusMethod( plus: Int){
        //毎回行う処理
        randomInt = randomInt - plus
        randomTextView.text = randomInt.toString()
        //ボタンクリック処理
        count = count + 1
        buttonCount.text = count.toString()
        if(randomInt == 0){
            Snackbar.make(ConstraintLayout,"ゲームクリア!!", Snackbar.LENGTH_SHORT).show()
            count = 0
            button.text = count.toString()
        }
    }

    //引き算処理
    fun minusMethod(minus: Int){
        //毎回行う処理
        randomInt = randomInt + minus
        randomTextView.text = randomInt.toString()
        //ボタンクリック処理
        count = count + 1
        buttonCount.text = count.toString()

        if(randomInt == 0){
            Snackbar.make(ConstraintLayout,"ゲームクリア!!", Snackbar.LENGTH_SHORT).show()
            count = 0
            button.text = count.toString()
        }
    }
}