const HTTP = new XMLHttpRequest();
<<<<<<< HEAD
const URL = "distance/test";

var searchButton = document.getElementById("search-btn");

searchButton.onclick = function() 
{
=======
const URL = "http://localhost:8080/services/search?filter=";

var searchButton = document.getElementById("search-btn");


searchButton.onclick = function() {
>>>>>>> ad188810fa432743ca0093a80c5952a2a6f681f5
    
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


var veteranPhoneButton = document.getElementById(phoneicon);
veteranPhoneButton.onclick = function()
{
    HTTP.open("GET", URL);
    HTTP.send();

    HTTP.onreadystatechange = function()
    {
        if (this.readyState == 4 && this.status == 200)
        {
            console.log(HTTP.)
        }
    }
}
// veteran->caseWorker phonenumber onclick, caseworker->veteran phonenumber onclick, veteran searchbar onclick,  caseWorker searchbar onclick