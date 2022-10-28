$(function(){
	
	$('#signup > form').validate({
		rules:{
			name 	: {required: true},
			email	: {required: true,
				   	  email    : true // 유효한 이메일 형식 필터링
				  	 },
			website	: {url	   : true},
			password: {
				minlength:6,
				maxlength:12	
			},
			passconf:{equalTo  : '#password'}
		},
		success:function(label){
			label.addClass('valid');
			label.text('성공');
		}
		
	});
	
	// ------------------------------------------------------------------------------
	// attr() > prop()
	
	/*$('.check-all').click(function(){
		if($('.check-all').is(':checked')){
			$("input[name=agree]").prop("checked", true);
		}else{
			$("input[name=agree]").prop("checked", false);
		});		
	 }*/
	// 한 줄 코딩
	// 전체 선택 체크박스를 클릭했을 때 발생
	$('.check-all').click(function(){ 
	  // agree class가 체크, check-all이 체크된 경우	
      $('.agree').prop('checked', $('.check-all').is(':checked')) 
   });
	
	 
	
	
	
	
})