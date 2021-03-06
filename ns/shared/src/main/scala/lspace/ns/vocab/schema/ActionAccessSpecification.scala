package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ActionAccessSpecification extends OntologyDef(
        iri = "http://schema.org/ActionAccessSpecification",
        iris = Set("http://schema.org/ActionAccessSpecification"),
        label = "ActionAccessSpecification",
        comment = """A set of requirements that a must be fulfilled in order to perform an Action.""",
        `@extends` = List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val availabilityEnds = lspace.ns.vocab.schema.availabilityEnds.property
lazy val availabilityStarts = lspace.ns.vocab.schema.availabilityStarts.property
lazy val category = lspace.ns.vocab.schema.category.property
lazy val eligibleRegion = lspace.ns.vocab.schema.eligibleRegion.property
lazy val expectsAcceptanceOf = lspace.ns.vocab.schema.expectsAcceptanceOf.property
lazy val requiresSubscription = lspace.ns.vocab.schema.requiresSubscription.property
}
override lazy val properties: List[LProperty] = List(availabilityEnds, availabilityStarts, category, eligibleRegion, expectsAcceptanceOf, requiresSubscription)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val availabilityEnds = lspace.ns.vocab.schema.availabilityEnds.property
lazy val availabilityStarts = lspace.ns.vocab.schema.availabilityStarts.property
lazy val category = lspace.ns.vocab.schema.category.property
lazy val eligibleRegion = lspace.ns.vocab.schema.eligibleRegion.property
lazy val expectsAcceptanceOf = lspace.ns.vocab.schema.expectsAcceptanceOf.property
lazy val requiresSubscription = lspace.ns.vocab.schema.requiresSubscription.property
}
}