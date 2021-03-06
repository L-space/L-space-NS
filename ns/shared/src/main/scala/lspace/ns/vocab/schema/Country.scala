package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Country extends OntologyDef(
        iri = "http://schema.org/Country",
        iris = Set("http://schema.org/Country"),
        label = "Country",
        comment = """A country.""",
        `@extends` = List(AdministrativeArea.ontology)
       ){
object keys extends lspace.ns.vocab.schema.AdministrativeArea.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.AdministrativeArea.Properties{

}
}