const HTTP = new XMLHttpRequest();
const URL = "https://postman-echo.com/get";

var searchButton = document.getElementById("search-btn");

searchButton.onclick = function() {
    
    HTTP.open("GET", URL);
    HTTP.send();
    
    HTTP.onreadystatechange = function() {
        if(this.readyState == 4 && this.status == 200) {
            console.log(HTTP.responseText);
        }
    }
}
