<template>
    <div>
        <!-- Spinner Start -->
        <div id="spinner"
            class="show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
            <div class="spinner-grow text-primary" role="status"></div>
        </div>
        <!-- Spinner End -->


        <!-- Topbar Start -->
        <div class="container-fluid top-bar bg-dark text-light px-0 wow fadeIn" data-wow-delay="0.1s">
            <div class="row gx-0 align-items-center d-none d-lg-flex">
                <div class="col-lg-6 px-5 text-start">
                    <ol class="breadcrumb mb-0">
                        <li class="breadcrumb-item"><a class="small text-light" href="/">Home</a></li>
                        <li class="breadcrumb-item"><a class="small text-light" href="#">Career</a></li>
                        <li class="breadcrumb-item"><a class="small text-light" href="#">Terms</a></li>
                        <li class="breadcrumb-item"><a class="small text-light" href="#">Privacy</a></li>
                    </ol>
                </div>
                <div class="col-lg-6 px-5 text-end">
                    <small>Follow Me:</small>
                    <div class="h-100 d-inline-flex align-items-center">
                        <a class="btn-lg-square text-primary border-end rounded-0" href=""><i
                                class="fab fa-facebook-f"></i></a>
                        <a class="btn-lg-square text-primary border-end rounded-0" href=""><i
                                class="fab fa-twitter"></i></a>
                        <a class="btn-lg-square text-primary border-end rounded-0" href=""><i
                                class="fab fa-linkedin-in"></i></a>
                        <a class="btn-lg-square text-primary pe-0" href=""><i class="fab fa-instagram"></i></a>
                    </div>
                </div>
            </div>
        </div>
        <!-- Topbar End -->


        <!-- Navbar Start -->
        <nav class="navbar navbar-expand-lg navbar-dark fixed-top py-lg-0 px-lg-5 wow fadeIn" data-wow-delay="0.1s">
            <a href="/" class="navbar-brand ms-4 ms-lg-0">
                <h1 class="text-primary m-0">Gourmet Tour</h1>
            </a>
            <button type="button" class="navbar-toggler me-4" data-bs-toggle="collapse"
                data-bs-target="#navbarCollapse">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarCollapse">
                <div class="navbar-nav mx-auto p-4 p-lg-0">
                    <a href="/" class="nav-item nav-link active">Home</a>
                    <a href="/services" class="nav-item nav-link">추천 맛집</a>
                    <a href="/desert" class="nav-item nav-link">추천 디저트</a>
                    <a href="/gallery" class="nav-item nav-link">포토 갤러리</a>
                    <div class="nav-item dropdown">
                        <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">테마</a>
                        <div class="dropdown-menu m-0">
                            <a href="/koreaFood" class="dropdown-item">한식</a>
                            <a href="/chineseFood" class="dropdown-item">중식</a>
                            <a href="/japaneseFood" class="dropdown-item">일식</a>
                            <a href="/westernFood" class="dropdown-item">양식</a>
                        </div>
                    </div>
                    <a href="/qna" class="nav-item nav-link">질문&건의</a>
                </div>
                <div class=" d-none d-lg-flex">
                    <div class="flex-shrink-0 btn-lg-square border border-light rounded-circle">
                        <i class="fa fa-phone text-primary"></i>
                    </div>
                    <div class="ps-3">
                        <small class="text-primary mb-0">연락처</small>
                        <p class="text-light fs-5 mb-0">011-4132-1425</p>
                    </div>
                </div>
            </div>
        </nav>
        <!-- Navbar End -->


        <!-- Page Header Start -->
        <div class="container-fluid page-header py-6 wow fadeIn" data-wow-delay="0.1s">
            <div class="container text-center pt-5 pb-3">
                <h1 class="display-4 text-white animated slideInDown mb-3">포토 갤러리</h1>
                <nav aria-label="breadcrumb animated slideInDown">
                    <ol class="breadcrumb justify-content-center mb-0">
                        <li class="breadcrumb-item"><a class="text-white" href="/">Home</a></li>
                        <li class="breadcrumb-item"><a class="text-white" href="">Pages</a></li>
                        <li class="breadcrumb-item text-primary active" aria-current="page">Products</li>
                    </ol>
                </nav>
            </div>
        </div>
        <!-- Page Header End -->


        <!-- gallery 시작 -->
        <!-- sec -->
        <div class="container">
            <div class="wow fadeInUp" data-wow-delay="0.5s">
                <!-- 검색어 시작 -->
                <div class="col-md-6 offset-2">
                    <div class="input-group">
                        <!-- 검색어 입력 -->
                        <input type="text" class="form-control" placeholder="Search by Title" v-model="searchTitle" />
                        <!-- 검색어 버튼 -->
                        <div class="input-group-append">
                            <button class="btn btn-outline-secondary" type="button" @click="
    page = 1;
