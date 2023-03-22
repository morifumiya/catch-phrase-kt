package rob.myappcompany.catchphrasekt

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1) view を取得
        val et: EditText = findViewById(R.id.et)
        val btnStart: Button = findViewById(R.id.btnStart)

        // 2) 画面を渡す(intent)
        btnStart.setOnClickListener {

            if (et.text.toString() == "") {
//                AlertDialog.Builder(this)
//                    .setTitle("注意")
//                    .setMessage("文字を入力してください。")
//                    .setPositiveButton("OK", null)
//                    .show()

                Toast.makeText(this, "文字を入力してください。", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, ResultActivity::class.java)
                // 3) 値を渡す
                intent.putExtra("MY_ITEM", et.text.toString())
                startActivity(intent)

            }
        }
    }
}

