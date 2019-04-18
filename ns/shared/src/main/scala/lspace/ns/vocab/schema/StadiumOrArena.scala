package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object StadiumOrArena
    extends OntologyDef(
      iri = "http://schema.org/StadiumOrArena",
      iris = Set("http://schema.org/StadiumOrArena"),
      label = "StadiumOrArena",
      comment = """A stadium.""",
      `@extends` = () => List(CivicStructure.ontology, SportsActivityLocation.ontology)
    ) {
  object keys
      extends lspace.ns.vocab.schema.CivicStructure.Properties
      with lspace.ns.vocab.schema.SportsActivityLocation.Properties {

    override lazy val openingHours = lspace.ns.vocab.schema.openingHours.property
    override lazy val events       = lspace.ns.vocab.schema.events.property
    override lazy val slogan       = lspace.ns.vocab.schema.slogan.property
    override lazy val event        = lspace.ns.vocab.schema.event.property
    override lazy val logo         = lspace.ns.vocab.schema.logo.property
    override lazy val telephone    = lspace.ns.vocab.schema.telephone.property
    override lazy val isicV4       = lspace.ns.vocab.schema.isicV4.property
    override lazy val review       = lspace.ns.vocab.schema.review.property
  }
  override lazy val properties: List[Property] = List()
  trait Properties
      extends lspace.ns.vocab.schema.CivicStructure.Properties
      with lspace.ns.vocab.schema.SportsActivityLocation.Properties {

    override lazy val openingHours = lspace.ns.vocab.schema.openingHours.property
    override lazy val events       = lspace.ns.vocab.schema.events.property
    override lazy val slogan       = lspace.ns.vocab.schema.slogan.property
    override lazy val event        = lspace.ns.vocab.schema.event.property
    override lazy val logo         = lspace.ns.vocab.schema.logo.property
    override lazy val telephone    = lspace.ns.vocab.schema.telephone.property
    override lazy val isicV4       = lspace.ns.vocab.schema.isicV4.property
    override lazy val review       = lspace.ns.vocab.schema.review.property
  }
}