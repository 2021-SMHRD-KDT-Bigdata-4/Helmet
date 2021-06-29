<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>대여소별 안전모 현황</title>

<!-- load stylesheets -->
<link rel="stylesheet"
   href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700">
<!-- Google web font "Open Sans" -->
<link rel="stylesheet"
   href="font-awesome-4.7.0/css/font-awesome.min.css">
<!-- Font Awesome -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- Bootstrap style -->
<link rel="stylesheet" type="text/css" href="css/datepicker.css" />
<link rel="stylesheet" type="text/css" href="slick/slick.css" />
<link rel="stylesheet" type="text/css" href="slick/slick-theme.css" />
<link rel="stylesheet" href="css/templatemo-style.css">
<script
   src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
   src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">

   
   function helmetjoinFn() {
      
      var helmetid = $("#helmetid").val();
      var helmetsize = $("#helmetsize").val();
      var loss = $("#loss").val();
      var helmetregister = $("#helmetregister").val();
      var disinfection = $("#disinfection").val();
      var rentalshopid = $("#rentalshopid").val();

      $.ajax({
         url : "helmetjoin.go",
         type : "post",
         data : {
            "helmetid" : helmetid,
            "helmetsize" : helmetsize,
            "loss" : loss,
            "helmetregister" : helmetregister,
            "disinfection" : disinfection,
            "rentalshopid" : rentalshopid
         },
         success: function(data) {
            alert("헬멧등록에 성공했습니다!");
            location.href = "adminpage.jsp"
         },

         error : function() {
            alert("헬멧등록실패!");
         }
      });

   }

   
   
