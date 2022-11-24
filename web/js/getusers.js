var object = []



fetch('http://localhost:8080/users/getUsers').then((data) => {


    object = data.json()
    return object
}).then((completedata) => {

    let placeholder = document.querySelector("#data-output");
    let out = "";
    for (let product of completedata) {
        out += `
          <tr>
             
             <td>${product.name}</td>
             <td>${product.user_role}</td>
          </tr>
       `;
    }

    placeholder.innerHTML = out;






    console.log(completedata);
    console.log(object);
})


function buildTable(data) {
    var table = document.getElementById('myTable')

    for (var i = 0; i < data.length; i++) {
        var row = `<tr>
                        <td>${data[i].name}</td>
                        <td>${data[i].password}</td>
                        <td>${data[i].user_role}</td>
                  </tr>`
        table.innerHTML += row


    }
}

buildTable(object)