package scala.js.gen.js.dom

import scala.js.exp.dom.ElementOpsExp
import scala.js.gen.js._

trait GenElementOps extends GenEffect with GenFunctions with GenOptionOps with GenIfThenElse with GenFFI {
  val IR: ElementOpsExp
}