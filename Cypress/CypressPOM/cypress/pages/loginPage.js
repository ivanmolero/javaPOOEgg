class LoginPage {
    elements = {
        inputUserName: () => cy.get('#username'),
        inputPassword: () => cy.get('#password'),
        buttonSubmit: () => cy.get('#submit'),
        errorMessage: () => cy.get('#error')
    }


    navigate() {
        cy.visit('/practice-test-login')
    }

    fillUserName(username) {
        this.elements.inputUserName().type(username)
    }

    fillPassword(password) {
        this.elements.inputPassword().type(password)
    }

    clickSubmit() {
        this.elements.buttonSubmit().click()
    }

    validateShowError(isShow) {
        if (isShow) {
            this.elements.errorMessage().should('be.visible')
        } else {
            this.elements.errorMessage().should('not.be.visible')
        }
    }

    validateErrorMessage(message) {
        this.elements.errorMessage().should('have.text', message)
    }
}

export default LoginPage