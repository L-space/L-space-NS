package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Report extends OntologyDef(
        iri = "http://schema.org/Report",
        iris = Set("http://schema.org/Report"),
        label = "Report",
        comment = """A Report generated by governmental or non-governmental organization.""",
        `@extends` = () => List(Article.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Article.Properties{
lazy val reportNumber = lspace.ns.vocab.schema.reportNumber.property
}
override lazy val properties: List[LProperty] = List(reportNumber)
trait Properties extends lspace.ns.vocab.schema.Article.Properties{
lazy val reportNumber = lspace.ns.vocab.schema.reportNumber.property
}
}