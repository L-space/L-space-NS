package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Answer extends OntologyDef(
        iri = "http://schema.org/Answer",
        iris = Set("http://schema.org/Answer"),
        label = "Answer",
        comment = """An answer offered to a question; perhaps correct, perhaps opinionated or wrong.""",
        `@extends` = List(Comment.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Comment.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Comment.Properties{

}
}