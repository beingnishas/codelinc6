const HTTP = new XMLHttpRequest();
const URL = "http://localhost:8080/services/search?filter=";

var searchButton = document.getElementById("search-btn");


searchButton.onclick = function() {
    
    var query = document.getElementById("search-input").innerHTML;

    HTTP.open("GET", URL + query);
    HTTP.send();
    
    HTTP.onreadystatechange = function() {
        if(this.readyState == 4 && this.status == 200) {
            console.log(HTTP.responseText);
        }
    }
}
