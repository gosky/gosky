
function mousestatus(e) {
    if (!e) e = window.event;
    btn = e.button;
    whichone = (btn < 2) ? "Left" : "Right";
    message=e.type + " : " + whichone + "\n";
    document.form1.info.value += message;
}
 