retrieveGallery();
                            ">
                                Search
                            </button>
                        </div>
                    </div>
                </div>
                <!-- 검색어 끝 -->

                <!-- Upload 시작 -->
                <div class="row justify-content-md-center">
                    <div class="col-8  mt-3">
                        <!-- 페이징 양식 시작 -->
                        <div class="col-md-8">
                            <!-- 셀렉트 박스 : 기본 페이지 변경 -->
                            <!-- change :  handlePageSizeChange($event), 1페이지당 개수 변경 시 실행되는 이벤트-->
                            <!--           $event : html 태그의 기본 이벤트, 이 객체로 현재 선택 또는 클릭한 html태그(양식)를 알 수 있음.
                     event.target (현재 사용자가 선택한 양식(여기서는 셀렉트 박스내 목록을 의미 ) -->
                            <div class="mb-3">
                                Items per Page:
                                <select v-model="pageSize" @change="handlePageSizeChange($event)">
                                    <option v-for="size in pageSizes" :key="size" :value="size">
                                        {{ size }}
                                    </option>
                                </select>
                            </div>

                            <!-- b-pagination : 부트스트랩 - 페이지 번호 컨트롤 -->
                            <!-- total-rows : 전체 데이터 개수 -->
                            <!-- per-page : 1페이지 당 개수 -->
                            <!-- change : handlePageChange(), 페이지 번호 변경 시 실행되는 이벤트 -->
                            <b-pagination v-model="page" :total-rows="count" :per-page="pageSize" prev-text="Prev"
                                next-text="Next" @change="handlePageChange"></b-pagination>
                        </div>
                        <!-- 페이징 양식 끝 -->

                        <!-- 이미지명(galleryTitle) 입력박스 시작 -->
                        <div class="mb-3 col-md-5">
                            <label for="galleryTitle" class="form-label">이미지명</label>
                            <input type="text" class="form-control" id="galleryTitle" required name="galleryTitle"
                                v-model="galleryTitle" />
                        </div>
                        <!-- 이미지명 입력박스 끝 -->

                        <!-- 이미지 선택상자 시작 -->
                        <div class="mb-3 col-md-5">
                            <label class="btn btn-default p-0">
                                <!-- <!— 파일 선택상자 —> -->
                                <input type="file" accept="image/*" ref="file" @change="selectImage" />
                            </label>
                        </div>
                        <!-- 이미지 선택상자 끝 -->

                        <!-- upload 버튼 : insert 문 실행 시작 -->
                        <div class="mb-3">
                            <!-- <!— 서버에 insert 문 호출 —> -->
                            <button class="btn btn-dark btn-sm float-left" :disabled="!currentImage" @click="upload">
                                Upload
                            </button>
                        </div>
                    </div>
                    <!-- upload 버튼 : insert 문 실행 끝 -->
                </div>
            </div>
            <!-- Upload 끝 -->

            <!-- 미리보기 이미지 시작 -->
            <div class=" wow fadeInLeft" data-wow-delay="0.3s">
                <div v-if="previewImage">
                    <div>
                        <img class="preview my-3" :src="previewImage" alt="" />
                    </div>
                </div>
                <!-- 미리보기 이미지 끝 -->

                <!-- 서버 에러 메세지가 있을 경우 아래 출력 시작 -->
                <div v-if="message" class="alert alert-secondary" role="alert">
                    {{ message }}
                </div>
                <!-- 서버 에러 메세지가 있을 경우 아래 출력 끝 -->

                <!-- <!— 쇼핑 카트 형태 디자인 시작 —> -->
                <!-- <!— v-for 시작 —> -->
                <div class="row">
                    <div class="col-sm-3" v-for="(data, index) in gallery" :key="index">
                        <div class="card">
                            <img :src="data.galleryUrl" class="card-img-top" alt="강의" />
                            <div class="card-body">
                                <h5 class="card-title">{{ data.galleryTitle }}</h5>
                                <a style="color: inherit" @click="deleteImage(data.gid)">
                                    <!-- <!— <i class="fas fa-trash" /> —> -->
                                    <span class="badge bg-danger">Delete</span>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- <!— 쇼핑 카트 형태 디자인 끝 —> -->
        </div>
        <!-- sec 끝 -->
        <!-- gallery 끝 -->



        <!-- Footer Start -->
        <div class="container-fluid bg-dark text-light footer my-6 mb-0 py-5 wow fadeIn" data-wow-delay="0.1s">
            <div class="container py-5">
                <div class="row g-5">
                    <div class="col-lg-3 col-md-6">
                        <h4 class="text-light mb-4">연락처</h4>
                        <p class="mb-2"><i class="fa fa-map-marker-alt me-3"></i>부산광역시 해운대구 좌동순환로117</p>
                        <p class="mb-2"><i class="fa fa-phone-alt me-3"></i>+012 345 67890</p>
                        <p class="mb-2"><i class="fa fa-envelope me-3"></i>info@google.com</p>
                        <div class="d-flex pt-2">
                            <a class="btn btn-square btn-outline-light rounded-circle me-1" href=""><i
                                    class="fab fa-twitter"></i></a>
                            <a class="btn btn-square btn-outline-light rounded-circle me-1" href=""><i
                                    class="fab fa-facebook-f"></i></a>
                            <a class="btn btn-square btn-outline-light rounded-circle me-1" href=""><i
                                    class="fab fa-youtube"></i></a>
                            <a class="btn btn-square btn-outline-light rounded-circle me-0" href=""><i
                                    class="fab fa-linkedin-in"></i></a>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <h4 class="text-light mb-4">Quick Links</h4>
                        <a class="btn btn-link" href="/">Home</a>
                        <a class="btn btn-link" href="/services">추천 맛집</a>
                        <a class="btn btn-link" href="/desert">추천 디저트</a>
                        <a class="btn btn-link" href="/gallery">포토 갤러리</a>
                        <a class="btn btn-link" href="/qna">질문&건의</a>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <h4 class="text-light mb-4"> 테마 </h4>
                        <a class="btn btn-link" href="/koreaFood">한식</a>
                        <a class="btn btn-link" href="/chineseFood">중식</a>
                        <a class="btn btn-link" href="/japaneseFood">일식</a>
                        <a class="btn btn-link" href="/westernFood">양식</a>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <h4 class="text-light mb-4">Photo Gallery</h4>
                        <div class="row g-2">
                            <div class="col-4">
                                <img class="img-fluid bg-light rounded p-1" src="img/product-1.jpg" alt="Image">
                            </div>
                            <div class="col-4">
                                <img class="img-fluid bg-light rounded p-1" src="img/product-2.jpg" alt="Image">
                            </div>
                            <div class="col-4">
                                <img class="img-fluid bg-light rounded p-1" src="img/product-3.jpg" alt="Image">
                            </div>
                            <div class="col-4">
                                <img class="img-fluid bg-light rounded p-1" src="img/product-2.jpg" alt="Image">
                            </div>
                            <div class="col-4">
                                <img class="img-fluid bg-light rounded p-1" src="img/product-3.jpg" alt="Image">
                            </div>
                            <div class="col-4">
                                <img class="img-fluid bg-light rounded p-1" src="img/product-1.jpg" alt="Image">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Footer End -->


        <!-- Copyright Start -->
        <div class="container-fluid copyright text-light py-4 wow fadeIn" data-wow-delay="0.1s">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 text-center text-md-start mb-3 mb-md-0">
                        &copy; <a href="#">Gourmet Tour</a>, All Right Reserved.
                    </div>
                </div>
            </div>
        </div>
        <!-- Copyright End -->



        <!-- Back to Top -->
        <a href="#" class="btn btn-lg btn-primary btn-lg-square rounded-circle back-to-top"><i
                class="bi bi-arrow-up"></i></a>

    </div>
</template>

<script>
import myBlog from "../assets/js/main";
import GalleryDataService from "../services/GalleryDataService";
export default {

    data() {
        return {
            currentImage: undefined, // 현재 이미지 변수
            previewImage: undefined, // 미리보기 이미지 변수
            message: "", // 서버쪽 메세지를 저장할 변수
            gallery: [], // 이미지 객체 배열
            searchTitle: "", // 이미지명으로 검색하는 변수

            // springboot 요청할 변수 , 이미지명(galleryTitle), 내용(content)
            galleryTitle: "",

            // 페이징을 위한 변수 정의
            page: 1, // 현재 페이지
            count: 0, // 전체 데이터 건수
            pageSize: 4, // 한페이지당 몇개를 화면에 보여줄지 결정하는 변수

            pageSizes: [4, 8, 12], // select box 에 넣을 기본 데이터
        };
    },
    methods: {
        // 전체 조회 함수
        retrieveGallery() {
            GalleryDataService.getFiles(this.searchTitle, this.page - 1, this.pageSize)
                // 성공하면 .then() 결과가 전송됨
                .then((response) => {
                    const { gallery, totalItems } = response.data; // springboot 의 전송된 맵 정보
                    this.gallery = gallery; // 스프링부트에서 전송한 데이터
                    this.count = totalItems; // 스프링부트에서 전송한 페이지정보(총 건수)
                    // 디버깅 콘솔에 정보 출력
                    console.log(response.data);
                })
                // 실패하면 .catch() 에 에러가 전송됨
                .catch((e) => {
                    console.log(e);
                });
        },
        // 파일 선택상자에서 선택한 이미지를 저장하는 함수
        selectImage() {
            // 첫번째 선택한 이미지를 변수에 저장
            // this.$refs : $refs 속성이 있는 컨트롤이 선택됨
            this.currentImage = this.$refs.file.files.item(0);
            // .createObjectURL() : 이미지 주소만 참조해서 이미지 보여주기 함수
            this.previewImage = URL.createObjectURL(this.currentImage);
            this.message = "";
        },
        // upload 함수
        upload() {
            GalleryDataService.upload(
                this.galleryTitle,
                this.currentImage
            )
                // insert 성공 then()
                .then((response) => {
                    // 서버쪽 성공 메세지를 저장
                    this.message = response.data.message;

                    // 화면에 재조회 요청(axios 함수로 재조회 요청)
                    return GalleryDataService.getFiles(
                        this.searchTitle,
                        this.page - 1,
                        this.pageSize
                    );
                })
                // 조회가 성공하면 실행되는 then()
                .then((response2) => {
                    const { gallery, totalItems } = response2.data;
                    this.gallery = gallery;
                    this.count = totalItems;
                    console.log(response2.data);
                })
                .catch((e) => {
                    console.log(e);
                    this.message = "Could not upload the image!" + e;
                    this.currentImage = undefined;
                });
        },
        // select box 값 변경시 실행되는 함수(재조회)
        handlePageSizeChange(event) {
            this.pageSize = event.target.value; // 한페이지당 개수 저장(3, 6, 9)
            this.page = 1;
            // 재조회 함수 호출
            this.retrieveGallery();
        },
        // 페이지 번호 변경시 실행되는 함수(재조회)
        handlePageChange(value) {
            this.page = value; // 매개변수값으로 현재페이지 변경
            // 재조회 함수 호출
            this.retrieveGallery();
        },
        deleteImage(gid) {
            GalleryDataService.delete(gid)
                .then(response => {
                    console.log(response);
                    this.message = "정상적으로 삭제되었습니다.";

                    // 삭제 후 재조회
                    this.retrieveGallery();
                })
                .catch(e => {
                    console.log(e);
                    this.message = " 삭제 시 에러가 발생했습니다." + e.message;
                })
        }
    },
    // 화면 뜨자 마자 실행되는 이벤트
    mounted() {
        this.retrieveGallery();
        myBlog();
    },

}
</script>

<style lang="scss" scoped>
@import "../assets/css/style.css";
</style>