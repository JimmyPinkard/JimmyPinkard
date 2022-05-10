class Footer extends HTMLElement
{
    constructor()
    {
        super();
        const contactInfo = ["Name: Jimmy Pinkard", "Phone: 803-529-4961", "Email: jimmypinkard7@gmail.com"];
        const contact = contactInfo.map((info) =>
        {
            return `<li>${info}</li>`;
        }).join("");
        this.innerHTML = `<footer class="footer">
        <ul class="contact-info">
            ${contact}
        </ul>
    </footer>
    `;
    }
}

customElements.define("footer-component", Footer);