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
                <h1 class="display-4 text-white animated slideInDown mb-3">질문%건의</h1>
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


        <!-- AddQna Start -->
        <div class="container" v-if="!submitted">
            <div class="mb-3">
                <label for="question" class="form-label">question</label>
                <textarea class="form-control form-control-lg " id="question" rows="3" required name="question"
                    v-model="qna.question"></textarea>
            </div>
            <div class="mb-3">
                <label for="questioner" class="form-label">questioner</label>
                <input type="questioner" class="form-control" id="questioner" required name="questioner"
                    v-model="qna.questioner" />
            </div>
            <div class="mb-3">
                <label for="answer" class="form-label">answer</label>
                <textarea class="form-control form-control-lg" id="answer" rows="3" required name="answer"
                    v-model="qna.answer"></textarea>
            </div>
            <div class="mb-3">
                <label for="answerer" class="form-label">answerer</label>
                <input type="text" class="form-control" id="answerer" name="answerer" v-model="qna.answerer" />
            </div>
            <div class="mb-3">
                <button @click="saveQna" class="btn btn-primary">Submit</button>
            </div>
        </div>
        <div v-else>
            <div class="alert alert-success" role="alert">Save qna successfully!</div>
            <button @click="newQna" class="btn btn-primary">Add New Qna</button>
            <button @click="returnQna" class="btn btn-primary ms-3">Return QnaList</button>
        </div>
        <!-- AddQna End -->


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
                                <img class="img-fluid bg-light rounded p-1" src="../../assets/img/product-1.jpg"
                                    alt="Image">
                            </div>
                            <div class="col-4">
                                <img class="img-fluid bg-light rounded p-1" src="../../assets/img/product-2.jpg"
                                    alt="Image">
                            </div>
                            <div class="col-4">
                                <img class="img-fluid bg-light rounded p-1" src="../../assets/img/product-3.jpg"
                                    alt="Image">
                            </div>
                            <div class="col-4">
                                <img class="img-fluid bg-light rounded p-1" src="../../assets/img/product-2.jpg"
                                    alt="Image">
                            </div>
                            <div class="col-4">
                                <img class="img-fluid bg-light rounded p-1" src="../../assets/img/product-3.jpg"
                                    alt="Image">
                            </div>
                            <div class="col-4">
                                <img class="img-fluid bg-light rounded p-1" src="../../assets/img/product-1.jpg"
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
import myBlog from "../../assets/js/main";
import QnaDataService from "../../services/QnaDataService";
export default {
    data() {
        return {
            qna: {
                qno: null,
                question: "",
                questioner: "",
                answer: "",
                answerer: "",
            },
            // submit 버튼을 클릭하면 true 가 되고, You submitted successfully! 화면에 출력됨
            submitted: false,
        };
    },
    methods: {
        saveQna() {
            // 임시 객체 변수 -> springboot 전송
            // 부서번호는(no) 자동생성되므로 빼고 전송함
            let data = {
                question: this.qna.question,
                questioner: this.qna.questioner,
                answer: this.qna.answer,
                answerer: this.qna.answerer,
            };

            // insert 요청 함수 호출(axios 공통함수 호출)
            QnaDataService.create(data)
                // 성공하면 then() 결과가 전송됨
                .then((response) => {
                    this.qna.qno = response.data.qno;
                    // 콘솔 로그 출력(response.data)
                    console.log(response.data);
                    // 변수 submitted
                    this.submitted = true;
                })
                // 실패하면 .catch() 결과가 전송됨
                .catch((e) => {
                    console.log(e);
                });
        },
        newQna() {
            // 새양식 다시 보여주기 함수, 변수 초기화
            this.submitted = false;
            this.qna = {};
        },

        returnQna() {
            location.href = "/qna";
        }
    },

    mounted() {
        myBlog();
    },
};
</script>

<style lang="scss" scoped>
@import "../../assets/css/style.css";
</style>