</script>
</head>
<body>

   <div class="tm-main-content" id="top">
      <div class="tm-top-bar-bg"></div>
      <div class="tm-top-bar" id="tm-top-bar">
         <div class="container">
            <div class="row">
               <nav class="navbar navbar-expand-lg narbar-light">
                  <a class="navbar-brand mr-auto" href="main.jsp"> <img
                     src="img/logo1.png" alt="Site logo"> FindHelmet
                  </a>
                  <button type="button" id="nav-toggle"
                     class="navbar-toggler collapsed" data-toggle="collapse"
                     data-target="#mainNav" aria-expanded="false"
                     aria-label="Toggle navigation">
                     <span class="navbar-toggler-icon"></span>
                  </button>
                  <div id="mainNav" class="collapse navbar-collapse tm-bg-white">
                     <ul class="navbar-nav ml-auto">
                        <li class="nav-item"><a class="nav-link" href="#"
                           onclick="logoutFn()">Logout</a></li>
                        <li class="nav-item"><a class="nav-link active"
                           href="adminmypage.jsp">Mypage <span class="sr-only">(current)</span>
                        </a></li>
                        <li class="nav-item"><a class="nav-link" href="main.jsp">Place</a></li>
                        <li class="nav-item"><a class="nav-link" href="main.jsp">Rent</a></li>
                        <li class="nav-item"><a class="nav-link" href="main.jsp">Contact
                              Us</a></li>
                     </ul>
                  </div>
               </nav>
            </div>
         </div>
      </div>
      <div class="tm-page-wrap mx-auto">
         <section>
            <div class="row tm-banner-row-mypage tm-banner-row-header-mypage">
               <div class="tm-banner-header-mypage">
                  <ul class="navbar-nav-mypage ml-auto">
                     <li class="nav-item"><a class="nav-link"
                        href="adminpage.jsp">대여소별 안전모 현황</a></li>
                     <li class="nav-item"><a class="nav-link active"
                        href="adminpage2.jsp">대여소 관리 <span class="sr-only">(current)</span>
                     </a></li>
                     <li class="nav-item"><a class="nav-link"
                        href="adminpage3.jsp">안전모 관리</a></li>
                     <li class="nav-item"><a class="nav-link"
                        href="adminpage4.jsp">회원 정보 관리</a></li>
                     <li class="nav-item"><a class="nav-link"
                        href="adminpage5.jsp">대여소 추천</a></li>
                  </ul>
               </div>
            </div>
         </section>

         <section class="tm-banner">
            <div class="tm-container-outer tm-banner-bg-mypage">
               <div>

                  <form action="helmet.jsp" method="get"
                     class="tm-search-form-join tm-section-pad-3" id="mypage">
                     <div class="form-row-main tm-search-form-row">
                        <div id="mypage2">
                        
                           <h2>JOIN</h2>
                           <div class="helmetidForm">
                              <input type="text" class="helmetid" placeholder="helmetid"
                                 id="helmetid" name="helmetid">
                           </div>
                           <div class="helmetsizeForm">
                              <input type="text" class="helmetsize" placeholder="helmetsize"
                                 id="helmetsize" name="helmetsize">
                           </div>
                           <div class="lossForm">
                              <input type="text" class="loss" placeholder="loss" id="loss"
                                 name="loss">
                           </div>
                           <div class="helmetregisterForm">
                              <input type="text" class="helmetregister"
                                 placeholder="helmetregister" id="helmetregister"
                                 name="helmetregister">
                           </div>
                           <div class="disinfectionForm">
                              <input type="text" class="disinfection"
                                 placeholder="disinfection" id="disinfection"
                                 name="disinfection">
                           </div>
                           <div class="rentalshopidForm">
                              <input type="text" class="rentalshopid"
                                 placeholder="rentalshopid" id="rentalshopid"
                                 name="rentalshopid">
                           </div>

                        </div>
                     </div>

                     <div class="form-row tm-search-form-row">
                        <div
                           class="form-group tm-form-group tm-form-group-pad tm-form-group-2">
                           <label for="btnSubmit">&nbsp;</label>

                           <button type="button"
                              class="btn btn-primary tm-btn tm-btn-search text-uppercase"
                              id="btnwatch" onclick="helmetjoinFn()">확인</button>
                           <button type="submit"
                              class="btn btn-primary tm-btn tm-btn-search text-uppercase"
                              id="btncancel" onclick=""
                              location.href='http://localhost:8081/new_helmet/adminpage.jsp'">취소</button>
                        </div>
                     </div>
                  </form>


               </div>
            </div>
         </section>
         <section class="p-5 tm-container-outer tm-bg-gray">
            <div class="container">
               <div class="row">
                  <div class="col-xs-12 mx-auto tm-about-text-wrap text-center">
                     <h2 class="text-uppercase mb-4">
                        <br>
                     </h2>
                     <p class="mb-4"></p>
                  </div>
               </div>
            </div>
         </section>
      </div>
   </div>
   <footer class="tm-container-outer">
      <p class="mb-0">
         Copyright © <span class="tm-current-year">2018</span> Your Company .
         Designed by <a rel="nofollow"
            href="http://www.google.com/+templatemo" target="_parent">Template
            Mo</a>
      </p>
   </footer>
   </div>
   </div>
   <!-- .main-content -->

   <!-- load JS files -->
   <script src="js/jquery-1.11.3.min.js"></script>
   <!-- jQuery (https://jquery.com/download/) -->
   <script src="js/popper.min.js"></script>
   <!-- https://popper.js.org/ -->
   <script src="js/bootstrap.min.js"></script>
   <!-- https://getbootstrap.com/ -->
   <script src="js/datepicker.min.js"></script>
   <!-- https://github.com/qodesmith/datepicker -->
   <script src="js/jquery.singlePageNav.min.js"></script>
   <!-- Single Page Nav (https://github.com/ChrisWojcik/single-page-nav) -->
   <script src="slick/slick.min.js"></script>
   <!-- http://kenwheeler.github.io/slick/ -->
   <script src="js/jquery.scrollTo.min.js"></script>
   <!-- https://github.com/flesler/jquery.scrollTo -->
   <script>
      /* Google Maps
      ------------------------------------------------*/
      var map = '';
      var center;

      function initialize() {
         var mapOptions = {
            zoom : 16,
            center : new google.maps.LatLng(37.769725, -122.462154),
            scrollwheel : false
         };

         map = new google.maps.Map(document.getElementById('google-map'),
               mapOptions);

         google.maps.event.addDomListener(map, 'idle', function() {
            calculateCenter();
         });

         google.maps.event.addDomListener(window, 'resize', function() {
            map.setCenter(center);
         });
      }

      function calculateCenter() {
         center = map.getCenter();
      }

      function loadGoogleMap() {
         var script = document.createElement('script');
         script.type = 'text/javascript';
         script.src = 'https://maps.googleapis.com/maps/api/js?key=AIzaSyDVWt4rJfibfsEDvcuaChUaZRS5NXey1Cs&v=3.exp&sensor=false&'
               + 'callback=initialize';
         document.body.appendChild(script);
      }

      /* DOM is ready
      ------------------------------------------------*/
      $(function() {

         // Change top navbar on scroll
         $(window).on("scroll", function() {
            if ($(window).scrollTop() > 100) {
               $(".tm-top-bar").addClass("active");
            } else {
               $(".tm-top-bar").removeClass("active");
            }
         });

         // Smooth scroll to search form
         $('.tm-down-arrow-link').click(function() {
            $.scrollTo('#tm-section-search', 300, {
               easing : 'linear'
            });
         });

         // Date Picker in Search form
         var pickerCheckIn = datepicker('#inputCheckIn');
         var pickerCheckOut = datepicker('#inputCheckOut');

         // Update nav links on scroll
         $('#tm-top-bar').singlePageNav({
            currentClass : 'active',
            offset : 60
         });

         // Close navbar after clicked
         $('.nav-link').click(function() {
            $('#mainNav').removeClass('show');
         });

         // Slick Carousel
         $('.tm-slideshow').slick({
            infinite : true,
            arrows : true,
            slidesToShow : 1,
            slidesToScroll : 1
         });

         loadGoogleMap(); // Google Map                
         $('.tm-current-year').text(new Date().getFullYear()); // Update year in copyright           
      });
   </script>

</body>
</html>