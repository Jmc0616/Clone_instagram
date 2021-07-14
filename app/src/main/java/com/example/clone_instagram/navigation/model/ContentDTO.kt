package com.example.clone_instagram.navigation.model

data class ContentDTO (var explain : String? = null, // 컨텐츠 설명
                  var imageURL : String? = null, // 이미지 URL관리
                  var Uid : String? =  null, // 유저 정보 관리
                  var userId : String? = null, // 유저 이메일 정보 관리
                  var timestamp : Long? = null, // 시간 정보 관리
                  var favoriteCount : Int = 0, // 좋아요 누른 수 관리
                  var favorites : Map<String, Boolean> = HashMap()) { //좋아요 중복 방지
    // 댓글관리 클래스
    data class Comment(var uid : String? = null, // 유저 정보 관리
                       var userId: String? = null, // 유저 이메일 정보 관리
                       var commment : String? = null, // 유저 댓글 관리
                       var timestamp : Long? = null) { // 댓글 시간 관리
    }
}