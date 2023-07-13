package cz.ackee.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fz.common.text.isNumber
import com.peihua.inputlayout.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val textInputLayout = findViewById<TextInputLayout>(R.id.text_input_layout1)
//        textInputLayout.isHintErrorEnabled = false
        textInputLayout.editText?.setOnFocusChangeListener { v, hasFocus ->
            if (!hasFocus) {
                val text = textInputLayout.editText?.text
                if (!text.isNumber()) {
                    textInputLayout.error = "请输入数字"
                    textInputLayout.isErrorEnabled = true
                }
            } else {
                textInputLayout.error = null
                textInputLayout.isErrorEnabled = false
            }
        }
    }
}