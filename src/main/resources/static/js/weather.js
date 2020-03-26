function update(){
    var xhttp1 = new XMLHttpRequest();
    xhttp1.open("GET", "https://mywt.herokuapp.com/api/weather/temp", true);
    xhttp1.send();
    xhttp1.onreadystatechange = function() {
        if (xhttp1.readyState == 4 && xhttp1.status == 200) {
            document.getElementById("temp").innerHTML = xhttp1.responseText;
        }
    };

    var xhttp2 = new XMLHttpRequest();
    xhttp2.open("GET", "https://mywt.herokuapp.com/api/weather/humid", true);
    xhttp2.send();
    xhttp2.onreadystatechange = function() {
        if (xhttp2.readyState == 4 && xhttp2.status == 200) {
            document.getElementById("humid").innerHTML = xhttp2.responseText;
        }
    };

    var xhttp3 = new XMLHttpRequest();
    xhttp3.open("GET", "https://mywt.herokuapp.com/api/weather/date", true);
    xhttp3.send();
    xhttp3.onreadystatechange = function() {
        if (xhttp3.readyState == 4 && xhttp3.status == 200) {
            document.getElementById("date").innerHTML = xhttp3.responseText;
        }
    };

    var xhttp4 = new XMLHttpRequest();
    xhttp4.open("GET", "https://mywt.herokuapp.com/api/weather/time", true);
    xhttp4.send();
    xhttp4.onreadystatechange = function() {
        if (xhttp4.readyState == 4 && xhttp4.status == 200) {
            document.getElementById("time").innerHTML = xhttp4.responseText;
        }
    };
}