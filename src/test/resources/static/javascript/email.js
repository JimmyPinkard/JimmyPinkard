function request(endpoint, method, body)
{
    return fetch("https://localhost:8080" + endpoint,
        {
            headers:
                {
                    "Content-Type": "application/json"
                },
            mode: "cors",
            method: method,
            body: JSON.stringify(body)
        })
}

document.getElementById("submit").addEventListener("click", (e) => sendEmail(e))

function sendEmail(e)
{
    e.preventDefault();
    const emailInfo =
        {
            from: document.getElementById("email").value,
            subject: document.getElementById("subject").value,
            message: `${document.getElementById("message").value}\n\nFrom: ${document.getElementById("name")}`
        };
    request("/email/send", "POST", emailInfo).then(r => r.json()).then(data => console.log(data)).catch(e => console.log(err));
}