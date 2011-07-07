/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */function saveImage(thecanvas){
var oCanvas = document.getElementById(thecanvas);
Canvas2Image.saveAsPNG(oCanvas);
 }

 function eraseImage(thecanvas){
     var oCanvas = Processing.getInstanceById(thecanvas);
     oCanvas.setup();
//    // context.clearRect(0, 0, context.oCanvas.width, context.oCanvas.height);
//     oCanvas.width++;
//     oCanvas.width--;
//     var b_context = oCanvas.getContext("2d");
//     b_context.fillStyle= black;
//     b_context.fillRect(0,0, 1000, 450);
     
 }
 function changetext(thecanvas,texto){
     var prinstance;
     var tex = document.getElementById(texto);
         prinstance = Processing.getInstanceById(thecanvas);
        prinstance.setText(tex.value);
        }


