package com.ahmed.databaseroom

import android.os.AsyncTask
import android.util.Log

class BacgroundTask : AsyncTask<Int, Void, String>() {
    override fun doInBackground(vararg params: Int?): String {
        var list: ArrayList<String> = ArrayList<String>()

        for (i in 1..params[2]!!) {
            list.add(i.toString())
        }
        return list.size.toString()


    }
    override fun onPostExecute(result: String?) {
        Log.i("BacgroundTask", result!!)
        super.onPostExecute(result)
    }

    fun longOperation(size: Int): String {
        var list: ArrayList<String> = ArrayList<String>()

        for (i in 1..size) {
            list.add(i.toString())
        }
        return list.size.toString()
    }
}