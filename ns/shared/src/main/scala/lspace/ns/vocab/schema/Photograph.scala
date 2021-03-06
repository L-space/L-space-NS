package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Photograph extends OntologyDef(
        iri = "http://schema.org/Photograph",
        iris = Set("http://schema.org/Photograph"),
        label = "Photograph",
        comment = """A photograph.""",
        `@extends` = List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{

}
}