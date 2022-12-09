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
                <h1 class="display-4 text-white animated slideInDown mb-3">질문&건의</h1>
                <nav aria-label="breadcrumb animated slideInDown">
                    <ol class="breadcrumb justify-content-center mb-0">
                        <li class="breadcrumb-item"><a class="text-white" href="/">Home</a></li>
                        <li class="breadcrumb-item"><a class="text-white" href="#">Pages</a></li>
                        <li class="breadcrumb-item text-primary active" aria-current="page">Contact</li>
                    </ol>
                </nav>
            </div>
        </div>
        <!-- Page Header End -->


        <!-- Contact Start -->
        <div class="container">
            <!-- search 관련 div 시작 -->
            <div class="col-md-8 offset-2">
                <div class="input-group mb-3">
                    <!-- select box 추가 : v-model="searchSelect" -->
                    <div class="col-2">
                        <select class="form-select" v-model="searchSelect">
                            <option>question</option>
                            <option>questioner</option>
                        </select>
                    </div>

                    <!-- searchDname -> searchKeyword 변경 -->
                    <div class="col-8">
                        <input type="text" class="form-control" placeholder="Search by Question"
                            v-model="searchKeyword" />
                    </div>

                    <div class="input-group-append col-1">
                        <button class="btn btn-outline-secondary" type="button" @click="
    page = 1;
retrieveQna();
                        ">
                            Search
                        </button>
                    </div>
                    <!--            Todo : 수정 끝 -->
                </div>
            </div>
            <!-- search 관련 div 끝 -->

            <!--    Todo : page 바 시작 -->
            <div class="col-md-12 offset-2">
                <div class="mb-3">
                    Items per Page:
                    <select v-model="pageSize" @change="handlePageSizeChange($event)">
                        <option v-for="size in pageSizes" :key="size" :value="size">
                            <!-- <!—            size : 3, 6, 9 —> -->
                            {{ size }}
                        </option>
                    </select>
                </div>

                <b-pagination v-model="page" :total-rows="count" :per-page="pageSize" prev-text="Prev" next-text="Next"
                    @change="handlePageChange"></b-pagination>
            </div>
            <!-- <!—    Todo : page 바 끝 —> -->

            <div class="wow zoomIn" data-wow-delay="0.3s">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th scope="col">Question</th>
                            <th scope="col">Questioner</th>
                            <th scope="col">Answer</th>
                            <th scope="col">Answerer</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody v-for="(data, index) in qna" :key="index">
                        <tr>
                            <td>{{ data.question }}</td>
                            <td>{{ data.questioner }}</td>
                            <td>{{ data.answer }}</td>
                            <td>{{ data.answerer }}</td>
                            <td>
                                <router-link :to="'/qna/' + data.qno"><span
                                        class="badge rounded-pill bg-warning text-dark">수정</span></router-link>
                            </td>
                        </tr>
                    </tbody>
                </table>

                <router-link to="/add-qna/">
                    <h3><span class="badge rounded-pill bg-warning text-dark">추가</span></h3>
                </router-link>
            </div>
        </div>
        <!-- Contact End -->


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
import myBlog from "../../assets/js/main";
import QnaDataService from "../../services/QnaDataService";
export default {

    data() {
        return {
            qna: [],
            searchKeyword: "",
            searchSelect: "question",

            // 페이징을 위한 변수 정의
            page: 1, // 현재 페이지
            count: 0, // 전체 데이터 건수
            pageSize: 3, // 한페이지당 몇개를 화면에 보여줄지 결정하는 변수

            pageSizes: [3, 6, 9], // select box 에 넣을 기본 데이터
        };
    },
    methods: {
        // axios , 모든 정보 조회 요청 함수
        retrieveQna() {
            QnaDataService.getAll(
                this.searchSelect, // select box 선택된 값
                this.searchKeyword, // 검색어
                this.page - 1,
                this.pageSize
            )
                // 성공하면 .then() 결과가 전송됨
                .then((response) => {
                    const { qna, totalItems } = response.data; // springboot 의 전송된 맵 정보
                    this.qna = qna; // 스프링부트에서 전송한 데이터
                    this.count = totalItems; // 스프링부트에서 전송한 페이지정보(총 건수)
                    // 디버깅 콘솔에 정보 출력
                    console.log(response.data);
                })
                // 실패하면 .catch() 에 에러가 전송됨
                .catch((e) => {
                    console.log(e);
                });
        },
        // select box 값 변경시 실행되는 함수(재조회)
        handlePageSizeChange(event) {
            this.pageSize = event.target.value; // 한페이지당 개수 저장(3, 6, 9)
            this.page = 1;
            // 재조회 함수 호출
            this.retrieveQna();
        },
        // 페이지 번호 변경시 실행되는 함수(재조회)
        handlePageChange(value) {
            this.page = value; // 매개변수값으로 현재페이지 변경
            // 재조회 함수 호출
            this.retrieveQna();
        },
    },
    // 화면이 뜨자마자 실행되는 이벤트(라이프 사이클 함수) : mounted(), created()
    mounted() {
        this.retrieveQna(); // 화면 로딩시 전체 조회함수 실행
        myBlog();
    },

}
</script>

<style lang="scss" scoped>
@import "../../assets/css/style.css";
</style>