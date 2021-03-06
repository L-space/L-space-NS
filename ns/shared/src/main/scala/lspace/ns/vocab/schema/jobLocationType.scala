package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object jobLocationType extends PropertyDef(
        iri = "http://schema.org/jobLocationType",
        iris = Set("http://schema.org/jobLocationType"),
        label = "jobLocationType",
        comment = """A description of the job location (e.g TELECOMMUTE for telecommute jobs).""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}