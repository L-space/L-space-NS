package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalDevicePurpose extends OntologyDef(
        iri = "http://schema.org/MedicalDevicePurpose",
        iris = Set("http://schema.org/MedicalDevicePurpose"),
        label = "MedicalDevicePurpose",
        comment = """Categories of medical devices, organized by the purpose or intended use of the device.""",
        `@extends` = List(MedicalEnumeration.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalEnumeration.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.MedicalEnumeration.Properties{

}
}