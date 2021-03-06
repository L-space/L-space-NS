package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object numberOfItems extends PropertyDef(
        iri = "http://schema.org/numberOfItems",
        iris = Set("http://schema.org/numberOfItems"),
        label = "numberOfItems",
        comment = """The number of items in an ItemList. Note that some descriptions might not fully describe all items in a list (e.g., multi-page pagination); in such cases, the numberOfItems would be for the entire list.""",
        `@extends` = List(),
        `@range` = List(`@int`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}