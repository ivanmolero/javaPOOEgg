context('Example 01', () => {
    beforeEach(() => {
        cy.visit('/')
    })

    it('Test #1', () => {
        cy.get('.new-todo').type('My very long task #1{enter}')
        cy.get('.new-todo').type('My very long task #2{enter}')
        cy.get('.new-todo').type('My very long task #3{enter}')
        cy.contains('Completed').click()
        cy.contains('Active').click()
    })

    it('Test #2 - Select using css selectors', () => {
        cy.get('.new-todo').type('My very long task #1{enter}')
        cy.get('.new-todo').type('My very long task #2{enter}')
        cy.get(':nth-child(2) > .view > .toggle').click()
        cy.contains('Completed').click()
    })

    it('Test #3 - Select using text content', () => {
        cy.get('.new-todo').type('My very long task #1{enter}')
        cy.get('.new-todo').type('My very long task #2{enter}')
        cy.get('label:contains("My very long task #2")')
            .parent().find('.toggle').click()
        cy.contains('Completed').click()
    })
})