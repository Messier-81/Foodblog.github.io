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
                <h1 class="display-4 text-white animated slideInDown mb-3">한국음식 갤러리</h1>
                <nav aria-label="breadcrumb animated slideInDown">
                    <ol class="breadcrumb justify-content-center mb-0">
                        <li class="breadcrumb-item"><a class="text-white" href="/">Home</a></li>
                        <li class="breadcrumb-item"><a class="text-white" href="/services">추천 맛집</a></li>
                        <li class="breadcrumb-item text-primary active" aria-current="page">Our Team</li>
                    </ol>
                </nav>
            </div>
        </div>
        <!-- Page Header End -->

        <!-- 한국 음식 게시판 시작 -->
        <div class="container">
            <!-- search 관련 div 시작 -->
            <div class="col-md-8 offset-2">
                <div class="input-group mb-3">
                    <!--            Todo : 수정 시작 -->
                    <input type="text" class="form-control" placeholder="Search by Email" v-model="searchEmail" />
                    <div class="input-group-append">
                        <button class="btn btn-outline-secondary" type="button" @click="
    page = 1;
retrieveKoreaFood();
                        ">
                            Search
                        </button>
                    </div>
                    <!--            Todo : 수정 끝 -->
                </div>
            </div>
            <!-- search 관련 div 끝 -->

            <!--    Todo : page 바 시작 -->
            <div class="col-md-12">
                <div class="mb-3">
                    Items per Page:
                    <select v-model="pageSize" @change="handlePageSizeChange($event)">
                        <option v-for="size in pageSizes" :key="size" :value="size">
                            <!--            size : 3, 6, 9 -->
                            {{ size }}
                        </option>
                    </select>
                </div>

                <b-pagination v-model="page" :total-rows="count" :per-page="pageSize" prev-text="Prev" next-text="Next"
                    @change="handlePageChange"></b-pagination>
            </div>
            <!-- <!—    Todo : page 바 끝 —> -->

            <!-- 테이블 목록 시작 -->
            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">제목</th>
                        <!-- <!— <th scope="col">Last Name</th> —> -->
                        <th scope="col">Email</th>
                        <th scope="col">Phone</th>
                        <th scope="col">Actions</th>
                    </tr>
                </thead>
                <tbody v-for="(data, index) in koreaFood" :key="index">
                    <tr>
                        <td>{{ data.title }}</td>
                        <!-- <!— <td>{{ data.lastName }}</td> —> -->
                        <td>{{ data.email }}</td>
                        <td>{{ data.phone }}</td>
                        <td>
                            <router-link :to="'/KoreaFood/' + data.kno"><span class="badge rounded-pill bg-warning text-dark">Edit</span>
                            </router-link>
                        </td>
                    </tr>
                </tbody>
            </table>
            <router-link to="/add-koreaFood/">
                <h3><span class="badge rounded-pill bg-warning text-dark">추가</span></h3>
            </router-link>
            <!-- 테이블 목록 끝 -->
        </div>
        <!-- 한국 음식 게시판 끝 -->


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
                                <img class="img-fluid bg-light rounded p-1" src="../../../assets/img/product-1.jpg"
                                    alt="Image">
                            </div>
                            <div class="col-4">
                                <img class="img-fluid bg-light rounded p-1" src="../../../assets/img/product-2.jpg"
                                    alt="Image">
                            </div>
                            <div class="col-4">
                                <img class="img-fluid bg-light rounded p-1" src="../../../assets/img/product-3.jpg"
                                    alt="Image">
                            </div>
                            <div class="col-4">
                                <img class="img-fluid bg-light rounded p-1" src="../../../assets/img/product-2.jpg"
                                    alt="Image">
                            </div>
                            <div class="col-4">
                                <img class="img-fluid bg-light rounded p-1" src="../../../assets/img/product-3.jpg"
                                    alt="Image">
                            </div>
                            <div class="col-4">
                                <img class="img-fluid bg-light rounded p-1" src="../../../assets/img/product-1.jpg"
                                    alt="Image">
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
import myBlog from "../../../assets/js/main";
import KoreaFoodDataService from "../../../services/KoreaFoodDataService";
export default {

    data() {
        return {
            koreaFood: [],
            searchEmail: "", // 이메일 검색

            // 페이징을 위한 변수 정의
            page: 1,     // 현재 페이지
            count: 0,    // 전체 데이터 건수
            pageSize: 3, // 한페이지당 몇개를 화면에 보여줄지 결정하는 변수

            pageSizes: [3, 6, 9] // select box 에 넣을 기본 데이터
        }
    },
    methods: {
        // 함수명   : retrieveKoreaFood()
        // 매개변수 : this.searchEmail (email 검색어)
        //            this.page (현재 페이지 번호)
        //            this.pageSize (페이지 당 개수)
        // 리턴값 : 없음
        retrieveKoreaFood() {
            KoreaFoodDataService.getAll(this.searchEmail, this.page - 1, this.pageSize)
                .then((response) => {
                    // 모던 자바 문법 : 구조 분해 할당
                    // const(let) {속성, 속성2} = 객체
                    const { koreaFood, totalItems } = response.data
                    this.koreaFood = koreaFood;
                    this.count = totalItems;
                })
                .catch((e) => {
                    console.log(e);
                })
        },
        // select box 값 변경시 실행되는 함수(재조회)
        handlePageSizeChange(event) {
            this.pageSize = event.target.value; // 한페이지당 개수 저장(3, 6, 9)
            this.page = 1;
            // 재조회 함수 호출
            this.retrieveKoreaFood();
        },
        // 페이지 번호 변경시 실행되는 함수(재조회)
        handlePageChange(value) {
            this.page = value; // 매개변수값으로 현재페이지 변경
            // 재조회 함수 호출
            this.retrieveKoreaFood();
        },
    },
    // 화면이 뜨자마자 실행되는 이벤트
    mounted() {
        this.retrieveKoreaFood();
        myBlog();
    },
}
</script>

<style lang="scss" scoped>
@import "../../../assets/css/style.css";
</style>