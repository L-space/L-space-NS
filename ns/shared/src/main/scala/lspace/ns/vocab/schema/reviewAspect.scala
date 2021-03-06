package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object reviewAspect extends PropertyDef(
        iri = "http://schema.org/reviewAspect",
        iris = Set("http://schema.org/reviewAspect"),
        label = "reviewAspect",
        comment = """This Review or Rating is relevant to this part or facet of the itemReviewed.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}