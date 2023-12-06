describe('test for differents types of waits in cypress', () => {
  beforeEach(() => {
    cy.visit('/')
  })

  it('explicit wait', () => {
    cy.get('#ajaxButton').click()
    cy.wait(25000)
    cy.get('#content p').should('have.text', 'Data loaded with AJAX get request.')
  })

  it('bdd wait', () => {
    cy.get('#ajaxButton').click()
    cy.get('#content p', {"timeout": 25000}).should('have.text', 'Data loaded with AJAX get request.')
  })

  it('request wait', () => {
    cy.intercept('GET', 'https://uitestingplayground.com/ajaxdata').as('request')
    cy.get('#ajaxButton').click()
    cy.wait('@request', {"timeout": 25000}).its('response.statusCode').should('equal', 200)
    cy.get('#content p').should('have.text', 'Data loaded with AJAX get request.')
  })

})