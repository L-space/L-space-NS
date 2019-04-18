package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object includedInHealthInsurancePlan
    extends PropertyDef(
      iri = "http://schema.org/includedInHealthInsurancePlan",
      iris = Set("http://schema.org/includedInHealthInsurancePlan"),
      label = "includedInHealthInsurancePlan",
      comment = """The insurance plans that cover this drug.""",
      `@extends` = () => List(),
      `@range` = () => List()
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}