package io.github.mindjet.liteweather.helper

import android.content.Intent
import android.widget.TextView
import io.github.mindjet.livemvvm.helper.ActivityStack

/**
 * Created by Mindjet on 2017/10/25.
 */
inline fun <reified T> start() {
    val now = ActivityStack.currentActivity()
    now.startActivity(Intent(now, T::class.java))
}

infix fun TextView.set(string: String) {
    this.text = string
}