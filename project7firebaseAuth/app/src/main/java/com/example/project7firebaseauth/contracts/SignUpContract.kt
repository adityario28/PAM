package com.example.project7firebaseauth.contracts

import android.app.Activity
import android.content.Context
import android.content.Intent
import com.example.project7firebaseauth.SIgnUpActivity
import androidx.activity.result.contract.ActivityResultContract

class SignUpContract : ActivityResultContract<String?, String?>(){
    override fun createIntent(context: Context, input: String?): Intent {
        return Intent(context, SIgnUpActivity::class.java)
    }

    override fun parseResult(resultCode: Int, intent: Intent?): String? = when {
        resultCode != Activity.RESULT_OK -> null
        else -> intent?.getStringExtra("username")
    }

}