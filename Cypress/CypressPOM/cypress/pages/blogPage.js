class BlogPage {
    elements = {
        blogsEntries: () => cy.get('#loop-container > div')
    }

    validateBlogEntries() {
        this.elements.blogsEntries().should('have.length', 10)
    }
}

export default BlogPage