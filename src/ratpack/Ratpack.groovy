import ratpack.groovy.template.MarkupTemplateModule
import rocks.stevegood.lattice.AppHelper
import static ratpack.groovy.Groovy.groovyMarkupTemplate
import static ratpack.groovy.Groovy.ratpack

ratpack {
  bindings {
    module MarkupTemplateModule
  }

  handlers {
    get {
      def appIndex = AppHelper.getAppIndex()
      render groovyMarkupTemplate("index.gtpl", title: "My Ratpack App", appIndex: appIndex)
    }

    files { dir "public" }
  }
}
