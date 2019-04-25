package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TaxiStand
    extends OntologyDef(
      iri = "http://schema.org/TaxiStand",
      iris = Set("http://schema.org/TaxiStand"),
      label = "TaxiStand",
      comment = """A taxi stand.""",
      `@extends` = () => List(CivicStructure.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CivicStructure.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.CivicStructure.Properties {}
}
