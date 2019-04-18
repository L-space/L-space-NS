package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object purpose
    extends PropertyDef(
      iri = "http://schema.org/purpose",
      iris = Set("http://schema.org/purpose"),
      label = "purpose",
      comment = """A goal towards an action is taken. Can be concrete or abstract.""",
      `@extends` = () => List(),
      `@range` = () => List(Thing.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}