function envoyerNotification() {
    const messageInput = document.getElementById('messageInput').value;

    fetch('/envoyer-notification', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded;charset=UTF-8'
        },
        body: 'message=' + encodeURIComponent(messageInput)
    })
        .then(response => {
            if (!response.ok) {
                throw new Error('Erreur réseau');
            }
            return response.text();
        })
        .then(message => {
            document.querySelector('.card-text').innerText = message;
        })
        .catch(error => {
            console.error('Erreur lors de la requête :', error);
        });
}
