$(function(){
   
   let count = 0;
   let total = 0;
   $('.menu > img').click(function(){
      
      // alert($(this).parent().find('span:eq(1)').attr('value'));
      
     /* if(count<1){
         $('#option').append("<iframe src='./menu_option.html' title='menu' height='950' width='800' style='border:none;''></iframe>")
         ++count;
      }*/
      
      let ifrm = $('div#option > iframe').contents(); //iframe의 요소에 접근하기 위한 코드
      
      let oriPrice = $(this).parent().find('span:eq(1)').attr('value'); // 가격 가져오기
      let name = $(this).parent().find('span:eq(0)').attr('value'); // 메뉴명 가져오기 
      
      let hotCold = ifrm.find("tr.option1 input:radio[name='hot_cold']:checked").val(); // hot / iced 선택
      let sizeP = Number(ifrm.find("tr.size input:radio[name='size']:checked").val()); // 사이즈
      let syruP = Number(ifrm.find("tr.option2 input:radio[name='syrup']:checked").val()); // 시럽 추가 여부
      let shotP = Number(ifrm.find("tr.option3 input:radio[name='shot']:checked").val()); // 샷 추가 여부
      
      // 따뜻한 음료 / 차가운 음료 선택
      ifrm.find(hotCold).click(function(){
         hotCold = $(this).val(); // HOT or ICED 저장
      });
      
      // 사이즈 선택
      
      ifrm.find("tr.size input:radio[name='size']").click(function(){
         sizeP = Number($(this).val()); // 선택한 사이즈값 저장
         //alert(sizeP)
      });
      
      ifrm.find("tr.option2 input:radio[name='syrup']").click(function(){
         syruP = Number($(this).val()); // 시럽 추가 여부 저장
         //alert(syruP)
      });
      
      ifrm.find("tr.option3 input:radio[name='shot']").click(function(){
         shotP = Number($(this).val()); // 샷 추가 여부 저장
         //alert(shotP)
      });
      
      let addedP = Number(oriPrice) + Number(sizeP) + Number(syruP) + Number(shotP); // 선택한 옵션 저장
      let Fname = name + "(" + hotCold + ")";
      
      total += $('totallist > td').text();
      
      ifrm.find("#damgi").click(function(){
	
		//alert(addedP);
		//alert(total);
         
         for (let i=0 ; i<15 ; i++) {
            if($('tr.list:eq(' + i + ') > td:eq(0)').text() != '') {
	
            } else {
               $('tr.list:eq(' + i + ') > td:eq(0)').text(Fname);
               // $('tr.list:eq(' + i + ') > td:eq(1)').append
               // $('tr.list:eq(' + i + ') > td:eq(2)').append()
               
               $('#totallist > td').text(addedP+'원');
               break;
            }
         }
         
      });
      
   });
   
});