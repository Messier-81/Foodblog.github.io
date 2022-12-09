// GalleryDataService.js
import http from "../http-common";

class GalleryDataService {

    upload(title, gallery) {

        let formData = new FormData(); // 폼(form) 객체 생성

        formData.append("galleryTitle", title);
        formData.append("gallery", gallery);

        return http.post("/gallery/upload", formData, {
            headers: {
                "Content-Type" : "multipart/form-data"
            }
        })
    }

    // 이미지 제목 검색 요청 함수
    getFiles(galleryTitle, page, size) {
        console.log(galleryTitle);
        console.log(page);
        console.log(size);
        return http.get(`/gallery?galleryTitle=${galleryTitle}&page=${page}&size=${size}`)
    }

    // 이미지 삭제 요청 함수
    delete(gid) {
        return http.delete(`/gallery/deletion/${gid}`);
    }

}

export default new GalleryDataService();