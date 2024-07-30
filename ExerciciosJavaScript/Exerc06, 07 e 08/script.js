function changeFontColor(color) {
    const paragraph = document.getElementById('paragraph');
    paragraph.style.color = color;
}

function changeBgColor(color) {
    const paragraph = document.getElementById('paragraph');
    paragraph.style.backgroundColor = color;
}

function increaseFontSize() {
    const paragraph = document.getElementById('paragraph');
    let currentFontSize = parseFloat(window.getComputedStyle(paragraph, null).getPropertyValue('font-size'));
    paragraph.style.fontSize = (currentFontSize + 2) + 'px';
}

function decreaseFontSize() {
    const paragraph = document.getElementById('paragraph');
    let currentFontSize = parseFloat(window.getComputedStyle(paragraph, null).getPropertyValue('font-size'));
    if (currentFontSize > 8) {
        paragraph.style.fontSize = (currentFontSize - 2) + 'px';
    }
}

function transformToUppercase() {
    const paragraph = document.getElementById('paragraph');
    paragraph.textContent = paragraph.textContent.toUpperCase();
}

function transformToLowercase() {
    const paragraph = document.getElementById('paragraph');
    paragraph.textContent = paragraph.textContent.toLowerCase();
}