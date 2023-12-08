/// <reference types="Cypress" />
class LoginSuccessful {
    elements = {
        successfulMessage: () => cy.get('.post-title'),
        buttonLogOut: () => cy.contains('Log out')
    }

    validateSuccessfulMessage(message) {
        this.elements.successfulMessage().should('have.text', message)
    }

    clickLogOutButton() {
        this.elements.buttonLogOut().click()
    }

    validateUrl() {
        cy.url().should('include', 'practicetestautomation.com/logged-in-successfully/')
    }
}

export default LoginSuccessful