package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LodgingReservation extends OntologyDef(
        iri = "http://schema.org/LodgingReservation",
        iris = Set("http://schema.org/LodgingReservation"),
        label = "LodgingReservation",
        comment = """A reservation for lodging at a hotel, motel, inn, etc.<br/><br/>

Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.""",
        `@extends` = List(Reservation.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Reservation.Properties{
lazy val checkinTime = lspace.ns.vocab.schema.checkinTime.property
lazy val checkoutTime = lspace.ns.vocab.schema.checkoutTime.property
lazy val lodgingUnitDescription = lspace.ns.vocab.schema.lodgingUnitDescription.property
lazy val lodgingUnitType = lspace.ns.vocab.schema.lodgingUnitType.property
lazy val numAdults = lspace.ns.vocab.schema.numAdults.property
lazy val numChildren = lspace.ns.vocab.schema.numChildren.property
}
override lazy val properties: List[LProperty] = List(checkinTime, checkoutTime, lodgingUnitDescription, lodgingUnitType, numAdults, numChildren)
trait Properties extends lspace.ns.vocab.schema.Reservation.Properties{
lazy val checkinTime = lspace.ns.vocab.schema.checkinTime.property
lazy val checkoutTime = lspace.ns.vocab.schema.checkoutTime.property
lazy val lodgingUnitDescription = lspace.ns.vocab.schema.lodgingUnitDescription.property
lazy val lodgingUnitType = lspace.ns.vocab.schema.lodgingUnitType.property
lazy val numAdults = lspace.ns.vocab.schema.numAdults.property
lazy val numChildren = lspace.ns.vocab.schema.numChildren.property
}
}