package com.kotlin.retrofit.bean

class MyCarBean(var data: List<CarInfo>) {
    class CarInfo(
        var articleType: String,
        var count: String,
        var downs: String,
        var firstImg: String,
        var id: String,
        var image: String,
        var mtime: String,
        var pubDate: String,
        var title: String,
        var ups: String,
        var url: String
    )
}
