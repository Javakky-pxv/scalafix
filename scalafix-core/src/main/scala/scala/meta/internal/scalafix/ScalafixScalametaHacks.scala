package scala.meta.internal.scalafix

import scala.meta.Dialect
import scala.meta.Tree
import scala.meta.dialects
import scala.meta.internal.semanticdb.Scala.Names
import scala.meta.internal.trees.Origin

object ScalafixScalametaHacks {
  def dialect(language: String): Dialect =
    if (language == "Scala") dialects.Scala212
    else if (language.isEmpty) dialects.Scala212
    else Dialect.standards(language)
  def resetOrigin(tree: Tree): Tree = tree.withOrigin(Origin.None)
  def encode(name: String): String = Names.encode(name)
}
