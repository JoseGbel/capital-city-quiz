package com.example.capitalcityquizktx.ui.register

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.example.capitalcityquizktx.R

class FailedRegisterFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setMessage(getString(R.string.error_account_dialog_message))
                   .setPositiveButton(getString(R.string.ok)) { dialog, _ -> dialog.dismiss() }
                   .setTitle(getString(R.string.error_account_dialog_title))
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}