// KoreaFoodDataService.js
// 목적 : KoreaFood 정보를 axios 로 CRUD 를 하는 공통 함수들 정의
import http from "../http-common";

class KoreaFoodDataService {
    // 모든 고개정보 조회 요청 함수
    // email : 고개명
    // page  : 현재페이지 번호
    // size  : 페이지당 화면에 보여질 개수
    getAll(email, page, size) {
        // get 방식 통신 요청 -> @GetMapping("/api/koreaFood")
        // 1) 전체 조회 +
        // 2) 고개명 조회 같이 하는 함수
        return http.get(`/koreaFood?email=${email}&page=${page}&size=${size}`); 
    }

    // 고객번호로 조회 요청 함수
    // get 방식 통신 요청 -> @GetMapping("/api/koreaFood/{kno}"), @PathVariable
    get(kno) {
        return http.get(`/koreaFood/${kno}`)
    }

    // 고객정보 생성(insert) 요청 함수
    // post 방식 통신 요청 -> @PostMapping("/api/koreaFood"), @RequestBody
    create(data) {
        console.log(data);
        return http.post("/koreaFood", data);
    }

    // 고객정보 수정(update) 요청 함수
    // put 방식 통신 요청 -> @PutMapping("/api/koreaFood/{kno}"), @RequestBody
    update(kno, data) {
        return http.put(`/koreaFood/${kno}`, data);
    }

    // 고객정보 삭제(delete) 요청 함수
    // delete 방식 통신 요청 -> @DeleteMapping("/api/koreaFood/deletion/{kno}")
    //                        , @PathVariable  
    delete(kno) {
        return http.delete(`/koreaFood/deletion/${kno}`);
    }

    // 고객정보 전체 삭제 요청 함수
    // delete 방식 통신 요청 -> @DeleteMapping("/api/koreaFood/all")
    deleteAll() {
        return http.delete("/koreaFood/all")
    }

}

export default new KoreaFoodDataService();