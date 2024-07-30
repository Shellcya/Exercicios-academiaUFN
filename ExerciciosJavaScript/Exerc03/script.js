function alterarCorFundo() {
    var select = document.getElementById("cores");
    var corSelecionada = select.value;

    switch (corSelecionada) {
        case "purple":
            document.body.style.backgroundColor = "purple";
            break;
        case "green":
            document.body.style.backgroundColor = "green";
            break;
        case "blue":
            document.body.style.backgroundColor = "blue";
            break;
        case "red":
            document.body.style.backgroundColor = "red";
            break;
        default:
            document.body.style.backgroundColor = "white";  
    }
}

function restaurarCor() {
    document.body.style.backgroundColor = "white"; 
}

 