$(document).ready(function(){
	// 글씨체 조정
	$('fontStyle').change(function(){
		$('#txt').css({
			'font-family':$(this).val()
			});
	});
	
	// 글자 크기 조정
	$('.fontSize > button:first').click(function(){
		$('#txt').css({'font-size':'+=1px'});
	}); 
	
	$('.fontSize > button:last').click(function(){
		$('#txt').css({'font-size':'-=1px'});
	}); 
	
	//글씨체 조정
	$('#fontstyle').change(function(){
		$('#txt').css({
			'font-family' : $(this).val()
		});
	});
})



/*$(function(){
	
	let fontsize = 10; // 기본 폰트 사이즈를 10px로 지정
	
	// 글씨크기 증감 버튼
	$('.fontsize eq(0)').click(function(){ // + 버튼을 눌렀을 때
		alert('+++');
		fontsize++; // fontsize가 1씩 증가
		// $(this).animate({fontsize:'+=1'},200);
	});
	
	$('.fontsize eq(1)').click(function(){ // - 버튼을 눌렀을 때	
				alert('---');
			fontsize--;
		// $(this).animate({fontsize:'-=1'},200);
		
		});

});*/

/*$(document).ready(function(){
	// 글자 크기 조정
	$('.fontSize > button:first').click(function(){
		//alert('ok');
		$('#txt').css({'font-size':'+=1px'});
	});
	
	$('.fontSize > button:last').click(function(){
		//alert('ok');
		$('#txt').css({'font-size':'-=2px'});
	});
	
	//글씨체 조정
	$('#fontstyle').change(function(){
		$('#txt').css({
			'font-family' : $(this).val()
		});
	});
	
	
});*/

