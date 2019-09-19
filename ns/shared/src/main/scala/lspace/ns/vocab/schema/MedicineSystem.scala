package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicineSystem extends OntologyDef(
        iri = "http://schema.org/MedicineSystem",
        iris = Set("http://schema.org/MedicineSystem"),
        label = "MedicineSystem",
        comment = """Systems of medical practice.""",
        `@extends` = () => List(MedicalEnumeration.ontology)
       ){
}