package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object WarrantyPromise extends OntologyDef(
        iri = "http://schema.org/WarrantyPromise",
        iris = Set("http://schema.org/WarrantyPromise"),
        label = "WarrantyPromise",
        comment = """A structured value representing the duration and scope of services that will be provided to a customer free of charge in case of a defect or malfunction of a product.""",
        `@extends` = List(StructuredValue.ontology)
       ){
object keys extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val durationOfWarranty = lspace.ns.vocab.schema.durationOfWarranty.property
lazy val warrantyScope = lspace.ns.vocab.schema.warrantyScope.property
}
override lazy val properties: List[LProperty] = List(durationOfWarranty, warrantyScope)
trait Properties extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val durationOfWarranty = lspace.ns.vocab.schema.durationOfWarranty.property
lazy val warrantyScope = lspace.ns.vocab.schema.warrantyScope.property
}
}