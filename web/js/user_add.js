const btn = document.getElementById('submiter')
const form = document.getElementById('form')


let formData = new FormData(form);


var object = {};
formData.forEach(function(value, key) {
    object[key] = value;
});
var json = JSON.stringify(object);


btn.addEventListener('click', (e) => {
    e.preventDefault();
    subscribe();
});



const subscribe = async() => {
    try {
        let response = await fetch('http://localhost:8080/users/save', {
            method: 'POST',
            mode: 'no-cors',
            body: json,
        });
        const result = await response.json();

        showMessage(result.message, response.status == 200 ? 'success' : 'error');
    } catch (error) {
        console.log('ajbcojs')
        console.log(formData)
    }
};