import ratpack.groovy.template.MarkupTemplateModule
import rocks.stevegood.lattice.AppHelper
import static ratpack.groovy.Groovy.groovyMarkupTemplate
import static ratpack.groovy.Groovy.ratpack

def start = new Date()

ratpack {
  bindings {
    module MarkupTemplateModule
  }

  handlers {
    get {
      def appIndex = AppHelper.getAppIndex()
      render groovyMarkupTemplate("index.gtpl", title: "My Ratpack App", appIndex: appIndex, uptime: (new Date().time - start.time)/1000)
    }

    get('env') {
      def env = System.getenv()
      def envSet = []
      env.each { k,v ->
        envSet << [k:k, v:v]
      }
      render groovyMarkupTemplate('env.gtpl', envVars: envSet)
    }

    get('exit') {
      def appIndex = AppHelper.getAppIndex()
      render groovyMarkupTemplate('exit.gtpl', appIndex: appIndex, uptime: (new Date().time - start.time)/1000)
      println 'Ratpack application shutting down...'
      Thread.sleep 1000
      System.exit 1
    }

    files { dir "public" }
  }
}
