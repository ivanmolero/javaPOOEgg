class HomePage {
    elements = {
        mainTitle: () => cy.get('h1'),
        linkCourses: () => cy.get('#menu-item-21'),
        linkBlog: () => cy.get('#menu-item-19')
    }

    navigate() {
        cy.visit('/')
    }

    validateMainTitle() {
        this.elements.mainTitle().should('be.visible')
        this.elements.mainTitle().should('have.text', 'Hello')
    }

    clickCourses() {
        this.elements.linkCourses().click()
    }

    clickBlog() {
        this.elements.linkBlog().click()
    }
}

export default HomePage