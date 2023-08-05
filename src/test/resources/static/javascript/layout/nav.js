class Nav extends HTMLElement
{
    constructor()
    {
        super();
        const pageList = [{id: "1", title: "Home", href: "/"}, {id: "2", title: "Projects", href: "/projects"},
            {id: "3", title: "My Work", href: "/work"}, {id: "4", title: "About Me", href: "/about"},
            {id: "5", title: "Contact", href: "/contact"}];
        const pages = pageList.map((page) =>
        {
            const link = `<li><a href=${page.href} class="bar-link">${page.title}</a></li>`;
            return link.replace(",", "");
        }).join("");
        this.innerHTML = `
        <nav class="navbar">
                <ul class="navbar-links">${pages}</ul>
        </nav>`;
    }
}

customElements.define("navbar-component", Nav);