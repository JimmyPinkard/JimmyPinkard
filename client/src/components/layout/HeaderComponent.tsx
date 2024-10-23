import {ExtendedNav, Header, Menu, NavDropDownButton, NavMenuButton, Search, Title} from "@trussworks/react-uswds";
import {useState} from "react";

export default function HeaderComponent()
{
    const [expanded, setExpanded] = useState(false);
    const onClick = (): void => setExpanded(prvExpanded => !prvExpanded);
    const [isOpen, setIsOpen] = useState([false]);

    const onToggle = (num:number, callback:any) => {
        callback(isOpen[num])
    }
    const mockSubmit = () => {};
    const testMenuItems = [<a href="#linkOne" key="one">
        Simple link one
    </a>, <a href="#linkTwo" key="two">
        Simple link two
    </a>];
    const testItemsMenu = [<>
        <NavDropDownButton onToggle={(): void => {
            onToggle(0, setIsOpen);
        }} menuId="testDropDownOne" isOpen={isOpen[0]} label="Nav Label" isCurrent={true} />
        <Menu key="one" items={testMenuItems} isOpen={isOpen[0]} id="testDropDownOne" />
    </>, <a href="#two" key="two" className="usa-nav__link">
        <span>Parent link</span>
    </a>, <a href="#three" key="three" className="usa-nav__link">
        <span>Parent link</span>
    </a>];
    return <>
        <Header extended={true} showMobileOverlay={expanded}>
            <div className="usa-navbar">
                <Title>Jimmy Pinkard</Title>
                <NavMenuButton onClick={onClick} label="Menu" />
            </div>
            <ExtendedNav primaryItems={testItemsMenu} secondaryItems={testMenuItems} mobileExpanded={expanded} onToggleMobileNav={onClick}>
                <Search size="small" onSubmit={mockSubmit} />
            </ExtendedNav>
        </Header>
    </>;
}