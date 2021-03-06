package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object educationalRole extends PropertyDef(
        iri = "http://schema.org/educationalRole",
        iris = Set("http://schema.org/educationalRole"),
        label = "educationalRole",
        comment = """An educationalRole of an EducationalAudience.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}