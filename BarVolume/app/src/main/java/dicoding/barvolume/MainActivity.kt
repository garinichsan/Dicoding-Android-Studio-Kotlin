package dicoding.barvolume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var edWidth: EditText
    private lateinit var edHeight: EditText
    private lateinit var edLength: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvResult: TextView

    companion object {
        private const val STATE_RESULT = "state_result"
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE_RESULT, tvResult.text.toString())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edWidth = findViewById(R.id.edit_width)
        edHeight = findViewById(R.id.edit_height)
        edLength = findViewById(R.id.edit_length)
        btnCalculate = findViewById(R.id.btn_calculate)
        tvResult = findViewById(R.id.tv_result)

        btnCalculate.setOnClickListener(this)

        if (savedInstanceState != null){
            val result = savedInstanceState.getString(STATE_RESULT) as String
            tvResult.text = result
        }
    }

    override fun onClick(v: View) {
        if(v.id == R.id.btn_calculate) {

            var isEmptyFields = false

            val inputLength = edLength.text.toString().trim()
            val inputWidth = edWidth.text.toString().trim()
            val inputHeight = edHeight.text.toString().trim()

            if (inputLength.isEmpty()) {
                isEmptyFields = true
                edit_length.error = "Field ini tidak boleh kosong!"
            }

            if (inputWidth.isEmpty()) {
                isEmptyFields = true
                edit_width.error = "Field ini tidak boleh kosong!"
            }

            if (inputHeight.isEmpty()) {
                isEmptyFields = true
                edit_height.error = "Field ini tidak boleh kosong!"
            }

            if (!isEmptyFields){
                val volume = inputLength.toDouble() * inputWidth.toDouble() * inputHeight.toDouble()
                tvResult.text = volume.toString()
            }
        }
    }


}