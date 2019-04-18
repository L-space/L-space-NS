package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object OrderAction
    extends OntologyDef(
      iri = "http://schema.org/OrderAction",
      iris = Set("http://schema.org/OrderAction"),
      label = "OrderAction",
      comment = """An agent orders an object/product/service to be delivered/sent.""",
      `@extends` = () => List(TradeAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.TradeAction.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.TradeAction.Properties {}
}