package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Text
    extends OntologyDef(
      iri = "http://schema.org/Text",
      iris = Set("http://schema.org/Text"),
      label = "",
      comment = """""",
      `@extends` = () => List()
    ) {
  object keys {}
  override lazy val properties: List[LProperty] = List()
  trait Properties {}
}
