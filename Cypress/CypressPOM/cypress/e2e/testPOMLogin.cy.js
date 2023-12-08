/// <reference types="Cypress" />

import LoginPage from "../pages/loginPage"
import LoginSuccessful from "../pages/loginSuccesful"

let loginPage = new LoginPage()
let loginSuccessful = new LoginSuccessful()

describe('testing https://practicetestautomation.com/practice-test-login/ with POM', () => {
  beforeEach(() => {
    loginPage.navigate()
    cy.fixture('loginData').as('login')
  })

  it('login test with no fails', () => {
    cy.get('@login').then((login) => {
      loginPage.fillUserName(login.noFail.username)
      loginPage.fillPassword(login.noFail.password)
      loginPage.validateShowError(false)
      loginPage.clickSubmit()
      loginSuccessful.validateSuccessfulMessage(login.noFail.message)
      loginSuccessful.validateUrl()
      loginSuccessful.clickLogOutButton()
    })
  })

  it('login test with wrong username', () => {
    cy.get('@login').then((login) => {
      loginPage.fillUserName(login.failUsername.username)
      loginPage.fillPassword(login.failUsername.password)
      loginPage.validateShowError(false)
      loginPage.clickSubmit()
      loginPage.validateShowError(true)
      loginPage.validateErrorMessage(login.failUsername.message)
    })
  })

  it('login test with wrong password', () => {
    cy.get('@login').then((login) => {
      loginPage.fillUserName(login.failPassword.username)
      loginPage.fillPassword(login.failPassword.password)
      loginPage.validateShowError(false)
      loginPage.clickSubmit()
      loginPage.validateShowError(true)
      loginPage.validateErrorMessage(login.failPassword.message)
    })
  })
})