<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Food Advisor</title>
    
        <!-- font awesome cdn link  -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    
        <!-- custom css file link  -->
        <link rel="stylesheet" href="assets/css/style.css">
    
    </head>
<body>

    <!-- header section starts  -->

<header>

    <a href="#" class="logo"><i class="fas fa-utensils"></i>food advisor</a>

    <div id="menu-bar" class="fas fa-bars"></div>

    <nav class="navbar">
        <a href="index.html">home</a>
        <a href="index.html#restaurants">restaurants</a>
        <a href="#review">review</a>
    </nav>

</header>

  
<!-- popular section starts  -->

<section class="popular" id="popular">

    <h1 class="heading"> most <span>popular</span> foods </h1>

    <div class="box-container">

        <div class="box">
            <span class="price"> $5 - $20 </span>
            <img src="assets/images/p-1.jpg" alt="">
            <h3>tasty burger</h3>
            <div class="stars">
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="far fa-star"></i>
            </div>
            <a href="#" class="btn">order now</a>
        </div>
        <div class="box">
            <span class="price"> $5 - $20 </span>
            <img src="assets/images/p-2.jpg" alt="">
            <h3>tasty cakes</h3>
            <div class="stars">
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="far fa-star"></i>
            </div>
        </div>
        <div class="box">
            <span class="price"> $5 - $20 </span>
            <img src="assets/images/p-3.jpg" alt="">
            <h3>tasty sweets</h3>
            <div class="stars">
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="far fa-star"></i>
            </div>
        </div>
        <div class="box">
            <span class="price"> $5 - $20 </span>
            <img src="assets/images/p-4.jpg" alt="">
            <h3>tasty cupcakes</h3>
            <div class="stars">
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="far fa-star"></i>
            </div>
        </div>
        <div class="box">
            <span class="price"> $5 - $20 </span>
            <img src="assets/images/p-5.jpg" alt="">
            <h3>cold drinks</h3>
            <div class="stars">
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="far fa-star"></i>
            </div>
        </div>
        <div class="box">
            <span class="price"> $5 - $20 </span>
            <img src="assets/images/p-6.jpg" alt="">
            <h3>cold ice-cream</h3>
            <div class="stars">
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="far fa-star"></i>
            </div>
        </div>

    </div>

</section>

<!-- popular section ends -->




<!-- review section starts  -->

<section class="review" id="review">

    <h1 class="heading"> restaurant <span>reviews</span> </h1>

    <div class="box-container">

        <div class="box">
            <img src="assets/images/pic1.png" alt="">
            <h3>mona linda</h3>
            <div class="stars">
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="far fa-star"></i>
            </div>
            <p>I think this site is known to all food lovers in calais. The volume of information presented in it about everything that may be needed when choosing a restaurant.</p>
        </div>
        <div class="box">
            <img src="assets/images/pic2.png" alt="">
            <h3>Adam Ryan</h3>
            <div class="stars">
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="far fa-star"></i>
            </div>
            <p>Never leave without checking on FoodAdvisor first. Others comments are always very welcomed and are a must! FoodAdvisor is very well done and you can easily find what you are looking for.</p>
        </div>
        <div class="box">
            <img src="assets/images/pic3.png" alt="">
            <h3>Elisabeth Neveux</h3>
            <div class="stars">
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="fas fa-star"></i>
                <i class="far fa-star"></i>
            </div>
            <p>I really find food advisor fantastic for one reason. Frequently you go to places, and you want to give great feedback, because you want people to enjoy the same fantastic experience..</p>
        </div>
        

    </div>

</section>

<!-- review section ends -->



<!-- footer section  -->

<section class="footer">

    <h1 class="credit"> created by <span> TeamI6 </span> | all rights reserved! </h1>

</section>

<!-- scroll top button  -->
<a href="#gallery" class="fas fa-angle-up" id="scroll-top"></a>

<!-- loader  -->
<div class="loader-container">
    <img src="assets/images/loader.gif" alt="">
</div>





<!-- custom js file link  -->
<script src="assets/js/script.js"></script>
    
</body>
</html>