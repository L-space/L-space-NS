package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object GameServerStatus extends OntologyDef(
        iri = "http://schema.org/GameServerStatus",
        iris = Set("http://schema.org/GameServerStatus"),
        label = "GameServerStatus",
        comment = """Status of a game server.""",
        `@extends` = List(Enumeration.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Enumeration.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Enumeration.Properties{

}
}