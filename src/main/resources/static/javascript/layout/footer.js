class Footer extends HTMLElement
{
    constructor()
    {
        super();
        this.innerHTML = `<footer class="footer">
        <ul class="contact-info">
            <li>Name: Jimmy Pinkard III</li>
            <li>Phone: <a href="tel:8032692552" class="in-text-link">803-269-2552</a></li>
            <li>Email: <a href="mailto:jimmypinkard7@gmail.com" class="in-text-link">jimmypinkard7@gmail.com</a></li>
        </ul>
    </footer>
    `;
    }
}

customElements.define("footer-component", Footer);