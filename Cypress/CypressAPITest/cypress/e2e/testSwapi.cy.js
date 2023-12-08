/// <reference types="Cypress" />

describe('template spec', () => {
  beforeEach(() => {
    cy.log('iniciando el test')
  })

  it('test 1 and 2', () => {
    cy.request('GET', '/people/2').then((response) => {
      console.log(response)
      expect(response.status).to.equal(200)
      expect(response.body).to.have.property('skin_color', 'gold')
      expect(response.body.films).to.have.length(6)
      return response.body.films[1]
    }).then((secondMovieUrl) => {
      cy.request('GET', secondMovieUrl).then((response) => {
        let date = new Date(response.body.release_date)
        expect(response.body.release_date).to.equal(date.toISOString().split('T')[0])
        let campos = ['characters', 'planets', 'starships', 'vehicles', 'species']
        for (let i = 0; i < campos.length; i++) {
          expect(response.body[campos[i]]).to.have.length.of.at.least(1)
        }
        return response.body.planets[0]
      }).then((firstPlanetUrl) => {
        cy.request('GET', firstPlanetUrl).then((response) => {
          cy.fixture('swapi').as('swapi')
          cy.get('@swapi').then((swapi) => {
            expect(response.body.gravity).to.equal(swapi.firstPlanet.gravity)
            expect(response.body.terrain).to.equal(swapi.firstPlanet.terrain)
          })
        })
      })
    })
  })

  it('test 3 and 4', () => {
    cy.request('GET', '/people/2').then((response) => {
      return response.body.films[response.body.films.length - 1]
    }).then((lastFilmUrl) => {
      cy.request('GET', lastFilmUrl).then((response) => {
        return response.body.planets[0]
      }).then((firstPlanetUrl) => {
        cy.request('GET', firstPlanetUrl).then((response) => {
          cy.fixture('swapi').as('swapi')
          cy.get('@swapi').then((swapi) => {
            expect(response.body.gravity).to.equal(swapi.firstPlanetLastFilm.gravity)
            expect(response.body.terrain).to.equal(swapi.firstPlanetLastFilm.terrain)

            // queda pendiente validar la url, no consigo leerla del request del response
            // console.log(response.request)
            // expect(response.request.URL).to.equal(firstPlanetUrl)
            expect(response.body.url).to.equal(firstPlanetUrl)
          })
        })
      })
    })
  })

  it('test 5', () => {
    cy.request({
      method: 'GET',
      url: '/films/7',
      failOnStatusCode: false
    }).then((response) => {
      expect(response.status).to.equal(404)
    })
  })
})