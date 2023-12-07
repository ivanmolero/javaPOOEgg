/// <reference types="Cypress" />

before(() => {
  cy.log('se inicia el proceso de testing')
})

let testName;

describe('entorno para testear el registro', () => {
  before(() => {
    cy.log('se inicia conjunto de tests en relación al registro')
    cy.visit('/')
  })

  beforeEach(() => {
    cy.log('validando la carga de la página actual')
    cy.get('.loader').should('not.exist')
  })

  it('test carga de signup - login', () => {
    testName = 'página signup - login'
    cy.contains(' Signup / Login').click()
    cy.contains('New User Signup!').should('be.visible')
  })

  it('test carga de registro', () => {
    testName = 'página registro'
    cy.fixture('datos').as('datos')
    cy.get('@datos').then((datos) => {
      cy.get('[data-qa="signup-name"]').type(datos.dataRegister.username)
      cy.get('[data-qa="signup-email"]').type(datos.dataRegister.email)
      cy.get('[data-qa="signup-button"]').click()
    })
    cy.get('h2 b').eq(0).should('have.text', 'Enter Account Information').should('be.visible')
  })

  it('llenar los datos del formulario de registro', () => {
    testName = 'llenar formulario registro'
    cy.fixture('datos').as('datos')
    cy.get('@datos').then((datos) => {
      cy.contains(datos.dataRegister.title).click()
      cy.get('[data-qa="password"]').type(datos.dataRegister.password)
      cy.get('[data-qa="days"]').select(datos.dataRegister.nacimiento.dia)
      cy.get('[data-qa="months"]').select(datos.dataRegister.nacimiento.mes)
      cy.get('[data-qa="years"]').select(datos.dataRegister.nacimiento.anio)
      cy.get('#newsletter').check()
      cy.get('#optin').check()
      cy.get('[data-qa="first_name"]').type(datos.dataRegister.name.split(" ")[0])
      cy.get('[data-qa="last_name"]').type(datos.dataRegister.name.split(" ")[1])
    })
    
  })

  afterEach(() => {
    cy.log('se finaliza el test ' + testName)
  })
})

after(() => {
  cy.log('se finaliza el proceso de testing')
})