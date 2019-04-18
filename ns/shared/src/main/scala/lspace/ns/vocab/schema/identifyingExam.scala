package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object identifyingExam
    extends PropertyDef(
      iri = "http://schema.org/identifyingExam",
      iris = Set("http://schema.org/identifyingExam"),
      label = "identifyingExam",
      comment = """A physical examination that can identify this sign.""",
      `@extends` = () => List(),
      `@range` = () => List()
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}