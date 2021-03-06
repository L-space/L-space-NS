package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object trackingNumber extends PropertyDef(
        iri = "http://schema.org/trackingNumber",
        iris = Set("http://schema.org/trackingNumber"),
        label = "trackingNumber",
        comment = """Shipper tracking number.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}