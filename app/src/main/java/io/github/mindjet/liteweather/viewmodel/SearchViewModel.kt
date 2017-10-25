package io.github.mindjet.liteweather.viewmodel

import android.view.KeyEvent
import android.view.View
import android.widget.EditText
import android.widget.Toast
import io.github.mindjet.liteweather.databinding.ActivitySearchBinding
import io.github.mindjet.liteweather.helper.set
import io.github.mindjet.livemvvm.viewmodel.BaseViewModel

/**
 * Created by Mindjet on 2017/10/23.
 */
class SearchViewModel : BaseViewModel<ActivitySearchBinding>() {

    private val editText: EditText by lazy { binding?.editText!! }

    override fun onAttached(binding: ActivitySearchBinding) {
        editText.setOnKeyListener { _, _, keyEvent ->
            if (keyEvent.keyCode == KeyEvent.KEYCODE_ENTER && keyEvent.action == KeyEvent.ACTION_UP) onSearch()
            false
        }
    }

    private fun onSearch() {
        //todo change for the new version of AnkoUtil
        Toast.makeText(context, editText.text, Toast.LENGTH_SHORT).show()
    }

    fun onBack(view: View) {
        activity?.finish()
    }

    fun onClear(view: View) {
        editText set ""
    }

}