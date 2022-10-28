$(function(){
	
	// 1. 오늘 날짜 출력하기
	let now = new Date();
	
	let year = now.getFullYear(); // 연
	$('.year').eq(0).text(year);
	
	let month = (now.getMonth()+1); // 월
	$('.month').eq(0).text(month);
	
	let date = now.getDate(); // 일
	$('.date').eq(0).text(date);
	
	
	// 2.  포커스 가면 ‘검색어를 입력하세요’를 안보이고 다시 포커스가 없으면 다시 출력
		
	$('#keyword').focus(function(){
		$(this).css({"background":"url('')"});
	});
	
	$('#keyword').on('blur', function(){
		$(this).css({"background":'url("./images/sch_guide.gif") no-repeat'});
	});
	
	
	// 3. 탭팬 구현
	/*
	let tabs = tab.find('dt.tab_btn1 > a > img'); // 탭 찾기
	let panel = tab.find('tab li:eq(0)'); // 하단의 내용*/

        $('#tabmenu>dt>a>img').click(function() {
           var src = $(this).attr('src');
            $(this).attr("src", src.replace("out","over"));
            var ori=$('#tabmenu>dt[name="on"]>a>img')
            ori.attr("src",ori.attr("src").replace("over","out"));
         })
         
      $('#tabmenu dt').click(function(){
         $('#tabmenu dd').hide();
         $(this).next('dd').show();
         $('#tabmenu dt[name="on"]').removeAttr('name');
         $(this).attr('name','on');
      });
  
  
	// 4. 이미지슬라이드 구현

	$('#best_bg > ul').bxSlider({
     auto: true,
     autoControls: true,
     stopAutoOnClick: true,
     pager: true,
     slideWidth: 600,
     minSlides: 5,
     maxSlides: 5,
     slideMargin: 10
    });
	    
	    
	// 5. [로그인]을 누르면 로그인 창이 보이고 [Close]를 누르면 다시 안 보임
	$("li.login_wrap a img").click(function(){
      $("form#login_f").css("top","20px");
   })
   $(".login_close_btn a img").click(function(){
      $("form#login_f").css("top","-250px");
   })
	
	// 6. [전체메뉴]를 선택하면 전체메뉴가 보이고 [Close] 누르면 다시 안 보임
	$('img[alt="전체메뉴"]').click(function(){ // 전체메뉴 누르면 전체메뉴 창 보임
      $('#total_menu').show();
      })
    $('img[alt="전체메뉴 닫기"]').click(function(){ // 전체메뉴 닫기 누르면 전체메뉴 창 안보임
      $('#total_menu').hide();
      })
	
	// 7. 그 외 추가적으로 구현하면 해당 화면 캡쳐하고 코드를 작성합니다.
	
	
})