$(function(){
   //이미지에 마우스를 올리거나 내릴 때 : hover( function, function )
   $('img').hover(
   /*마우스를 올렸을 때*/
   function(){
      var src = $(this).attr('src');                  //이미지 주소값 불러오기(.attr)
      $(this).attr('src',src.replace('off','on'));    //off → on으로 바꿔줌(.attr(a, b))
   },
   /*마우스를 내렸을 때*/
   function(){
      var src = $(this).attr('src');                  //이미지 주소값 불러오기(.attr)
      $(this).attr('src',src.replace('on','off'));    //on → off로 바꿔줌(.attr(b, a))
   })
})

/* 5조
$(function() {
	$(".header .menu li img").hover(function() {
		var src = $(this).attr("src");
		$(this).attr("src", src.replace("off", "on"));
	}, function() {
		var src = $(this).attr("src");
		$(this).attr("src", src.replace("on", "off"));
	});
});

------------------------------------------------------------
$ (function() {
	
	$('.menu > li > a > img').hover(function() {
		let src = $(this).attr('src');
		$(this).attr('src', src.replace('off','on'));		
	}, function(){
		let src = $(this).attr('src');
		$(this).attr('src', src.replace('on','off'));	
	});
})
------------------------------------------------------------
7조 
$(function(){
	$(".header ul.menu > li > a > img" ).hover(function(){
		var src = $(this).attr('src');
			$(this).attr('src',src.replace('_off','_on'));
		
	},function(){
		var src = $(this).attr('src');
			$(this).attr('src',src.replace('_on','_off'));
	  });
	});
*/
