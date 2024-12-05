package com.bankline_android.ui.statement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bankline_android.R
import com.bankline_android.databinding.ActivityBankStatementBinding
import com.bankline_android.databinding.ActivityWelcomeBinding
import com.bankline_android.domain.Correntista

class BankStatementActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_ACCOUNT_HOLDER = "com.bankline_android.ui.statement.EXTRA_ACCOUNT_HOLDER"

    }

    private val binding by lazy {
        ActivityBankStatementBinding.inflate(layoutInflater)
    }

    private val accountHolder by lazy {
        intent.getParcelableExtra<Correntista>(EXTRA_ACCOUNT_HOLDER)?: throw IllegalArgumentException()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Log.d("TESTE","Chegou o ID:${accountHolder.id}")
    }
}