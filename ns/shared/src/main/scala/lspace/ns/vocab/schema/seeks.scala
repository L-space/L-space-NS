package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object seeks extends PropertyDef(
        iri = "http://schema.org/seeks",
        iris = Set("http://schema.org/seeks"),
        label = "seeks",
        comment = """A pointer to products or services sought by the organization or person (demand).""",
        `@extends` = List(),
        `@range` = List(Demand.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}