const HTTP = new XMLHttpRequest();
const URL = "distance/test";

var searchButton = document.getElementById("search-btn");

searchButton.onclick = function() 
{
    
    HTTP.open("GET", URL);
    HTTP.send();
    
    HTTP.onreadystatechange = function() 
    {
        if(this.readyState == 4 && this.status == 200) 
        {
            console.log(HTTP.responseText);
        }
    }
}


var veteranPhoneButton = document.getElementById.
// veteran->caseWorker phonenumber onclick, caseworker->veteran phonenumber onclick, veteran searchbar onclick,  caseWorker searchbar onclick