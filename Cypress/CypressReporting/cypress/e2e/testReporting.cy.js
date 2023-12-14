/// <reference types="Cypress" />

describe('template spec', () => {
  beforeEach(() => {
    cy.visit('/')
    cy.fixture('data').as('data')
  })

  it('test 01: automatic', () => {
    cy.get('@data').then((data) => {
      for (let i = 0; i < 4; i++ ) {
        cy.get('.active img', {"timeout": 10000}).should('have.attr', 'alt', data.altvalues[i])
      }
    })
  })

  it.only('test 02: manual', () => {
    cy.get('@data').then((data) => {
      cy.get('.carousel-control-next-icon').as('flechaderecha')
      for (let i = 0; i < 4; i++) {
        cy.get('.active img', {"timeout": 10000}).should('have.attr', 'alt', data.altvalues[i])
        cy.get('@flechaderecha').click()
      }
    })
  })

  it('test 03: barritas', () => {
    cy.get('@data').then((data) => {
      cy.get('[data-target="#carouselExampleIndicators"]').each((barrita) => {
        barrita.click()

      })
      
    })
  })
})