yieldUnescaped '<!DOCTYPE html>'
html {
  head {
    meta(charset:'utf-8')
    title("Ratpack: Environment Variables")

    meta(name: 'apple-mobile-web-app-title', content: 'Ratpack')
    meta(name: 'description', content: '')
    meta(name: 'viewport', content: 'width=device-width, initial-scale=1')

    link(href: '/images/favicon.ico', rel: 'shortcut icon')
    link(href: '/styles/main.css', rel: 'stylesheet')
  }
  body(class: '') {
    div(class: 'envs') {
      dl {
        envVars.each {
          dt it.k
          dd it.v
        }
      }
    }
  }
}
