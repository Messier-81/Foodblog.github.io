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


        <!-- Carousel Start -->
        <div class="container-fluid p-0 pb-5 wow fadeIn" data-wow-delay="0.1s">
            <div class="owl-carousel header-carousel position-relative">
                <div class="owl-carousel-item position-relative">
                    <img class="img-fluid" src="img/carousel-1.jpg" alt="">
                    <div class="owl-carousel-inner">
                        <div class="container">
                            <div class="row justify-content-start">
                                <div class="col-lg-8">
                                    <p class="text-primary text-uppercase fw-bold mb-2">// The Best Gourmet Food
                                        Reviewer</p>
                                    <h1 class="display-1 text-light mb-4 animated slideInDown">BEST 음식점 </h1>
                                    <p class="text-light fs-5 mb-4 pb-3">직접 가본 곳만을 추천하는 부산 음식점 추천 블로그입니다.</p>
                                    <a href="/services" class="btn btn-primary rounded-pill py-3 px-5">Read More</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="owl-carousel-item position-relative">
                    <img class="img-fluid" src="img/carousel-2.jpg" alt="">
                    <div class="owl-carousel-inner">
                        <div class="container">
                            <div class="row justify-content-start">
                                <div class="col-lg-8">
                                    <p class="text-primary text-uppercase fw-bold mb-2">// The Best Gourmet Food
                                        Reviewer</p>
                                    <h1 class="display-1 text-light mb-4 animated slideInDown">BEST 디저트 </h1>
                                    <p class="text-light fs-5 mb-4 pb-3">다시 가보고 싶은 디저트 가게를 추천해드립니다!</p>
                                    <a href="/desert" class="btn btn-primary rounded-pill py-3 px-5">Read More</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Carousel End -->


        <!-- Facts Start -->
        <div class="container-xxl py-6">
            <div class="container">
                <div class="row g-4">
                    <div class="col-lg-3 col-md-6 wow fadeIn" data-wow-delay="0.1s">
                        <div class="fact-item bg-light rounded text-center h-100 p-5">
                            <i class="fa fa-thumbs-up fa-4x text-primary mb-4"></i>
                            <p class="mb-2">추천 방문자수</p>
                            <h1 class="display-5 mb-0" data-toggle="counter-up">57</h1>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 wow fadeIn" data-wow-delay="0.3s">
                        <div class="fact-item bg-light rounded text-center h-100 p-5">
                            <i class="fa fa-user fa-4x text-primary mb-4"></i>
                            <p class="mb-2">일일 방문자수</p>
                            <h1 class="display-5 mb-0" data-toggle="counter-up">125</h1>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 wow fadeIn" data-wow-delay="0.5s">
                        <div class="fact-item bg-light rounded text-center h-100 p-5">
                            <i class="fa fa-user-circle fa-4x text-primary mb-4"></i>
                            <p class="mb-2">월간 방문자수</p>
                            <h1 class="display-5 mb-0" data-toggle="counter-up">2328</h1>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 wow fadeIn" data-wow-delay="0.7s">
                        <div class="fact-item bg-light rounded text-center h-100 p-5">
                            <i class="fa fa-users fa-4x text-primary mb-4"></i>
                            <p class="mb-2">총 방문자수</p>
                            <h1 class="display-5 mb-0" data-toggle="counter-up">77357</h1>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Facts End -->


        <!-- About Start -->
        <div class="container-xxl py-6">
            <div class="container">
                <div class="row g-5">
                    <div class="col-lg-6 wow fadeInUp" data-wow-delay="0.1s">
                        <div class="row img-twice position-relative h-100">
                            <div class="col-6">
                                <img class="img-fluid rounded" src="img/about-1.jpg" alt="">
                            </div>
                            <div class="col-6 align-self-end">
                                <img class="img-fluid rounded" src="img/about-2.jpg" alt="">
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6 wow fadeInUp" data-wow-delay="0.5s">
                        <div class="h-100">
                            <p class="text-primary text-uppercase mb-2">// 리뷰에 관하여</p>
                            <h1 class="display-6 mb-4"> 리뷰는 음식점이 추구하는 것이 무엇인지 생각하며 작성했습니다.</h1>
                            <p>좋은 음식 리뷰는 좋은 식당을 찾는 데 도움이 되는 글입니다.</p>
                            <p>식당에 대한 편견을 갖지 않고 전체적으로 평가합니다.</p>
                            <p>개인적인 취향이 들어갈 수 있습니다.</p>
                            <div class="row g-2 mb-4">
                                <div class="col-sm-6">
                                    <i class="fa fa-check text-primary me-2"></i> 서비스
                                </div>
                                <div class="col-sm-6">
                                    <i class="fa fa-check text-primary me-2"></i>음식 가격
                                </div>
                                <div class="col-sm-6">
                                    <i class="fa fa-check text-primary me-2"></i>음식 퀄리티
                                </div>
                                <div class="col-sm-6">
                                    <i class="fa fa-check text-primary me-2"></i>분위기
                                </div>
                            </div>
                            <a class="btn btn-primary rounded-pill py-3 px-5" href="">Read More</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- About End -->


        <!-- Product Start -->
        <div class="container-xxl bg-light my-6 py-6 pt-0">
            <div class="container">
                <div class="bg-primary text-light rounded-bottom p-5 my-6 mt-0 wow fadeInUp" data-wow-delay="0.1s">
                    <div class="row g-4 align-items-center">
                        <div class="col-lg-6">
                            <h1 class="display-4 text-light mb-0"><span id="typed1"></span></h1>
                        </div>
                        <div class="col-lg-6 text-lg-end">
                            <div class="d-inline-flex align-items-center text-start">
                                <i class="fa fa-phone-alt fa-4x flex-shrink-0"></i>
                                <div class="ms-4">
                                    <p class="fs-5 fw-bold mb-0">Call Me</p>
                                    <p class="fs-1 fw-bold mb-0">011-4132-1425</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="text-center mx-auto mb-5 wow fadeInUp" data-wow-delay="0.1s" style="max-width: 500px;">
                    <p class="text-primary text-uppercase mb-2">// 여러가지 테마</p>
                    <h1 class="text1 display-6 mb-4">다양한 종류의 음식 리뷰</h1>
                </div>
                <div class="row g-4">
                    <div class="col-lg-3 col-md-6 wow fadeInUp" data-wow-delay="0.1s">
                        <div class="product-item d-flex flex-column bg-white rounded overflow-hidden h-100">
                            <div class="text-center p-4">
                                <div class="d-inline-block border border-primary rounded-pill px-3 mb-3"> No.1 </div>
                                <h3 class="mb-3">한식</h3>
                                <span>든든한 한끼가 먹고 싶을때</span>
                            </div>
                            <div class="position-relative mt-auto">
                                <img class="img-fluid" src="img/product-1.jpg" alt="">
                                <div class="product-overlay">
                                    <a class="btn btn-lg-square btn-outline-light rounded-circle" href="/koreaFood"><i
                                            class="fa fa-eye text-primary"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 wow fadeInUp" data-wow-delay="0.3s">
                        <div class="product-item d-flex flex-column bg-white rounded overflow-hidden h-100">
                            <div class="text-center p-4">
                                <div class="d-inline-block border border-primary rounded-pill pt-1 px-3 mb-3"> No.2
                                </div>
                                <h3 class="mb-3">중식</h3>
                                <span>기름진 음식이 땡길때</span>
                            </div>
                            <div class="position-relative mt-auto">
                                <img class="img-fluid" src="img/product-2.jpg" alt="">
                                <div class="product-overlay">
                                    <a class="btn btn-lg-square btn-outline-light rounded-circle" href="/chineseFood"><i
                                            class="fa fa-eye text-primary"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 wow fadeInUp" data-wow-delay="0.5s">
                        <div class="product-item d-flex flex-column bg-white rounded overflow-hidden h-100">
                            <div class="text-center p-4">
                                <div class="d-inline-block border border-primary rounded-pill pt-1 px-3 mb-3"> No.3
                                </div>
                                <h4 class="mb-3">일식</h4>
                                <span>깔끔한 한끼가 생각날때</span>
                            </div>
                            <div class="position-relative mt-auto">
                                <img class="img-fluid" src="img/product-3.jpg" alt="">
                                <div class="product-overlay">
                                    <a class="btn btn-lg-square btn-outline-light rounded-circle"
                                        href="/japaneseFood"><i class="fa fa-eye text-primary"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 wow fadeInUp" data-wow-delay="0.5s">
                        <div class="product-item d-flex flex-column bg-white rounded overflow-hidden h-100">
                            <div class="text-center p-4">
                                <div class="d-inline-block border border-primary rounded-pill pt-1 px-3 mb-3"> No.4
                                </div>
                                <h4 class="mb-3">양식</h4>
                                <span>특별한 한끼가 생각 날때</span>
                            </div>
                            <div class="position-relative mt-auto">
                                <img class="img-fluid" src="img/product-4.jpg" alt="">
                                <div class="product-overlay">
                                    <a class="btn btn-lg-square btn-outline-light rounded-circle" href="/westernFood"><i
                                            class="fa fa-eye text-primary"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Product End -->


        <!-- Testimonial Start -->
        <div class="container-xxl bg-light my-6 py-6 pb-0">
            <div class="container">
                <div class="text-center mx-auto mb-5 wow fadeInUp" data-wow-delay="0.1s" style="max-width: 500px;">
                    <p class="text-primary text-uppercase mb-2">// 방문자 리뷰</p>
                    <h1 class="display-6 mb-4">2000명 이상의 방문자가<br> 좋아합니다.</h1>
                </div>
                <div class="owl-carousel testimonial-carousel wow fadeInUp" data-wow-delay="0.1s">
                    <div class="testimonial-item bg-white rounded p-4">
                        <div class="d-flex align-items-center mb-4">
                            <img class="flex-shrink-0 rounded-circle border p-1" src="img/testimonial-1.jpg" alt="">
                            <div class="ms-4">
                                <h5 class="mb-1">Client Name</h5>
                                <span>Profession</span>
                            </div>
                        </div>
                        <p class="mb-0">Tempor erat elitr rebum at clita. Diam dolor diam ipsum sit diam amet diam et
                            eos. Clita erat ipsum et lorem et sit.</p>
                    </div>
                    <div class="testimonial-item bg-white rounded p-4">
                        <div class="d-flex align-items-center mb-4">
                            <img class="flex-shrink-0 rounded-circle border p-1" src="img/testimonial-2.jpg" alt="">
                            <div class="ms-4">
                                <h5 class="mb-1">Client Name</h5>
                                <span>Profession</span>
                            </div>
                        </div>
                        <p class="mb-0">Tempor erat elitr rebum at clita. Diam dolor diam ipsum sit diam amet diam et
                            eos. Clita erat ipsum et lorem et sit.</p>
                    </div>
                    <div class="testimonial-item bg-white rounded p-4">
                        <div class="d-flex align-items-center mb-4">
                            <img class="flex-shrink-0 rounded-circle border p-1" src="img/testimonial-3.jpg" alt="">
                            <div class="ms-4">
                                <h5 class="mb-1">Client Name</h5>
                                <span>Profession</span>
                            </div>
                        </div>
                        <p class="mb-0">Tempor erat elitr rebum at clita. Diam dolor diam ipsum sit diam amet diam et
                            eos. Clita erat ipsum et lorem et sit.</p>
                    </div>
                    <div class="testimonial-item bg-white rounded p-4">
                        <div class="d-flex align-items-center mb-4">
                            <img class="flex-shrink-0 rounded-circle border p-1" src="img/testimonial-4.jpg" alt="">
                            <div class="ms-4">
                                <h5 class="mb-1">Client Name</h5>
                                <span>Profession</span>
                            </div>
                        </div>
                        <p class="mb-0">Tempor erat elitr rebum at clita. Diam dolor diam ipsum sit diam amet diam et
                            eos. Clita erat ipsum et lorem et sit.</p>
                    </div>
                </div>
                <div class="bg-primary text-light rounded-top p-5 my-6 mb-0 wow fadeInUp" data-wow-delay="0.1s">
                    <div class="row align-items-center">
                        <div class="col-md-6">
                            <h1 class="display-4 text-light mb-0">블로그 소식을 먼저 받아 보세요!</h1>
                        </div>
                        <div class="col-md-6 text-md-end">
                            <div class="position-relative">
                                <input class="form-control bg-transparent border-light w-100 py-3 ps-4 pe-5" type="text"
                                    placeholder="Your email">
                                <button type="button"
                                    class="btn btn-dark py-2 px-3 position-absolute top-0 end-0 mt-2 me-2">SignUp</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Testimonial End -->


        <!-- Google Map Start -->
        <div class="container-xxl py-6 px-0 wow fadeInUp" data-wow-delay="0.1s">
            <iframe class="w-100 mb-n2" style="height: 450px;"
                src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d203.8852765159273!2d129.0596186113969!3d35.1525198844009!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3568eb708afe51fb%3A0x977150933828e443!2z64-Z7ISx7KeB7JeF7KCE66y47ZWZ6rWQ!5e0!3m2!1sko!2skr!4v1669083108403!5m2!1sko!2skr"
                frameborder="0" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
        </div>
        <!-- Google Map End -->


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
import typed3 from "../assets/js/typed3";
export default {
    mounted() {
        myBlog(),
        typed3()
    }
}
</script>

<style lang="scss" scoped>
@import "../assets/css/style.css";
</style>
