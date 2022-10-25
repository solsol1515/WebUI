$(document).ready(function(){
	
	$('p#intro').animate({
		padding : '20px',
		fontsize : '30px'
	}, 2000);
	$('#navigation > ul > li').hover(function(){
		// 마우스 올라갔을 때
		$(this).animate({paddingLeft:'+=30px'}, 200); // 기존 값에 15px 더해서 계산
	}, function(){
		// 마우스 내려갔을 때
		$(this).animate({paddingLeft:'-=30px'}, 200); // 기존 값에 15px 뻬서 계산
	});
	
})

// 고정 퀵 메뉴 원리 
	$(window).scroll(function(){
		$('#navigation').css({'top':$(document).scrollTop()});
	});