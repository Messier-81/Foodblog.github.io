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
                <h1 class="display-4 text-white animated slideInDown mb-3">?????? ??????</h1>
                <nav aria-label="breadcrumb animated slideInDown">
                    <ol class="breadcrumb justify-content-center mb-0">
                        <li class="breadcrumb-item"><a class="text-white" href="/">Home</a></li>
                        <li class="breadcrumb-item"><a class="text-white" href="#">Pages</a></li>
                        <li class="breadcrumb-item text-primary active" aria-current="page">Services</li>
                    </ol>
                </nav>
            </div>
        </div>
        <!-- Page Header End -->

        <!-- ?????? ?????? -->
        <div class="container-xxl py-5">
            <div class="container">
                <div class="text-center mx-auto pb-4 wow fadeInUp" data-wow-delay="0.1s" style="max-width: 500px;">
                    <p class="section-title bg-white text-center text-primary px-3">?????? ??????</p>
                    <h1 class="mb-5">Gourmet Tour Best 6</h1>
                </div>
                <div class="row gy-5 gx-4">
                    <div class="col-lg-4 col-md-6 pt-5 wow fadeInUp" data-wow-delay="0.1s">
                        <div class="service-item d-flex h-100">
                            <div class="service-img">
                                <img class="img-fluid" src="../assets/img/service-1.jpg" alt="">
                            </div>
                            <div class="service-text p-5 pt-0">
                                <div class="service-icon">
                                    <img class="img-fluid rounded-circle" src="../assets/img/service-1.jpg" alt="">
                                </div>
                                <h4 class="mb-3">????????? ?????? ?????? ??????</h4>
                                <p class="mb-4">?????? ?????? ????????? ????????? ???????????????<br>
                                    ?????? ???????????? ????????? ????????? ???????????????<br>
                                    ?????? ??????:????????????, ????????????
                                </p>
                                <a class="btn btn-square rounded-circle"
                                    href="https://www.google.com/maps/place/%EC%82%B0%EB%8F%99%EC%99%84%ED%83%95%EA%B5%90%EC%9E%90%EA%B4%80/data=!4m5!3m4!1s0x0:0x29d5f089e38d9f16!8m2!3d35.119639!4d129.0427519"><i
                                        class="bi bi-chevron-double-right"></i></a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6 pt-5 wow fadeInUp" data-wow-delay="0.3s">
                        <div class="service-item d-flex h-100">
                            <div class="service-img">
                                <img class="img-fluid" src="../assets/img/service-2.jpg" alt="">
                            </div>
                            <div class="service-text p-5 pt-0">
                                <div class="service-icon">
                                    <img class="img-fluid rounded-circle" src="../assets/img/service-2.jpg" alt="">
                                </div>
                                <h5 class="mb-3">?????? ?????? ?????????</h5>
                                <p class="mb-4">???????????? ????????? ?????????<br>
                                    ????????? ???????????????<br>
                                    ?????? ??????:????????????, ?????????</p>
                                <a class="btn btn-square rounded-circle"
                                    href="https://www.google.com/maps/place/%EB%B0%94%EC%98%A4%ED%95%98%EC%9A%B0%EC%8A%A4/data=!4m5!3m4!1s0x0:0xeef2d1b168056b5c!8m2!3d35.1548874!4d129.063359"><i
                                        class="bi bi-chevron-double-right"></i></a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6 pt-5 wow fadeInUp" data-wow-delay="0.5s">
                        <div class="service-item d-flex h-100">
                            <div class="service-img">
                                <img class="img-fluid" src="../assets/img/service-3.jpg" alt="">
                            </div>
                            <div class="service-text p-5 pt-0">
                                <div class="service-icon">
                                    <img class="img-fluid rounded-circle" src="../assets/img/service-3.jpg" alt="">
                                </div>
                                <h5 class="mb-3">????????? ?????? ??? ??????</h5>
                                <p class="mb-4">?????? ????????? ???????????????<br>
                                    ?????? ???????????? ?????? ???????????? ????????????<br>
                                ????????????:????????? ??????</p>
                                <a class="btn btn-square rounded-circle"
                                    href="https://www.google.com/maps/place/%EB%B2%84%EA%B1%B0%EC%9D%B8%EB%89%B4%EC%9A%95/data=!4m5!3m4!1s0x0:0xb46c30468654d558!8m2!3d35.1609342!4d129.1646901"><i
                                        class="bi bi-chevron-double-right"></i></a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6 pt-5 wow fadeInUp" data-wow-delay="0.5s">
                        <div class="service-item d-flex h-100">
                            <div class="service-img">
                                <img class="img-fluid" src="../assets/img/service-4.jpg" alt="">
                            </div>
                            <div class="service-text p-5 pt-0">
                                <div class="service-icon">
                                    <img class="img-fluid rounded-circle" src="../assets/img/service-4.jpg" alt="">
                                </div>
                                <h5 class="mb-3">????????? ???????????????</h5>
                                <p class="mb-4">?????? ?????? ??? ???????????? ???????????? ?????????<br>
                                    ????????? ?????? ????????? ???????????????<br>
                                ?????? ??????:????????????, ?????????</p>
                                <a class="btn btn-square rounded-circle"
                                    href="https://www.google.com/maps/place/%EA%B5%90%EC%9E%90%EB%85%B8%EC%98%A4%EC%87%BC+%EB%82%9C%EB%B0%94+%EB%82%9C%EC%B9%B4%EC%9D%B4%EB%8F%84%EB%A6%AC%EC%A0%90/@34.6611932,135.5010072,15z/data=!4m5!3m4!1s0x0:0x86dee9a04b332c9d!8m2!3d34.6653198!4d135.5022722"><i
                                        class="bi bi-chevron-double-right"></i></a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6 pt-5 wow fadeInUp" data-wow-delay="0.5s">
                        <div class="service-item d-flex h-100">
                            <div class="service-img">
                                <img class="img-fluid" src="../assets/img/service-5.jpg" alt="">
                            </div>
                            <div class="service-text p-5 pt-0">
                                <div class="service-icon">
                                    <img class="img-fluid rounded-circle" src="../assets/img/service-5.jpg" alt="">
                                </div>
                                <h5 class="mb-3">?????????????????? ??????????????????</h5>
                                <p class="mb-4">????????? ????????? ????????????<br>
                                    ????????? ???????????? ????????? ?????? ?????? ?????????<br>
                                    ?????? ??????:?????? ??????+????????????</p>
                                <a class="btn btn-square rounded-circle"
                                    href="https://www.google.com/maps/place/%EC%BD%94%EC%BD%94%EC%9D%B4%EC%B0%8C%EB%B0%A9%EC%95%BC+%EC%95%95%EA%B5%AC%EC%A0%95%EB%A1%9C%EB%8D%B0%EC%98%A4%EC%A0%90/@37.5271129,127.0384891,15z/data=!4m2!3m1!1s0x0:0x25a54c9b3c8f4cd7?sa=X&ved=2ahUKEwimkurzoMH7AhUHAN4KHVbRDyIQ_BJ6BAg3EAg"><i
                                        class="bi bi-chevron-double-right"></i></a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6 pt-5 wow fadeInUp" data-wow-delay="0.5s">
                        <div class="service-item d-flex h-100">
                            <div class="service-img">
                                <img class="img-fluid" src="../assets/img/service-6.jpg" alt="">
                            </div>
                            <div class="service-text p-5 pt-0">
                                <div class="service-icon">
                                    <img class="img-fluid rounded-circle" src="../assets/img/service-6.jpg" alt="">
                                </div>
                                <h5 class="mb-3">????????? Tontei</h5>
                                <p class="mb-4">????????? ????????? ????????? ???????????? ????????????<br>
                                    ?????? ??????????????? ??????<br>
                                    ???????????????????????? ?????????!!<br>
                                ?????? ??????:????????????,?????????????????????</p>
                                <a class="btn btn-square rounded-circle"
                                    href="https://www.google.com/maps/place/Tontei/@34.6500543,135.5220708,15z/data=!4m2!3m1!1s0x0:0xfb7d0452341ec3c4?sa=X&hl=ko&ved=2ahUKEwj9yqTDocH7AhVYCt4KHVcwDT4Q_BJ6BAg7EAg"><i
                                        class="bi bi-chevron-double-right"></i></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- ?????? ??? -->

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
import myBlog from "../assets/js/main";
export default {
    mounted() {
        myBlog()
    },


}
</script>

<style lang="scss" scoped>
@import "../assets/css/style.css";
</style>