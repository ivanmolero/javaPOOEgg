describe('Test login', () => {
  beforeEach(() => {
    cy.visit('/')
  })

  it('login fail', () => {
    cy.get('input[name="UserName"]').type('Usuario')
    cy.get('input[name="Password"]').type('1234abc')
    cy.get('#login').click()
    cy.get('#loginstatus').should('have.text', 'Invalid username/password')
  })

  it('login success', () => {
    cy.get('input[name="UserName"]').type('Usuario')
    cy.get('input[name="Password"]').type('pwd')
    cy.get('#login').click()
    cy.get('#loginstatus').should('have.text', 'Welcome, Usuario!')
  })

})