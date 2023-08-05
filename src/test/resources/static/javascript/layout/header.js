//console.log = () => {};
class Header extends HTMLElement
{
    constructor()
    {
        super();
        this.innerHTML =
        `
        <header class="header">
                <h1 id="site-title">Jimmy Pinkard</h1>
                <h2 id="page-title">${this.getAttribute("pageTitle")}</h2>
        </header>`;
    }
}

customElements.define("header-component", Header);