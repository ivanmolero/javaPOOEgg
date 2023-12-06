describe('template spec', () => {
  beforeEach(() => {
    cy.visit('/')
    cy.fixture('loginSuccessful').as('dataLogin')
  })

  it('login with good credentials', () => {
    cy.get('@dataLogin').then((dataLogin) => {
      dataLogin.dataOK.forEach((data) => {
        cy.get('input[name="UserName"]').type(data.username)
        cy.get('input[name="Password"').type(data.password)
        cy.get('#login').click()
        cy.get('#loginstatus').should('have.text', 'Welcome, ' + data.username + '!')
        cy.get('#login').should('have.text', 'Log Out')
        cy.get('#login').click()
        cy.get('#loginstatus').should('have.text', 'User logged out.')
      })
    })
  })

  it('login with bad credentials', () => {
    cy.get('@dataLogin').then((dataLogin) => {
      dataLogin.dataNotOK.forEach((data) => {
        cy.get('input[name="UserName"]').type(data.username)
        cy.get('input[name="Password"').type(data.password)
        cy.get('#login').click()
        cy.get('#loginstatus').should('have.text', 'Invalid username/password')
      })
    })
  })

  it('login without credentials', () => {
    cy.get('#login').click()
    cy.get('#loginstatus').should('have.text', 'Invalid username/password')
  })

  it('login without any data', () => {
    cy.get('input[name="Password"').type('pwd')
    cy.get('#login').click()
    cy.get('#loginstatus').should('have.text', 'Invalid username/password')
    cy.get('input[name="Password"').clear()
    cy.get('input[name="UserName"]').type('usuario')
    cy.get('#login').click()
    cy.get('#loginstatus').should('have.text', 'Invalid username/password')
  })

})