var jso

function handleSubmit(event){
event.preventDefault();

const data = new FormData(event.target);


const value = Object.fromEntries(data.entries());


 jso = JSON.stringify(value);


console.log({value})


// However to make it work, we are going to use the cors-anywhere free service to bypass this


console.log({jso})

//fetch('htttp://localhost:8080/users/save',{
//method: 'POST',
//body: JSON.stringify(jso)
//})
var xhr = new XMLHttpRequest();
var proxy = 'https://cors-anywhere.herokuapp.com/';

var url = "http://localhost:8080/users/save";
xhr.open("POST", url, true);
xhr.setRequestHeader("Content-Type", "application/json");

xhr.send(jso);
}


  const form = document.querySelector('form');
  form.addEventListener('submit', handleSubmit);


