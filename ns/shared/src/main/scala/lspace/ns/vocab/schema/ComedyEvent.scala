package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ComedyEvent extends OntologyDef(
        iri = "http://schema.org/ComedyEvent",
        iris = Set("http://schema.org/ComedyEvent"),
        label = "ComedyEvent",
        comment = """Event type: Comedy event.""",
        `@extends` = () => List(Event.ontology)
       ){
}