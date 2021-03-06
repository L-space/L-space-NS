package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object sampleType extends PropertyDef(
        iri = "http://schema.org/sampleType",
        iris = Set("http://schema.org/sampleType"),
        label = "sampleType",
        comment = """What type of code sample: full (compile ready) solution, code snippet, inline code, scripts, template.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}