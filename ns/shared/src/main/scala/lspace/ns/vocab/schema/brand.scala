package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object brand extends PropertyDef(
        iri = "http://schema.org/brand",
        iris = Set("http://schema.org/brand"),
        label = "brand",
        comment = """The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.""",
        `@extends` = List(),
        `@range` = List(Brand.ontology, Organization.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}