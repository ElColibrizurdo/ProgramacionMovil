package com.example.comprensiontorresalvarezangel

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.content.ContextCompat
import com.example.comprensiontorresalvarezangel.ui.theme.ComprensionTorresAlvarezAngelTheme

class MainActivity : ComponentActivity() {

    private lateinit var editText: EditText
    private lateinit var editText2: EditText
    private lateinit var textView: TextView
    private lateinit var btnAceptar: Button
    private lateinit var editTextApe: EditText
    private lateinit var email: EditText
    var drawable: Drawable? = null
    private lateinit var imgLogo: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)
                // A surface container using the 'background' color from the theme

                    textView = findViewById(R.id.textView)
                    editText = findViewById(R.id.editText)
                    editTextApe = findViewById(R.id.editApellido)
                    editText2 = findViewById(R.id.editText2)
                    email = findViewById(R.id.correoElectronico)
                    btnAceptar = findViewById(R.id.btnAceptar)
                    drawable = ContextCompat.getDrawable(this, R.drawable.verde)
                    imgLogo = findViewById(R.id.logo)

                    editText.addTextChangedListener(object : TextWatcher {
                        override fun afterTextChanged(s: Editable) {}
                        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                        }

                        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                            textView.text = editText.text
                        }
                    })

                    btnAceptar.setOnClickListener {



                        if (!editText.text.isBlank() && !editText2.text.isBlank() &&
                            !editTextApe.text.isBlank() && !email.text.isBlank()) {

                            textView.visibility = View.VISIBLE
                            btnAceptar.isEnabled = false
                            imgLogo.setImageResource(R.drawable.verde)

                        } else if(editText.text.isBlank() || editText2.text.isBlank() ||
                                editTextApe.text.isBlank() || email.text.isBlank()) {

                            imgLogo.setImageResource(R.drawable.rojo)

                        } else {
                            imgLogo.setImageResource(R.drawable.rojo)
                        }
                    }

        }


    }
