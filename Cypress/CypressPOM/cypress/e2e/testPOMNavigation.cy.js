/// <reference types="Cypress" />

import BlogPage from "../pages/blogPage";
import CoursesPage from "../pages/coursesPage";
import HomePage from "../pages/homePage";

let homePage = new HomePage()
let coursesPage = new CoursesPage()
let blogPage = new BlogPage()

describe('testing navigation in https://practicetestautomation.com', () => {
    beforeEach(() => {
        homePage.navigate()
    })

    it('test home', () => {
        homePage.validateMainTitle()
    })

    it('navigate to Courses', () => {
        homePage.clickCourses()
        coursesPage.validateMainTitle()
        cy.fixture('loginData').as('login')
        cy.get('@login').then((data) => {
            coursesPage.validateCoursesTitles(data.coursesTitles)
        })
    })

    it('navigate to Blog', () => {
        homePage.clickBlog()
        blogPage.validateBlogEntries()
    })
})