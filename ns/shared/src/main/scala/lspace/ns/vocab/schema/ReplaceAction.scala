package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ReplaceAction extends OntologyDef(
        iri = "http://schema.org/ReplaceAction",
        iris = Set("http://schema.org/ReplaceAction"),
        label = "ReplaceAction",
        comment = """The act of editing a recipient by replacing an old object with a new object.""",
        `@extends` = () => List(UpdateAction.ontology)
       ){
}