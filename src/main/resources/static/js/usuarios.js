// Call the dataTables jQuery plugin
$(document).ready(function() {
    cargarUsuarios();
    $('#usuarios').DataTable();
});

async function cargarUsuarios(){
    const request = await fetch('usuarios', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
    });
    let htmlUser = '';
    const usuarios = await request.json();

    for(let usuario of usuarios){
        htmlUser += '<tr><td>'+usuario.nombre+' '+usuario.apellidos+'</td><td>'+usuario.email+'</td><td>'+usuario.telefono+'</td><td>'+usuario.password+'</td><td>'+'x'+'</td></tr>';
    }
    document.querySelector('#usuarios tbody').outerHTML = htmlUser;
}