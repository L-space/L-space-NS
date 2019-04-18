package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object educationalRole
    extends PropertyDef(
      iri = "http://schema.org/educationalRole",
      iris = Set("http://schema.org/educationalRole"),
      label = "educationalRole",
      comment = """An educationalRole of an EducationalAudience.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}