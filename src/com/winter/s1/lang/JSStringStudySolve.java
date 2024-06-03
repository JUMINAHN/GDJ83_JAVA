package com.winter.s1.lang;

public class JSStringStudySolve { // **************6교시 -> js : file 확장자 3개모두 이미지 파일인지 아닌지 확인하는 코드 작성

	/*
	 * <!DOCTYPE html> <html lang="en"> <head> <meta charset="UTF-8"> <meta
	 * name="viewport" content="width=device-width, initial-scale=1.0">
	 * <title>Document</title> </head> <body> <input type="file" id="file"
	 * class="c1"> <input type="file" id="file" class="c1"> <input type="file"
	 * id="file" class="c1"> <button id="btn">CLICK</button>
	 * 
	 * <!-- javascript 자바와 똑같이 하기 --> <script> const file =
	 * document.getElementById("file"); const btn = document.getElementById("btn");
	 * const f = document.getElementsByClassName("c1"); //input 태그
	 * 
	 * 
	 * //img 파일 확장명 추출
	 * 
	 * let files = ["jpg", "jpeg", "png", "jiff", "giff"]
	 * btn.addEventListener("click", function() { //버튼을 클릭함 let flag = false ; let
	 * count; for(let i=0; j<f.length;i++) { //c1개수만큼 let v = f[i].value; v =
	 * v.substring(v.lastIndexOf("." + 1)); // 확장자명 for(let j=0; j <files.length;
	 * j++) { if(v==files[i]) { flag = true; count++; break; // 찾으면 } } }
	 * 
	 * if (count == f.length) { console.log("전부 이미지다.") } else {
	 * console.log("전부 이미지가 아니다.") }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * //if문 활용 // if(whatFile == "jpg" || whatFile == "jpeg" || whatFile == "png"
	 * || whatFile == "jiff" || whatFile == "giff") { // console.log("이미지 파일 입니다.");
	 * // } else { // console.log("이미지 파일이 아닙니다.") // }
	 * 
	 * //for문 활용 // let stringImg = ["jpg", "jpeg", "png", "jiff", "giff"] //
	 * for(let i=0; i< stringImg.length; i++) { // if(whatFile[i] == stringImg[i]) {
	 * // console.log("이미지 파일입니다."); //하나라도 일치하면~ // break; // } // } })
	 * 
	 * </script> </body> </html>
	 */
}
