package com.codingwithmitch.kotlinrecyclerviewexample

import com.codingwithmitch.kotlinrecyclerviewexample.models.BlogPost

class DataSource{

    companion object{

        fun createDataSet(): ArrayList<BlogPost>{
            val list = ArrayList<BlogPost>()
            list.add(
                BlogPost(
                    "Repository",
                    "",
                    "https://look.com.ua/pic/201712/1920x1200/look.com.ua-263616.jpg",
                    "NAME",
                    "https://github.com/trending"
                )
            )
            list.add(
                BlogPost(
                    "Repository",
                    "",
                    "https://look.com.ua/pic/201712/1920x1200/look.com.ua-263616.jpg",
                    "NAME",
                    "https://github.com/trending"
                )
            )

            list.add(
                BlogPost(
                    "Repository",
                    "",
                    "https://look.com.ua/pic/201712/1920x1200/look.com.ua-263616.jpg",
                    "NAME",
                    "https://github.com/trending"
                )
            )
            list.add(
                BlogPost(
                    "Repository",
                    "",
                    "https://look.com.ua/pic/201712/1920x1200/look.com.ua-263616.jpg",
                    "NAME",
                    "https://github.com/trending"
                )
            )
            list.add(
                BlogPost(
                    "Repository",
                    ".",
                    "https://look.com.ua/pic/201712/1920x1200/look.com.ua-263616.jpg",
                    "NAME",
                    "https://github.com/trending"
                )
            )
            list.add(
                BlogPost(
                    "Repository",
                    "",
                    "https://look.com.ua/pic/201712/1920x1200/look.com.ua-263616.jpg",
                    "NAME",
                    "https://github.com/trending"
                )
            )
            list.add(
                BlogPost(
                    "Repository",
                    "",
                    "https://look.com.ua/pic/201712/1920x1200/look.com.ua-263616.jpg",
                    "NAME",
                    "https://github.com/trending"
                )
            )
            list.add(
                BlogPost(
                    "Repository",
                    "",
                    "https://look.com.ua/pic/201712/1920x1200/look.com.ua-263616.jpg",
                    "NAME",
                    "https://github.com/trending"
                )
            )
            list.add(
                BlogPost(

                    "Repository",
                    "",
                    "https://look.com.ua/pic/201712/1920x1200/look.com.ua-263616.jpg",
                    "NAME",
                    "https://github.com/trending"
                )
            )
            return list
        }
    }
}