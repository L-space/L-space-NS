package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Demand extends OntologyDef(
        iri = "http://schema.org/Demand",
        iris = Set("http://schema.org/Demand"),
        label = "Demand",
        comment = """A demand entity represents the public, not necessarily binding, not necessarily exclusive, announcement by an organization or person to seek a certain type of goods or services. For describing demand using this type, the very same properties used for Offer apply.""",
        `@extends` = List(Intangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val acceptedPaymentMethod = lspace.ns.vocab.schema.acceptedPaymentMethod.property
lazy val advanceBookingRequirement = lspace.ns.vocab.schema.advanceBookingRequirement.property
lazy val areaServed = lspace.ns.vocab.schema.areaServed.property
lazy val availability = lspace.ns.vocab.schema.availability.property
lazy val availabilityEnds = lspace.ns.vocab.schema.availabilityEnds.property
lazy val availabilityStarts = lspace.ns.vocab.schema.availabilityStarts.property
lazy val availableAtOrFrom = lspace.ns.vocab.schema.availableAtOrFrom.property
lazy val availableDeliveryMethod = lspace.ns.vocab.schema.availableDeliveryMethod.property
lazy val businessFunction = lspace.ns.vocab.schema.businessFunction.property
lazy val deliveryLeadTime = lspace.ns.vocab.schema.deliveryLeadTime.property
lazy val eligibleCustomerType = lspace.ns.vocab.schema.eligibleCustomerType.property
lazy val eligibleDuration = lspace.ns.vocab.schema.eligibleDuration.property
lazy val eligibleQuantity = lspace.ns.vocab.schema.eligibleQuantity.property
lazy val eligibleRegion = lspace.ns.vocab.schema.eligibleRegion.property
lazy val eligibleTransactionVolume = lspace.ns.vocab.schema.eligibleTransactionVolume.property
lazy val gtin12 = lspace.ns.vocab.schema.gtin12.property
lazy val gtin13 = lspace.ns.vocab.schema.gtin13.property
lazy val gtin14 = lspace.ns.vocab.schema.gtin14.property
lazy val gtin8 = lspace.ns.vocab.schema.gtin8.property
lazy val includesObject = lspace.ns.vocab.schema.includesObject.property
lazy val ineligibleRegion = lspace.ns.vocab.schema.ineligibleRegion.property
lazy val inventoryLevel = lspace.ns.vocab.schema.inventoryLevel.property
lazy val itemCondition = lspace.ns.vocab.schema.itemCondition.property
lazy val itemOffered = lspace.ns.vocab.schema.itemOffered.property
lazy val mpn = lspace.ns.vocab.schema.mpn.property
lazy val priceSpecification = lspace.ns.vocab.schema.priceSpecification.property
lazy val seller = lspace.ns.vocab.schema.seller.property
lazy val serialNumber = lspace.ns.vocab.schema.serialNumber.property
lazy val sku = lspace.ns.vocab.schema.sku.property
lazy val validFrom = lspace.ns.vocab.schema.validFrom.property
lazy val validThrough = lspace.ns.vocab.schema.validThrough.property
lazy val warranty = lspace.ns.vocab.schema.warranty.property
}
override lazy val properties: List[LProperty] = List(acceptedPaymentMethod, advanceBookingRequirement, areaServed, availability, availabilityEnds, availabilityStarts, availableAtOrFrom, availableDeliveryMethod, businessFunction, deliveryLeadTime, eligibleCustomerType, eligibleDuration, eligibleQuantity, eligibleRegion, eligibleTransactionVolume, gtin12, gtin13, gtin14, gtin8, includesObject, ineligibleRegion, inventoryLevel, itemCondition, itemOffered, mpn, priceSpecification, seller, serialNumber, sku, validFrom, validThrough, warranty)
trait Properties extends lspace.ns.vocab.schema.Intangible.Properties{
lazy val acceptedPaymentMethod = lspace.ns.vocab.schema.acceptedPaymentMethod.property
lazy val advanceBookingRequirement = lspace.ns.vocab.schema.advanceBookingRequirement.property
lazy val areaServed = lspace.ns.vocab.schema.areaServed.property
lazy val availability = lspace.ns.vocab.schema.availability.property
lazy val availabilityEnds = lspace.ns.vocab.schema.availabilityEnds.property
lazy val availabilityStarts = lspace.ns.vocab.schema.availabilityStarts.property
lazy val availableAtOrFrom = lspace.ns.vocab.schema.availableAtOrFrom.property
lazy val availableDeliveryMethod = lspace.ns.vocab.schema.availableDeliveryMethod.property
lazy val businessFunction = lspace.ns.vocab.schema.businessFunction.property
lazy val deliveryLeadTime = lspace.ns.vocab.schema.deliveryLeadTime.property
lazy val eligibleCustomerType = lspace.ns.vocab.schema.eligibleCustomerType.property
lazy val eligibleDuration = lspace.ns.vocab.schema.eligibleDuration.property
lazy val eligibleQuantity = lspace.ns.vocab.schema.eligibleQuantity.property
lazy val eligibleRegion = lspace.ns.vocab.schema.eligibleRegion.property
lazy val eligibleTransactionVolume = lspace.ns.vocab.schema.eligibleTransactionVolume.property
lazy val gtin12 = lspace.ns.vocab.schema.gtin12.property
lazy val gtin13 = lspace.ns.vocab.schema.gtin13.property
lazy val gtin14 = lspace.ns.vocab.schema.gtin14.property
lazy val gtin8 = lspace.ns.vocab.schema.gtin8.property
lazy val includesObject = lspace.ns.vocab.schema.includesObject.property
lazy val ineligibleRegion = lspace.ns.vocab.schema.ineligibleRegion.property
lazy val inventoryLevel = lspace.ns.vocab.schema.inventoryLevel.property
lazy val itemCondition = lspace.ns.vocab.schema.itemCondition.property
lazy val itemOffered = lspace.ns.vocab.schema.itemOffered.property
lazy val mpn = lspace.ns.vocab.schema.mpn.property
lazy val priceSpecification = lspace.ns.vocab.schema.priceSpecification.property
lazy val seller = lspace.ns.vocab.schema.seller.property
lazy val serialNumber = lspace.ns.vocab.schema.serialNumber.property
lazy val sku = lspace.ns.vocab.schema.sku.property
lazy val validFrom = lspace.ns.vocab.schema.validFrom.property
lazy val validThrough = lspace.ns.vocab.schema.validThrough.property
lazy val warranty = lspace.ns.vocab.schema.warranty.property
}
}