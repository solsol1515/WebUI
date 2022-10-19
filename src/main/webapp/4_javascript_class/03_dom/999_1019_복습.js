window.onload=function(){
	
	let td = document.getElementsByClassName('item');
	
	for(let i=0; i<td.length; i++){
		td[i].addEventListener('click', function(){
			alert(td[i].getAttribute('price'));
			alert('OK');
		});
	}
	
	/* window.onload = function(){
   let tds = document.getElementsByClassName("item");
   for(let i = 0; i<tds.length; i++){
      tds[i].onclick = function(evt){
         let price = evt.target.getAttribute('price');
         window.alert('ok')
         window.alert(price);
      }
   }
} */
	
}