package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object recipient extends PropertyDef(
        iri = "http://schema.org/recipient",
        iris = Set("http://schema.org/recipient"),
        label = "recipient",
        comment = """A sub property of participant. The participant who is at the receiving end of the action.""",
        `@extends` = List(participant.property),
        `@range` = List(Person.ontology, Organization.ontology, ContactPoint.ontology, Audience.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.participant.Properties
}