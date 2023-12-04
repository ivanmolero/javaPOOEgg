function validateErrorForm(cant) {
  if (cant > 0) {
    cy.log('validating web form using checkValidity')
    cy.get('.contact-form').then((formulario) => {
      expect(formulario[0].checkValidity()).to.be.false
    })
  }

  cy.log('validating invalid elements')
  cy.get('.contact-form :invalid').should('have.length', cant)
}

function validateErrorMessage(element, message) {
  element.invoke('prop', 'validationMessage').should('equal', message)
}

describe('Validating input data types in a form', () => {
  beforeEach(() => {
    cy.visit('/')
  })

  it('validating an empty form', () => {
    validateErrorForm(2)

    cy.log('validating error message for full name')
    validateErrorMessage(cy.get('#g4072-fullname'), 'Completa este campo')

    cy.log('validating error message for email')
    validateErrorMessage(cy.get('#g4072-email'), 'Completa este campo')

  })

  it('validating fill only full name', () => {
    cy.log('filling full name input')
    cy.get('#g4072-fullname').type('Jhon Smith')

    validateErrorForm(1)

    cy.log('validating error message for full name')
    validateErrorMessage(cy.get('#g4072-fullname'), '')

    cy.log('validating error message for email')
    validateErrorMessage(cy.get('#g4072-email'), 'Completa este campo')
  })

  it('validating fill only email', () => {
    cy.log('filling email input')
    cy.get('#g4072-email').type('jsmith@example.com')

    validateErrorForm(1)
    
    cy.log('validating error message for full name')
    validateErrorMessage(cy.get('#g4072-fullname'), 'Completa este campo')

    cy.log('validating error message for email')
    validateErrorMessage(cy.get('#g4072-email'), '')
  })

  it('validating fill wrong email format', () => {
    cy.log('filling full name input')
    cy.get('#g4072-fullname').type('Jhon Smith')

    cy.log('filling email "jsmith_example.com"')
    cy.get('#g4072-email').type('jsmith_example.com')

    cy.log('validating error message for email')
    validateErrorMessage(cy.get('#g4072-email'), 'Incluye un signo "@" en la dirección de correo electrónico. La dirección "jsmith_example.com" no incluye el signo "@".')

    cy.log('filling email "@example.com"')
    cy.get('#g4072-email').clear().type('@example.com')

    cy.log('validating error message for email')
    validateErrorMessage(cy.get('#g4072-email'), 'Ingresa texto antes del signo "@". La dirección "@example.com" está incompleta.')

    cy.log('filling email "jsmith@"')
    cy.get('#g4072-email').clear().type('jsmith@')

    cy.log('validating error message for email')
    validateErrorMessage(cy.get('#g4072-email'), 'Ingresa texto después del signo "@". La dirección "jsmith@" está incompleta.')

    validateErrorForm(1)

    cy.log('filling email "jsmith@example.com"')
    cy.get('#g4072-email').clear().type('jsmith@example.com')

    cy.log('validating error message for email')
    validateErrorMessage(cy.get('#g4072-email'), '')

    validateErrorForm(0)

  })

  it('validating phone number', () => {
    cy.log('filling full name input')
    cy.get('#g4072-fullname').type('Jhon Smith')

    cy.log('filling email "jsmith@example.com"')
    cy.get('#g4072-email').type('jsmith@example.com')

    cy.log('filling phone number "+51-945-154-587"')
    cy.get('#g4072-phonenumber').type('+51-945-154-587')

    validateErrorForm(0)
  })

  it.only('validating gender selection', () => {
    cy.log('filling full name input')
    cy.get('#g4072-fullname').type('Jhon Smith')

    cy.log('filling email "jsmith@example.com"')
    cy.get('#g4072-email').type('jsmith@example.com')

    cy.log('filling phone number "+51-945-154-587"')
    cy.get('#g4072-phonenumber').type('+51-945-154-587')

    cy.log('selection of gender to Female')
    cy.get('#g4072-gender-button').click()    
    cy.get('#ui-id-2').click()
    cy.get('#g4072-gender').should('have.value', 'Female')
    
    cy.get('#g4072-gender-button').click()    
    cy.get('#ui-id-3').click()
    cy.get('#g4072-gender').should('have.value', 'NA')

    cy.get('#g4072-gender-button').click()    
    cy.get('#ui-id-1').click()
    cy.get('#g4072-gender').should('have.value', 'Male')

    validateErrorForm(0)

  })
})