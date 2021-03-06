package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object broadcastFrequency extends PropertyDef(
        iri = "http://schema.org/broadcastFrequency",
        iris = Set("http://schema.org/broadcastFrequency"),
        label = "broadcastFrequency",
        comment = """The frequency used for over-the-air broadcasts. Numeric values or simple ranges e.g. 87-99. In addition a shortcut idiom is supported for frequences of AM and FM radio channels, e.g. "87 FM".""",
        `@extends` = List(),
        `@range` = List(BroadcastFrequencySpecification.ontology, `@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}