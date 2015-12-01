package rocks.stevegood.lattice

class AppHelper {
  static def getAppIndex() {
    def env = System.getenv()
    env.CF_INSTANCE_INDEX ?: env.INSTANCE_INDEX ?: -1
  }
}
