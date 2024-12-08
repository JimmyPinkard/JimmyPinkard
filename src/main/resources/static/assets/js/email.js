function sendEmail(e)
{
    e.preventDefault();
    const emailRequest = {
        name: getElementByIdValue("name-field"),
        email: getElementByIdValue("email-field"),
        subject: getElementByIdValue("subject-field"),
        message: getElementByIdValue("message-field"),
    }
    fetch("/api/email/send",
        {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(emailRequest)
        })
        .then(response => console.log(response))
        .catch(err => console.error(err))
}

function getElementByIdValue(elementId)
{
    return document.getElementById(elementId).value;
}

const emailButton = document.getElementById("email-submit");
emailButton.addEventListener("click", (e) => sendEmail(e));