package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PaymentStatusType extends OntologyDef(
        iri = "http://schema.org/PaymentStatusType",
        iris = Set("http://schema.org/PaymentStatusType"),
        label = "PaymentStatusType",
        comment = """A specific payment status. For example, PaymentDue, PaymentComplete, etc.""",
        `@extends` = List(Enumeration.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Enumeration.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Enumeration.Properties{

}
}