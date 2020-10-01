package com.codingwithmitch.kotlinrecyclerviewexample.models

data class BlogPost(

    var title: String,

    var body: String,

    var image: String,

    var username: String,

    var autoLink: String


) {

    override fun toString(): String {
        return "BlogPost(title='$title', image='$image', username='$username', autoLink='$autoLink')"
    }


}
























