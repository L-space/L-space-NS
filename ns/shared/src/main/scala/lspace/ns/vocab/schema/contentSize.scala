package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object contentSize extends PropertyDef(
        iri = "http://schema.org/contentSize",
        iris = Set("http://schema.org/contentSize"),
        label = "contentSize",
        comment = """File size in (mega/kilo) bytes.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}