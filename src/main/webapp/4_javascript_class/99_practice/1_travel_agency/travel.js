
window.onload = function(){
	
	let adult = document.frm.adult;
	let child = document.frm.child;
	let baby = document.frm.baby;
	
	adult.onchange = calc;
	child.onchange = calc;
	baby.onchange = calc;
	
	function calc(){
		frm.total.value = (adult.value*39000 + child.value*29000 + baby.value*19000)+'원';
	}	
	
/*	let checkbox = document.frm.checkbox;
	
	checkbox.onchange = check;
	checkbox2.onchange = check;
	
	function check(){
		if(!frm.checkbox.cjecked){
			alert('반드시 약관을 확인해주세요')
			return;
		}	
	}*/
}
