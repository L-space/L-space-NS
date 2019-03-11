package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object subEvents extends PropertyDef(
        iri = "https://schema.org/subEvents",
        iris = Set("https://schema.org/subEvents"),
        label = "subEvents",
        comment = """Events that are a part of this event. For example, a conference event includes many presentations, each subEvents of the conference.""",
        `@extends` = () => List(),
        `@range` = () => List(Event)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}