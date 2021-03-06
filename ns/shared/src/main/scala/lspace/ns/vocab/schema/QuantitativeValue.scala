package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object QuantitativeValue extends OntologyDef(
        iri = "http://schema.org/QuantitativeValue",
        iris = Set("http://schema.org/QuantitativeValue"),
        label = "QuantitativeValue",
        comment = """A point value or interval for product characteristics and other purposes.""",
        `@extends` = List(StructuredValue.ontology)
       ){
object keys extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val additionalProperty = lspace.ns.vocab.schema.additionalProperty.property
lazy val maxValue = lspace.ns.vocab.schema.maxValue.property
lazy val minValue = lspace.ns.vocab.schema.minValue.property
lazy val unitCode = lspace.ns.vocab.schema.unitCode.property
lazy val unitText = lspace.ns.vocab.schema.unitText.property
lazy val value = lspace.ns.vocab.schema.value.property
lazy val valueReference = lspace.ns.vocab.schema.valueReference.property
}
override lazy val properties: List[LProperty] = List(additionalProperty, maxValue, minValue, unitCode, unitText, value, valueReference)
trait Properties extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val additionalProperty = lspace.ns.vocab.schema.additionalProperty.property
lazy val maxValue = lspace.ns.vocab.schema.maxValue.property
lazy val minValue = lspace.ns.vocab.schema.minValue.property
lazy val unitCode = lspace.ns.vocab.schema.unitCode.property
lazy val unitText = lspace.ns.vocab.schema.unitText.property
lazy val value = lspace.ns.vocab.schema.value.property
lazy val valueReference = lspace.ns.vocab.schema.valueReference.property
}
}