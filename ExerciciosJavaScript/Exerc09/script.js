function validateForm() {
    var login = document.getElementById('login').value;
    var password = document.getElementById('password').value;
    var confirmPassword = document.getElementById('confirmPassword').value;

   
    if (login === '' || password === '' || confirmPassword === '') {
        alert('Por favor, preencha todos os campos.');
        return false;
    }

   
    if (password !== confirmPassword) {
        alert('As senhas não coincidem. Por favor, digite novamente.');
        return false;
    }

    
    if (password.length < 6 || password.length > 10) {
        alert('A senha deve ter entre 6 e 10 caracteres.');
        return false;
    }

   
    return true;
}