package mx.edu.potros.precalculadora

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b0: Button = findViewById(R.id.b0)
        val b1: Button = findViewById(R.id.b1)
        val b2: Button = findViewById(R.id.b2)
        val b3: Button = findViewById(R.id.b3)
        val b4: Button = findViewById(R.id.b4)
        val b5: Button = findViewById(R.id.b5)
        val b6: Button = findViewById(R.id.b6)
        val b7: Button = findViewById(R.id.b7)
        val b8: Button = findViewById(R.id.b8)
        val b9: Button = findViewById(R.id.b9)

        val suma: Button = findViewById(R.id.suma)
        val resta: Button = findViewById(R.id.resta)
        val multi: Button = findViewById(R.id.multi)
        val div: Button = findViewById(R.id.div)
        val borrar: Button = findViewById(R.id.borrar)
        val igual: Button = findViewById(R.id.igual)

        val numeros: TextView = findViewById(R.id.textView7)
        val operacion: TextView = findViewById(R.id.textView6)

        var op: String=""
        var op2: Int = 0
        var num1: Double = 0.0
        var num2: Double = 0.0

        b0.setOnClickListener{
            numeros.setText(numeros.text.toString()+0)
        }
        b1.setOnClickListener{
            numeros.setText(numeros.text.toString()+1)
        }
        b2.setOnClickListener{
            numeros.setText(numeros.text.toString()+2)
        }
        b3.setOnClickListener{
            numeros.setText(numeros.text.toString()+3)
        }
        b4.setOnClickListener{
            numeros.setText(numeros.text.toString()+4)
        }
        b5.setOnClickListener{
            numeros.setText(numeros.text.toString()+5)
        }
        b6.setOnClickListener{
            numeros.setText(numeros.text.toString()+6)
        }
        b7.setOnClickListener{
            numeros.setText(numeros.text.toString()+7)
        }
        b8.setOnClickListener{
            numeros.setText(numeros.text.toString()+8)
        }
        b9.setOnClickListener{
            numeros.setText(numeros.text.toString()+9)
        }

        suma.setOnClickListener{
            num1=numeros.text.toString().toDouble()
            operacion.setText(numeros.text.toString()+"+")
            numeros.setText("")
            op="+"
            op2=1
        }
        resta.setOnClickListener{
            num1=numeros.text.toString().toDouble()
            operacion.setText(numeros.text.toString()+"-")
            numeros.setText("")
            op="-"
            op2=1
        }
        multi.setOnClickListener{
            num1=numeros.text.toString().toDouble()
            operacion.setText(numeros.text.toString()+"*")
            numeros.setText("")
            op="*"
            op2=1
        }
        div.setOnClickListener{
            num1=numeros.text.toString().toDouble()
            operacion.setText(numeros.text.toString()+"/")
            numeros.setText("")
            op="/"
            op2=1
        }

        borrar.setOnClickListener {
            numeros.setText("")
            operacion.setText("")
            op=""
            op2=0
        }

        igual.setOnClickListener{
            if(op.equals("+")){
                operacion.setText(""+(num1+numeros.text.toString().toDouble()))
                numeros.setText("")
            }
            if(op.equals("-")){
                operacion.setText(""+(num1-numeros.text.toString().toDouble()))
                numeros.setText("")
            }
            if(op.equals("*")){
                operacion.setText(""+(num1*numeros.text.toString().toDouble()))
                numeros.setText("")
            }
            if(op.equals("/")){
                operacion.setText(""+(num1/numeros.text.toString().toDouble()))
                numeros.setText("")
            }
        }
    }
}