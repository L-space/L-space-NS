package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object VitalSign extends OntologyDef(
        iri = "http://schema.org/VitalSign",
        iris = Set("http://schema.org/VitalSign"),
        label = "VitalSign",
        comment = """Vital signs are measures of various physiological functions in order to assess the most basic body functions.""",
        `@extends` = List(MedicalSign.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalSign.Properties{

override lazy val possibleTreatment = lspace.ns.vocab.schema.possibleTreatment.property
override lazy val cause = lspace.ns.vocab.schema.cause.property}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.MedicalSign.Properties{

override lazy val possibleTreatment = lspace.ns.vocab.schema.possibleTreatment.property
override lazy val cause = lspace.ns.vocab.schema.cause.property}
}