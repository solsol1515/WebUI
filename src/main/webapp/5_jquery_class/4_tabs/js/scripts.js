$(function(){
	
	let topDiv = $('.tabSet');
	// 자식함수 찾을 때 find (ul.tabs a)로 찾아도 됨
	let anchors = topDiv.find('ul.tabs > li > a'); // 상단의 탭 (첫번째 ~ 네번째)
	let panelDivs = topDiv.find('div.panels > div.panel'); // 하단의 내용
	
	anchors.show(); // a태그 화면에 보이게 만들기
	panelDivs.hide();
	
	let lastAnchor = anchors.filter('.on'); // 속성값까지 가져올 때 filter 사용
	let lastPanel = $(lastAnchor.attr('href'));
	//alert(lastPanel);
	lastPanel.show();
	
	anchors.click(function(){
		let currentAnchor = $(this);
		let currentPanel = $(currentAnchor.attr('href'));
		
		lastPanel.hide();
		currentPanel.show();
		
		lastAnchor.removeClass('on');
		currentAnchor.addClass('on');
		
		// 화면을 계속 바꾸기 위해서 바로 직전에 클릭했던 탭을 마지막 탭으로 바꿔서 숨길 수 있도록함
		lastAnchor = currentAnchor;
		lastPanel = currentPanel;
	});
})