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

    files { dir "public" }
  }
}
