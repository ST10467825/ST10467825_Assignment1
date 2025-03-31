package za.co.varsitycollege.st10467825_assignment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //i opted to declare all my values in one spot for cleaner code
        val editUserText = findViewById<EditText>(R.id.editUserText)
        val buttonGenerate = findViewById<Button>(R.id.buttonGenerate)
        val buttonClear = findViewById<Button>(R.id.buttonClear)
        val textViewOutput = findViewById<TextView>(R.id.textViewOutput)

        //this is where my button does something i think
        buttonGenerate.setOnClickListener{
            var input = editUserText.text.toString().trim().toLowerCase()

            when{//all my possible accepted inputs are stacked together as well for cleaner code
                input=="morning" -> textViewOutput.text = "Omelette or Oats with fruit"
                input=="breakfast" -> textViewOutput.text = "Omelette or Oats with fruit"
                input=="mid morning" -> textViewOutput.text = "Bagel or Muffins"
                input=="mid-morning" -> textViewOutput.text = "Greek Salad with Chicken Strips"
                input=="afternoon" -> textViewOutput.text = "Chicken Mayo Sandwich"
                input=="lunch" -> textViewOutput.text = "Chicken Mushroom Pie"
                input=="mid afternoon" -> textViewOutput.text = "Steak and Kidney Pie"
                input=="mid-afternoon" -> textViewOutput.text = "Milk Tart slice" //personal favourite
                input=="evening" -> textViewOutput.text = "Sirloin Steak with Mashed Potatoes"
                input=="dinner" -> textViewOutput.text = "250g Sirloin steak with mashed potatoes"
                input=="midnight snack" -> textViewOutput.text = "Apple or Banana"
                input=="snack" -> textViewOutput.text = "Kale chips"
                else -> Toast.makeText(this, "Nope, try again buddy!", Toast.LENGTH_LONG).show()
            } //don't question the food choice, i just went off the top of my head
            //from here, my 'reset suggestions' button clears the user input and suggestions box. figuring this out was difficult
            buttonClear.setOnClickListener{
                editUserText.text.clear()
                textViewOutput.text = ""


            }

        }





    }
}