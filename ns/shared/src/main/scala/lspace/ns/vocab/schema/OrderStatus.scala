package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object OrderStatus extends OntologyDef(
        iri = "http://schema.org/OrderStatus",
        iris = Set("http://schema.org/OrderStatus"),
        label = "OrderStatus",
        comment = """Enumerated status values for Order.""",
        `@extends` = List(Enumeration.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Enumeration.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Enumeration.Properties{

}
}