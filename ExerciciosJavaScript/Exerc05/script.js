document.addEventListener('DOMContentLoaded', function() {
    const checkboxes = document.querySelectorAll('input[type="checkbox"]');
    const submitButton = document.getElementById('submitButton');

    checkboxes.forEach((checkbox) => {
        checkbox.addEventListener('change', function() {
            const checkedCheckboxes = document.querySelectorAll('input[type="checkbox"]:checked');
            if (checkedCheckboxes.length >= 2) {
                submitButton.disabled = false;
            } else {
                submitButton.disabled = true;
            }
        });
    });
}); 