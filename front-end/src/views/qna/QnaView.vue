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
                    <a href="/services" class="nav-item nav-link">?????? ??????</a>
                    <a href="/desert" class="nav-item nav-link">?????? ?????????</a>
                    <a href="/gallery" class="nav-item nav-link">?????? ?????????</a>
                    <div class="nav-item dropdown">
                        <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">??????</a>
                        <div class="dropdown-menu m-0">
                            <a href="/koreaFood" class="dropdown-item">??????</a>
                            <a href="/chineseFood" class="dropdown-item">??????</a>
                            <a href="/japaneseFood" class="dropdown-item">??????</a>
                            <a href="/westernFood" class="dropdown-item">??????</a>
                        </div>
                    </div>
                    <a href="/qna" class="nav-item nav-link">??????&??????</a>
                </div>
                <div class=" d-none d-lg-flex">
                    <div class="flex-shrink-0 btn-lg-square border border-light rounded-circle">
                        <i class="fa fa-phone text-primary"></i>
                    </div>
                    <div class="ps-3">
                        <small class="text-primary mb-0">?????????</small>
                        <p class="text-light fs-5 mb-0">011-4132-1425</p>
                    </div>
                </div>
            </div>
        </nav>
        <!-- Navbar End -->


        <!-- Page Header Start -->
        <div class="container-fluid page-header py-6 wow fadeIn" data-wow-delay="0.1s">
            <div class="container text-center pt-5 pb-3">
                <h1 class="display-4 text-white animated slideInDown mb-3">??????&??????</h1>
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
            <!-- search ?????? div ?????? -->
            <div class="col-md-8 offset-2">
                <div class="input-group mb-3">
                    <!-- select box ?????? : v-model="searchSelect" -->
                    <div class="col-2">
                        <select class="form-select" v-model="searchSelect">
                            <option>question</option>
                            <option>questioner</option>
                        </select>
                    </div>

                    <!-- searchDname -> searchKeyword ?????? -->
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
                    <!--            Todo : ?????? ??? -->
                </div>
            </div>
            <!-- search ?????? div ??? -->

            <!--    Todo : page ??? ?????? -->
            <div class="col-md-12 offset-2">
                <div class="mb-3">
                    Items per Page:
                    <select v-model="pageSize" @change="handlePageSizeChange($event)">
                        <option v-for="size in pageSizes" :key="size" :value="size">
                            <!-- <!???            size : 3, 6, 9 ???> -->
                            {{ size }}
                        </option>
                    </select>
                </div>

                <b-pagination v-model="page" :total-rows="count" :per-page="pageSize" prev-text="Prev" next-text="Next"
                    @change="handlePageChange"></b-pagination>
            </div>
            <!-- <!???    Todo : page ??? ??? ???> -->

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
                                        class="badge rounded-pill bg-warning text-dark">??????</span></router-link>
                            </td>
                        </tr>
                    </tbody>
                </table>

                <router-link to="/add-qna/">
                    <h3><span class="badge rounded-pill bg-warning text-dark">??????</span></h3>
                </router-link>
            </div>
        </div>
        <!-- Contact End -->


        <!-- Footer Start -->
        <div class="container-fluid bg-dark text-light footer my-6 mb-0 py-5 wow fadeIn" data-wow-delay="0.1s">
            <div class="container py-5">
                <div class="row g-5">
                    <div class="col-lg-3 col-md-6">
                        <h4 class="text-light mb-4">?????????</h4>
                        <p class="mb-2"><i class="fa fa-map-marker-alt me-3"></i>??????????????? ???????????? ???????????????117</p>
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
                        <a class="btn btn-link" href="/services">?????? ??????</a>
                        <a class="btn btn-link" href="/desert">?????? ?????????</a>
                        <a class="btn btn-link" href="/gallery">?????? ?????????</a>
                        <a class="btn btn-link" href="/qna">??????&??????</a>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <h4 class="text-light mb-4"> ?????? </h4>
                        <a class="btn btn-link" href="/koreaFood">??????</a>
                        <a class="btn btn-link" href="/chineseFood">??????</a>
                        <a class="btn btn-link" href="/japaneseFood">??????</a>
                        <a class="btn btn-link" href="/westernFood">??????</a>
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

            // ???????????? ?????? ?????? ??????
            page: 1, // ?????? ?????????
            count: 0, // ?????? ????????? ??????
            pageSize: 3, // ??????????????? ????????? ????????? ???????????? ???????????? ??????

            pageSizes: [3, 6, 9], // select box ??? ?????? ?????? ?????????
        };
    },
    methods: {
        // axios , ?????? ?????? ?????? ?????? ??????
        retrieveQna() {
            QnaDataService.getAll(
                this.searchSelect, // select box ????????? ???
                this.searchKeyword, // ?????????
                this.page - 1,
                this.pageSize
            )
                // ???????????? .then() ????????? ?????????
                .then((response) => {
                    const { qna, totalItems } = response.data; // springboot ??? ????????? ??? ??????
                    this.qna = qna; // ????????????????????? ????????? ?????????
                    this.count = totalItems; // ????????????????????? ????????? ???????????????(??? ??????)
                    // ????????? ????????? ?????? ??????
                    console.log(response.data);
                })
                // ???????????? .catch() ??? ????????? ?????????
                .catch((e) => {
                    console.log(e);
                });
        },
        // select box ??? ????????? ???????????? ??????(?????????)
        handlePageSizeChange(event) {
            this.pageSize = event.target.value; // ??????????????? ?????? ??????(3, 6, 9)
            this.page = 1;
            // ????????? ?????? ??????
            this.retrieveQna();
        },
        // ????????? ?????? ????????? ???????????? ??????(?????????)
        handlePageChange(value) {
            this.page = value; // ????????????????????? ??????????????? ??????
            // ????????? ?????? ??????
            this.retrieveQna();
        },
    },
    // ????????? ???????????? ???????????? ?????????(????????? ????????? ??????) : mounted(), created()
    mounted() {
        this.retrieveQna(); // ?????? ????????? ?????? ???????????? ??????
        myBlog();
    },

}
</script>

<style lang="scss" scoped>
@import "../../assets/css/style.css";
</style>