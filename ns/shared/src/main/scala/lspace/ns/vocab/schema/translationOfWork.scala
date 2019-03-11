package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object translationOfWork extends PropertyDef(
        iri = "https://schema.org/translationOfWork",
        iris = Set("https://schema.org/translationOfWork"),
        label = "translationOfWork",
        comment = """The work that this work has been translated from. e.g. 物种起源 is a translationOf “On the Origin of Species”""",
        `@extends` = () => List(),
        `@range` = () => List(CreativeWork)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}