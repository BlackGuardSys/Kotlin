package com.codingwithmitch.kotlinrecyclerviewexample

import com.codingwithmitch.kotlinrecyclerviewexample.models.BlogPost

class DataSource{

    companion object{

        lateinit var adapter: BlogRecyclerAdapter

        fun createDataSet(): ArrayList<BlogPost>{
            val list = ArrayList<BlogPost>()
            list.add(
                BlogPost(
                    "Repository",
                    "",
                    "https://look.com.ua/pic/201712/1920x1200/look.com.ua-263616.jpg",
                    "NAME"
                )
            )
            list.add(
                BlogPost(
                    "Repository",
                    "",
                    "https://look.com.ua/pic/201712/1920x1200/look.com.ua-263616.jpg",
                    "NAME"
                )
            )

            list.add(
                BlogPost(
                    "Repository",
                    "",
                    "https://look.com.ua/pic/201712/1920x1200/look.com.ua-263616.jpg",
                    "NAME"
                )
            )
            list.add(
                BlogPost(
                    "Repository",
                    "",
                    "https://look.com.ua/pic/201712/1920x1200/look.com.ua-263616.jpg",
                    "NAME"
                )
            )
            list.add(
                BlogPost(
                    "Repository",
                    ".",
                    "https://look.com.ua/pic/201712/1920x1200/look.com.ua-263616.jpg",
                    "NAME"
                )
            )
            list.add(
                BlogPost(
                    "Repository",
                    "",
                    "https://look.com.ua/pic/201712/1920x1200/look.com.ua-263616.jpg",
                    "NAME"
                )
            )
            list.add(
                BlogPost(
                    "Repository",
                    "",
                    "https://look.com.ua/pic/201712/1920x1200/look.com.ua-263616.jpg",
                    "NAME"
                )
            )
            list.add(
                BlogPost(
                    "Repository",
                    "",
                    "https://look.com.ua/pic/201712/1920x1200/look.com.ua-263616.jpg",
                    "NAME"
                )
            )
            list.add(
                BlogPost(

                    "Repository",
                    "",
                    "https://look.com.ua/pic/201712/1920x1200/look.com.ua-263616.jpg",
                    "NAME"
                )
            )
            return list
        }
    }
}