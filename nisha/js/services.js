const HTTP = new XMLHttpRequest();
const URL = "distance/test";

var searchButton = document.getElementById("search-btn");

searchButton.onclick = function() 
{
const URL = "http://localhost:8080/services/search?filter=";

var searchButton = document.getElementById("search-btn");


searchButton.onclick = function() {
    
    var query = document.getElementById("search-input").innerHTML;

    HTTP.open("GET", URL + query);
    HTTP.send();
    
    HTTP.onreadystatechange = function() 
    {
        if(this.readyState == 4 && this.status == 200) 
        {
            console.log(HTTP.responseText);
        }
    }
}


var veteranTextMessageButton = document.getElementById(veteranTextMessageButton);
var veteranTextMessageBox = document.getElementById(veteranTextMessageBox);
var query = document.getElementById(veteranTextMessageBox).innerHTML;

veteranTextMessageButton.onclick = function()
{
    HTTP.open("GET", URL + query);
    HTTP.send();

    HTTP.onreadystatechange = function()
    {
        if (this.readyState == 4 && this.status == 200)
        {
            console.log(HTTP.responseText)
            veteranTextMessageBox.placeholder = "Your message has been sent."
        }
    }
}
// veteran->caseWorker phonenumber onclick, caseworker->veteran phonenumber onclick, veteran searchbar onclick,  caseWorker searchbar onclick