$(function(){
	// 첫번째 <a> 찾기 prettyPopin
	$('a[rel="prettyPopin"]:eq(0)').prettyPopin({width:500});
	$('a[rel="prettyPopin"]:last').prettyPopin({width:610, 
		// 속성명:속성값,  
		callback:function(){
			alert('팝업이 닫힙니다');
				 }
	});
	
})