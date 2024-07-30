function toggleFields() {
    var pessoaFisica = document.getElementById('pessoaFisica');
    var cpfGroup = document.getElementById('cpfGroup');
    var pessoaJuridica = document.getElementById('pessoaJuridica');
    var cnpjGroup = document.getElementById('cnpjGroup');
    var dataNascimentoGroup = document.getElementById('dataNascimentoGroup');

    if (pessoaFisica.checked) {
        cpfGroup.style.display = 'block';
        cnpjGroup.style.display = 'none';
        dataNascimentoGroup.style.display = 'block';
    } else if (pessoaJuridica.checked) {
        cpfGroup.style.display = 'none';
        cnpjGroup.style.display = 'block';
        dataNascimentoGroup.style.display = 'none';
    }
}

function validateForm() {
    var pessoaFisica = document.getElementById('pessoaFisica');
    var cpf = document.getElementById('cpf');
    var cnpj = document.getElementById('cnpj');
    var dataNascimento = document.getElementById('dataNascimento');

    // Verifica se pessoa física está selecionada e se o CPF está preenchido
    if (pessoaFisica.checked && cpf.value.trim() === '') {
        alert('Por favor, informe o CPF.');
        return false;
    }

    
    if (pessoaJuridica.checked && cnpj.value.trim() === '') {
        alert('Por favor, informe o CNPJ.');
        return false;
    }

    // Validação adicional para data de nascimento, se pessoa física selecionada
    if (pessoaFisica.checked) {
        if (dataNascimento.value.trim() === '') {
            alert('Por favor, informe a data de nascimento.');
            return false;
        }
    }

  
    return true;
}