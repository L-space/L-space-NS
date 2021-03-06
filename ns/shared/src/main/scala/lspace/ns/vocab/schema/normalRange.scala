package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object normalRange extends PropertyDef(
        iri = "http://schema.org/normalRange",
        iris = Set("http://schema.org/normalRange"),
        label = "normalRange",
        comment = """Range of acceptable values for a typical patient, when applicable.""",
        `@extends` = List(),
        `@range` = List(`@string`, MedicalEnumeration.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}