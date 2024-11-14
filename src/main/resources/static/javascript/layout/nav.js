class Nav extends HTMLElement
{
    constructor()
    {
        super();
        this.innerHTML = `
        <nav class="navbar">
                <ul class="navbar-links">
                    <li><a href="/" class="bar-link">Home</a></li>
                    <li><a href="/projects.html" class="bar-link">Projects</a></li>
                    <li><a href="/work.html" class="bar-link">Work</a></li>
                    <li><a href="/about.html" class="bar-link">About</a></li>
                </ul>
        </nav>`;
    }
}

customElements.define("navbar-component", Nav);