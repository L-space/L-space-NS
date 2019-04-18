package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object doseUnit
    extends PropertyDef(
      iri = "http://schema.org/doseUnit",
      iris = Set("http://schema.org/doseUnit"),
      label = "doseUnit",
      comment = """The unit of the dose, e.g. 'mg'.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}