// ChineseFoodDataService.js
// 목적 : ChineseFood 정보를 axios 로 CRUD 를 하는 공통 함수들 정의
import http from "../http-common";

class ChineseFoodDataService {
    // 모든 고개정보 조회 요청 함수
    // email : 고개명
    // page  : 현재페이지 번호
    // size  : 페이지당 화면에 보여질 개수
    getAll(email, page, size) {
        // get 방식 통신 요청 -> @GetMapping("/api/chineseFood")
        // 1) 전체 조회 +
        // 2) 고개명 조회 같이 하는 함수
        return http.get(`/chineseFood?email=${email}&page=${page}&size=${size}`); 
    }

    // 고객번호로 조회 요청 함수
    // get 방식 통신 요청 -> @GetMapping("/api/chineseFood/{cno}"), @PathVariable
    get(cno) {
        return http.get(`/chineseFood/${cno}`)
    }

    // 고객정보 생성(insert) 요청 함수
    // post 방식 통신 요청 -> @PostMapping("/api/chineseFood"), @RequestBody
    create(data) {
        console.log(data);
        return http.post("/chineseFood", data);
    }

    // 고객정보 수정(update) 요청 함수
    // put 방식 통신 요청 -> @PutMapping("/api/chineseFood/{cno}"), @RequestBody
    update(cno, data) {
        return http.put(`/chineseFood/${cno}`, data);
    }

    // 고객정보 삭제(delete) 요청 함수
    // delete 방식 통신 요청 -> @DeleteMapping("/api/chineseFood/deletion/{cno}")
    //                        , @PathVariable  
    delete(cno) {
        return http.delete(`/chineseFood/deletion/${cno}`);
    }

    // 고객정보 전체 삭제 요청 함수
    // delete 방식 통신 요청 -> @DeleteMapping("/api/chineseFood/all")
    deleteAll() {
        return http.delete("/chineseFood/all")
    }

}

export default new ChineseFoodDataService();