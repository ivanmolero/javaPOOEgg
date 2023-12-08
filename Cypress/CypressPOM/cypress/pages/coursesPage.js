class CoursesPage {
    elements = {
        mainTitle: () => cy.get('h1'),
        courseTitles: () => cy.get('h2 a')
    }

    validateMainTitle() {
        this.elements.mainTitle().should('be.visible')
        this.elements.mainTitle().should('have.text', 'Courses')
    }

    validateCoursesTitles(titles) {
        this.elements.courseTitles().should('have.length', 10)
        for (let i = 0; i < titles.length; i++) {
            this.elements.courseTitles().eq(i).should('have.text', titles[i])
        }
    }
}

export default CoursesPage