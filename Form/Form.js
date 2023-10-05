function submitForm() {
    var name = document.getElementById('name').value;
    var email = document.getElementById('email').value;
    var firstTime = document.querySelector('input[name="firstTime"]:checked');
    var recommendation = document.querySelector('input[name="recommendation"]:checked');
    var satisfaction = document.querySelector('input[name="satisfaction"]:checked');
    var suggestion = document.getElementById('suggestion').value;

    if (name && email && firstTime && recommendation && satisfaction && suggestion) {
        var popupMessage = `Name: ${name}\nEmail: ${email}\nFirst Time: ${firstTime.value}\nRecommendation: ${recommendation.value}\nSatisfaction: ${satisfaction.value}\nSuggestion: ${suggestion}`;
        alert(popupMessage);
        resetForm();
    } else {
        alert("Please fill out all fields.");
    }
}

function resetForm() {
    document.getElementById('name').value = '';
    document.getElementById('email').value = '';
    document.querySelector('input[name="firstTime"]:checked').checked = false;
    document.querySelector('input[name="recommendation"]:checked').checked = false;
    document.querySelector('input[name="satisfaction"]:checked').checked = false;
    document.getElementById('suggestion').value = '';
}
