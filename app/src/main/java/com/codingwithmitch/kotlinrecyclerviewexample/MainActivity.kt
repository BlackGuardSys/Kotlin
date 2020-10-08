package com.codingwithmitch.kotlinrecyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.GsonBuilder
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.*
import java.io.IOException
import java.io.InputStream

class MainActivity : AppCompatActivity() {

    private lateinit var blogAdapter: BlogRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // DataSource.adapter = BlogRecyclerAdapter()
        initRecyclerView()
        addDataSet()
        fetchJson()
    }
fun fetchJson() {
    println("A")
    val url = "https://github.com/trending"
    val request = Request.Builder().url(url).build()
    val client = OkHttpClient()
    client.newCall(request).enqueue(object: Callback{

        override fun onResponse(call: Call, response: Response) {
            val body = response?.body?.string()
            println(body)
            val gson = GsonBuilder().create()
            val Home = gson.fromJson(body, Home::class.java)

            runOnUiThread {
                DataSource.adapter = BlogRecyclerAdapter()
            }
        }
        override fun onFailure(call: Call, e: IOException) {
            println("Failed")

        }
    })
}
class Home(val trending: List<Trending>)


    class Trending(val actor_id: String, val record_id: String, val originatingUrl: String, val user_id: String)


    private fun addDataSet(){
        val data = DataSource.createDataSet()
        blogAdapter.submitList(data)
    }

    private fun initRecyclerView(){

        recycler_view.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            val topSpacingDecorator = TopSpacingItemDecoration(30)
            addItemDecoration(topSpacingDecorator)
            blogAdapter = BlogRecyclerAdapter()
            adapter = blogAdapter
        }
    }


}























