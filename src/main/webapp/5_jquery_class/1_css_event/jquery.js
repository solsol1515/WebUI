$(function(){
	
	/* 1조
	$('#hideButton').click(function(){
		$('#intro').hide();
	});*/
	
	// 2조
	$('#hideButton').click(function(){
		$('#intro img').hide();
	});
	
	$('#showButton').click(function(){
		$('#intro img').show();
	});
	
	/*$('#toggleButton').click(function(){
		$('#intro img').toggle();
	});*/
	
	/* 3조
	$('#toggleButton').click(function(){
		$('#intro').toggle();
		$('#navigation').toggle();
	});*/
	
	//
	$('#toggleButton').click(function(){
		if( $('#intro').is(':visible'))
		{
			$('#intro').fadeOut(1000);
		}else{
			$('#intro').fadeIn(1000);
		}
	});
	
	// 테이블의 내용 중 홀수 행의 배경색 지정
/*	$('#celebs table.data > tbody > tr:even').css({'background':'lightblue'}) 
	// 홀수 번째 행에 색 입히기 위해서 0번째 인덱스에서부터 시작하기때문에 짝수번째인 even 사용
	$('#celebs table.data > tbody > tr:odd').css({'background':'lightyellow'})
*/	
//	$('#celebs table.data > tbody > tr:even').addClass('table_striping')
	
	// 마우스가 올라갔을 때 배경색 바뀌고 다시 나오면 원래 색으로
	$('#celebs tr').hover(function(){
		$(this).addClass('td_mouseover');
	}, function(){
		$(this).removeClass('td_mouseover');
	})
})
	