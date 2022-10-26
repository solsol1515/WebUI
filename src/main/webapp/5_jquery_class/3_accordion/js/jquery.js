$(function(){
	$('.accordion').each(function(){	// 따로 따로 쓸 때 each 함수 사용
		
		// each에서 각자 쓰고 싶을 때 this 사용
		let allDt = $(this).find('dt'); 
		let allDd = $(this).find('dd');
		
		allDd.hide();
		allDd.first().show();

		allDt.css({'cursor':'pointer'}); // 커서를 포인터로 바꾸기
		
		// 클릭 이벤트
		allDt.click(function(){
			// alert('click')
			allDd.hide();
			//$(this).next().show(); // 바로 다음 요소 찾기 > 보여주기
			//$(this).next().fadeIn(); // 바로 다음 요소 찾기 > 보여주기(나타내기 효과)
			//$(this).next().slideDown(); // 바로 다음 요소 찾기 > 보여주기(슬라이드 효과)
			$(this).next().toggle(); // 바로 다음 요소 찾기 > 보여주기
		});
		
	})
})