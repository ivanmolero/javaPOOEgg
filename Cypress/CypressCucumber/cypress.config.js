const { defineConfig } = require("cypress")

module.exports = defineConfig({
  e2e: {
    "cypress-cucumber-preprocessor": {
      nonGlobalStepDefinitions: false,
      step_definitions: "./cypress/e2e/",
    },
    setupNodeEvents(on, config) {
      // implement node event listeners here
      return require("./cypress/plugins/index.js")(on, config)
    },
    specPattern: "cypress/e2e/**/*.feature",
    supportFile: false,
    baseUrl: "https://www.demoblaze.com/",
  },
})
