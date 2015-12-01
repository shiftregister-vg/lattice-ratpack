yieldUnescaped '<!DOCTYPE html>'
html {
  head {
    meta(charset:'utf-8')
    title("Ratpack: $title")

    meta(name: 'apple-mobile-web-app-title', content: 'Ratpack')
    meta(name: 'description', content: '')
    meta(name: 'viewport', content: 'width=device-width, initial-scale=1')

    link(href: '/images/favicon.ico', rel: 'shortcut icon')
    link(href: '/styles/main.css', rel: 'stylesheet')
  }
  body(class: '') {
    div(class: 'my-index', 'My Index Is')
    div(class: 'index', "${appIndex}")
    div(class: 'mid-color', "Uptime: ${uptime}s")
    div(class: 'bottom-color', '')
  }
}
