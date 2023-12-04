const { defineConfig } = require("cypress");

module.exports = defineConfig({
  e2e: {
    setupNodeEvents(on, config) {
      // implement node event listeners here
    },
    "baseUrl": "https://qavalidation.com/demo-form", 
    "viewportWidth": 1300
  },
});
