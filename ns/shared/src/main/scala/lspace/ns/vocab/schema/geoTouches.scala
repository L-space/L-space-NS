package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object geoTouches extends PropertyDef(
        iri = "http://schema.org/geoTouches",
        iris = Set("http://schema.org/geoTouches"),
        label = "geoTouches",
        comment = """Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points." (a symmetric relationship, as defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a> )""",
        `@extends` = List(),
        `@range` = List(Place.ontology, GeospatialGeometry.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}